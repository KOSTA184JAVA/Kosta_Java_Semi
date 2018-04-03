package kosta.matchat.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dto.Member;
import kosta.matchat.model.dto.Restaurant;

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
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Restaurant> searchByOrderStoreSP(String StoreKind) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Restaurant> searchByDeliv(String StoreKind) throws SQLException {
		// TODO Auto-generated method stub
		return null;
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
