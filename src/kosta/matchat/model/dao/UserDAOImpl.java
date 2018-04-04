package kosta.matchat.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kosta.matchat.model.dto.Member;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.model.util.DBUtil;

public class UserDAOImpl implements UserDAO {
	
	//ΩÃ±€≈Ê
	private UserDAOImpl() {}
	public static UserDAOImpl instance = new UserDAOImpl();
	public static UserDAOImpl getInstance() {
		return instance;
	}
	
	@Override
	public int joinMember(Member member) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int quitMember(String memberId, String memberPassword) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int loginMember(String memberId, String memberPassword) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int checkDuplicateId(String memberId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Restaurant> searchByStoreName(String stroeName) throws SQLException {
		// TODO Auto-generated method stub
		return null;
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
				list.add(new Restaurant(resKind, resName, resAddr, resPhone, resDeliv, resSP+"", resID));
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
			ps = con.prepareStatement("select * from restaurant where restaur_kind = ? order by restaur_point DESC");
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
				list.add(new Restaurant(resKind, resName, resAddr, resPhone, resDeliv, resSP+"", resID));
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
				list.add(new Restaurant(resKind, resName, resAddr, resPhone, resDeliv, resSP+"", resID));
			}
		}finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return list;
	}
	@Override
	public int insertFavorite(int storeId, String memberId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Restaurant> searchFavorites(String memberId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int insertStarPoint(int storeId, int score) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
