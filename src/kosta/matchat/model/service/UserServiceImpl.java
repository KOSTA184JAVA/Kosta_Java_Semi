package kosta.matchat.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dao.UserDAO;
import kosta.matchat.model.dao.UserDAOImpl;
import kosta.matchat.model.dto.Member;
import kosta.matchat.model.dto.Restaurant;

public class UserServiceImpl implements UserService {

	//싱글톤
	private UserServiceImpl() {}
	public static UserServiceImpl instance = new UserServiceImpl();
	public static UserServiceImpl getInstance() {
		return instance;
	}
	UserDAO uDao = UserDAOImpl.getInstance();
	
	@Override
	public void joinMember(Member member) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void quitMember(String memberId, String memberPassword) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void loginMember(String memberId, String memberPassword) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkDuplicateId(String memberId) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Restaurant> searchByStoreName(String stroeName) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Restaurant> searchByStoreKind(String StoreKind) throws SQLException {
		List<Restaurant> list = uDao.searchByStoreKind(StoreKind);
		if(list != null && !list.isEmpty()) {
			return list;
		}else {
			throw new SQLException("검색 결과가 없습니다.");
		}
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
	public void insertFavorite(int storeId, String memberId) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Restaurant> searchFavorites(String memberId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insertStarPoint(int storeId, int score) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	

}
