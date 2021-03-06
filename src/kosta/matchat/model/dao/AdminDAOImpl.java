package kosta.matchat.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.model.util.DBUtil;
/**
 * 관리자 기능 DAO
 */
public class AdminDAOImpl implements AdminDAO {
	
	//싱글톤
	private AdminDAOImpl() {}
	public static AdminDAOImpl instance = new AdminDAOImpl();
	public static AdminDAOImpl getInstance() {
		return instance;
	}
	@Override
	public int insertStore(Restaurant restaurant) throws SQLException {
		Connection con = null;
		PreparedStatement ps=null;
		try {
			con=DBUtil.getConnection();
				
			ps=con.prepareStatement("INSERT INTO RESTAURANT (SEQ_RESTAUR_ID, RESTAUR_KIND, RESTAUR_NAME, RESTAUR_ADDRESS, RESTAUR_PHONE, RESTAUR_DELIVER, RESTAUR_POINT) VALUES "
					+ "(SEQ_RESTAUR_ID.NEXTVAL,?,?,?,?,?,?)");
			ps.setString(1, restaurant.getResKind());
			ps.setString(2, restaurant.getResName());
			ps.setString(3, restaurant.getResAddr());
			ps.setString(4, restaurant.getResPhone());
			ps.setString(5, restaurant.getResDeliv());
			ps.setInt(6, restaurant.getResSp());
			
			return ps.executeUpdate();
			
		}finally {
			DBUtil.dbClose(con, ps);
		}
	}
	@Override
	public int deleteStore(int[] StoreIds) throws SQLException {
		Connection con=null;
		PreparedStatement ps = null;
		int result=0;
		String sql="DELETE FROM RESTAURANT WHERE SEQ_RESTAUR_ID IN (";  //다영 : 매개변수 StoreId -> String[] ids 변경
		try {
			for(int i=0; i<StoreIds.length; i++) {
				if(i==(StoreIds.length-1)) {
					sql+="?)";
				}else {
					sql+="?,";  //sql구문 추가
				}
			}	
			con=DBUtil.getConnection();
			ps=con.prepareStatement(sql);
				for(int u=0; u<StoreIds.length; u++) {
					ps.setInt(u+1, StoreIds[u]);
				}
		result = ps.executeUpdate();
		}finally {
			if(result == StoreIds.length) con.commit();  //모두 삭제되었다면 삭제 확정 진행
			else con.rollback();
			
			DBUtil.dbClose(con, ps);
		}
	return result;	
	}
	@Override
	public int updateStore(Restaurant restaurant) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=DBUtil.getConnection();
			ps=con.prepareStatement("UPDATE RESTAURANT SET RESTAUR_KIND=?, RESTAUR_NAME=?, RESTAUR_ADDRESS=?, "
					+ "RESTAUR_PHONE=?, RESTAUR_DELIVER=?, RESTAUR_POINT=? WHERE SEQ_RESTAUR_ID=? ");
			ps.setString(1, restaurant.getResKind());
			ps.setString(2, restaurant.getResName());
			ps.setString(3, restaurant.getResAddr());
			ps.setString(4, restaurant.getResPhone());
			ps.setString(5, restaurant.getResDeliv());
			ps.setInt(6, restaurant.getResSp());
			ps.setInt(7, restaurant.getResId());
			
			return ps.executeUpdate();
			
		}finally {
			DBUtil.dbClose(con, ps);
		}
	}
	@Override
	public int insertMenu(int storeId, Menu menu) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
			try {
				con = DBUtil.getConnection();
				ps = con.prepareStatement("insert into menu values(SEQ_MENU_ID.nextval, ?, ?, ?, ?, ?, ?)");
					ps.setInt(1, storeId);
					ps.setString(2, menu.getName());
					ps.setInt(3, menu.getPrice());
					ps.setString(4, menu.getDesc());
					ps.setInt(5, menu.getKcal());
					ps.setString(6, menu.getSource());
				return ps.executeUpdate();
			}finally {
				DBUtil.dbClose(con, ps);
			}
	}
	@Override
	public int deleteMenu(int storeId, int menuId) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;		
		String sql = "delete menu where SEQ_RESTAUR_ID=? and SEQ_menu_ID=?";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
				ps.setInt(1, storeId);
				ps.setInt(2, menuId);
			return ps.executeUpdate();
		}finally {
			DBUtil.dbClose(con, ps);
		}
	}
	@Override
	public List<Restaurant> searchTotalList() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Restaurant> list = new ArrayList<>();
		String sql = "select * from RESTAURANT";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(
					new Restaurant(
						rs.getInt("SEQ_RESTAUR_ID"),
						rs.getString("RESTAUR_KIND"),
						rs.getString("RESTAUR_NAME"),
						rs.getString("RESTAUR_ADDRESS"),
						rs.getString("RESTAUR_PHONE"),
						rs.getString("RESTAUR_DELIVER"),
						rs.getInt("RESTAUR_POINT")
				));
			}
		}finally {
			DBUtil.dbClose(con, ps, rs);
		}
	return list;
	}
	@Override
	public int SearchStoreId() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;		
		String sql = "select seq_restaur_id from restaurant where rownum=1 order by seq_restaur_id desc";
		ResultSet rs= null;
		int i=0;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				i= rs.getInt("SEQ_RESTAUR_ID");
			}
			
		}finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return i;
	}
}
