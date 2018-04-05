package kosta.matchat.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kosta.matchat.model.dto.Member;
import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.model.util.DBUtil;

public class UserDAOImpl implements UserDAO {

	// 싱글톤
	private UserDAOImpl() {
	}

	public static UserDAOImpl instance = new UserDAOImpl();

	public static UserDAOImpl getInstance() {
		return instance;
	}

	@Override
	public int joinMember(Member member) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int i;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("insert into member values (?, ? ,? ,? ,?)");
			ps.setString(1, member.getId());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getName());
			ps.setString(4, member.getPassword());
			ps.setString(5, member.getAddr());
			i = ps.executeUpdate();
		} finally {
			DBUtil.dbClose(con, ps);
		}
		return i;
	}

	@Override
	public int quitMember(String memberId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int i = 0;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("delete from member where member_id=?");
			ps.setString(1, memberId);
			
			i = ps.executeUpdate();
		} finally {
			DBUtil.dbClose(con, ps);
		}
		return i;

	}

	@Override
	public int loginMember(String memberId, String memberPassword) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select * from member where member_id=? and member_password=?");
			ps.setString(1, memberId);
			ps.setString(2, memberPassword);
			rs = ps.executeQuery();

			if (rs.next()) {
				return 1; // 로그인성공
			} else {
				return 0; // 로그인실패
			}

		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
	}

	@Override
	public int checkDuplicateId(String memberId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//int i =0;
		try {
			
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select * from member where member_id=?");
			ps.setString(1, memberId);
			rs = ps.executeQuery();

			if(rs.next()) return 1;

		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
		System.out.println();
	return 0 ;
	}

	@Override
	public List<Restaurant> searchByStoreName(String storeName) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		try {
			String sql = "select seq_restaur_id, restaur_kind, restaur_name, restaur_address, restaur_phone, restaur_deliver, restaur_point "
					+ "from restaurant " 
					+ "where restaur_name like ? " 
					+ "order by restaurant.seq_restaur_id";

			String keyword = "%" + storeName + "%";

			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, keyword);
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new Restaurant(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7)));
			}

		} finally {
			DBUtil.dbClose(con, ps, rs);
		}

		return list;
	}

	@Override
	public List<Restaurant> searchByStoreKind(String StoreKind) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select * from restaurant where restaur_kind = ?");
			ps.setString(1, StoreKind);
			rs = ps.executeQuery();
			while(rs.next()) {
				int resID = rs.getInt("seq_restaur_id");
				String resKind = rs.getString("restaur_kind");
				String resName = rs.getString("restaur_name");
				String resAddr = rs.getString("restaur_address");
				String resPhone = rs.getString("restaur_phone");
				String resDeliv = rs.getString("restaur_deliver");
				int resSP = rs.getInt("restaur_point");
				list.add(new Restaurant(resID, resKind, resName, resAddr, resPhone, resDeliv, resSP));
			}
		}finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return list;
	}

	@Override
	public List<Restaurant> searchByOrderStoreSP(String StoreKind) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select * from restaurant where restaur_kind = ? order by restaur_point ASC");
			ps.setString(1, StoreKind);
			rs = ps.executeQuery();
			while(rs.next()) {
				int resID = rs.getInt("seq_restaur_id");
				String resKind = rs.getString("restaur_kind");
				String resName = rs.getString("restaur_name");
				String resAddr = rs.getString("restaur_address");
				String resPhone = rs.getString("restaur_phone");
				String resDeliv = rs.getString("restaur_deliver");
				int resSP = rs.getInt("restaur_point");
				list.add(new Restaurant(resID, resKind, resName, resAddr, resPhone, resDeliv, resSP));
			}
		}finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return list;
	}

	@Override
	public List<Restaurant> searchByDeliv(String StoreKind) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select * from restaurant where restaur_kind = ? AND restaur_deliver = 'O'");
			ps.setString(1, StoreKind);
			rs = ps.executeQuery();
			while(rs.next()) {
				int resID = rs.getInt("seq_restaur_id");
				String resKind = rs.getString("restaur_kind");
				String resName = rs.getString("restaur_name");
				String resAddr = rs.getString("restaur_address");
				String resPhone = rs.getString("restaur_phone");
				String resDeliv = rs.getString("restaur_deliver");
				int resSP = rs.getInt("restaur_point");
				list.add(new Restaurant(resID, resKind, resName, resAddr, resPhone, resDeliv, resSP));
			}
		}finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return list;
	}

	@Override
	public int insertFavorite(int storeId, String memberId) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=DBUtil.getConnection();
			ps = con.prepareStatement("insert into FAVORITIES  values (?,?)");
			ps.setString(1, memberId);
			ps.setInt(2, storeId);
			return ps.executeUpdate();
		} finally {
			DBUtil.dbClose(con, ps);
		}
	}

	@Override
	public List<Restaurant> searchFavorites(String memberId) throws SQLException {
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(" select * from RESTAURANT where seq_restaur_id IN (select seq_restaur_id from FAVORITIES where member_id = ?)");
			ps.setString(1, memberId);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Restaurant(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7)));
			}
		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return list;
	}

	@Override
	public int insertStarPoint(int storeId, int score) throws SQLException {
		Connection con = null;
		PreparedStatement ps =null;
		try {
			con= DBUtil.getConnection();
			String sql = "update RESTAURANT set restaur_point = "+score+" where seq_restaur_id = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, storeId);
			return ps.executeUpdate();
		} finally {
			DBUtil.dbClose(con, ps);
		}
	}

	@Override
	public List<Menu> searchMenuList(int storeId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Menu> list = new ArrayList<>();
		try {
			String sql = "select seq_menu_id, menu_name, menu_price, menu_desc, menu_kcal, menu_source " 
		            + "from menu "
					+ "where seq_restaur_id = (select seq_restaur_id from restaurant where seq_restaur_id = ?)";

			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, storeId);
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new Menu(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5),
						rs.getString(6)));
			}
		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return list;
	}

}
