package kosta.matchat.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dao.UserDAOImpl;
import kosta.matchat.model.dto.Member;
import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;

public class UserServiceImpl implements UserService {
	private UserDAOImpl uDao = UserDAOImpl.getInstance();

	// 싱글톤
	private UserServiceImpl() {
	}

	public static UserServiceImpl instance = new UserServiceImpl();

	public static UserServiceImpl getInstance() {
		return instance;
	}

	@Override
	public void joinMember(Member member) throws SQLException {
		int i = uDao.joinMember(member);
		if (i > 0) {
			// 가입성공
		} else {
			// 가입실패
			throw new SQLException("회원가입에 실패하였습니다");
		}
	}

	@Override
	public void quitMember(String memberId) throws SQLException {
		int i = uDao.quitMember(memberId);
		if (i > 0) {
			// 탈퇴성공
		} else {
			// 탈퇴실패
			throw new SQLException("회원탈퇴에 실패하였습니다. 아이디와 패스워드를 확인해주세요.");
		}
	}

	@Override
	public void loginMember(String memberId, String memberPassword) throws SQLException {
		if(memberId == null || memberPassword == null) {
			throw new SQLException("빈칸을 모두 채워주세요.");
		}
		int i = uDao.loginMember(memberId, memberPassword);
		if (i > 0) {
			// 로그인성공
		} else {
			// 로그인실패
			throw new SQLException("로그인에 실패하였습니다. 아이디와 패스워드를 확인해 주세요.");
		}
	}

	@Override
	public int checkDuplicateId(String memberId) throws SQLException {
		int i = uDao.checkDuplicateId(memberId);
		if (i > 0) {
			// 아이디중복
			System.out.println("ser"+i);
			throw new SQLException(memberId + "는 이미 사용중인 아이디입니다.");
			
		}
		
		return i;
	}

	@Override
	public List<Restaurant> searchByStoreName(String storeName) throws SQLException {
		List<Restaurant> list = uDao.searchByStoreName(storeName);
		if (list.size() > 0) {
			//성공
			return list;
		} else {
			//실패
			throw new SQLException(storeName + "검색결과가 존재하지 않습니다.");
		}
	}

	@Override
	public List<Restaurant> searchByStoreKind(String StoreKind) throws SQLException {
		List<Restaurant> list = uDao.searchByStoreKind(StoreKind);
		if(list.size() > 0) {
			//성공
			return list;
		}else {
			//실패
			throw new SQLException("검색 결과가 없습니다.");
		}
	}

	@Override
	public List<Restaurant> searchByOrderStoreSP(String StoreKind) throws SQLException {
		List<Restaurant> list = uDao.searchByOrderStoreSP(StoreKind);
		if(list.size() > 0) {
			//성공
			return list;
		}else {
			//실패
			throw new SQLException("검색 결과가 없습니다.");
		}
	}

	@Override
	public List<Restaurant> searchByDeliv(String StoreKind) throws SQLException {
		List<Restaurant> list = uDao.searchByDeliv(StoreKind);
		if(list.size() > 0) {
			//성공
			return list;
		}else {
			//실패
			throw new SQLException("검색 결과가 없습니다.");
		}
	}

	@Override
	public void insertFavorite(int storeId, String memberId) throws SQLException {
		int i = uDao.insertFavorite(storeId, memberId);
		if (i > 0) {
			// 등록완료
		} else {
			// 등록실패
			throw new SQLException("즐겨찾기 추가에 실패했습니다.");
		}
	}

	@Override
	public List<Restaurant> searchFavorites(String memberId) throws SQLException {
		List<Restaurant> list = uDao.searchFavorites(memberId);
		if(list.size()>0) {
			// 조회성공
		}else {
			// 조회실패
			throw new SQLException("등록된 즐겨찾기 목록이 없습니다.");
		}
		return list;
	}

	@Override
	public void insertStarPoint(int storeId, int score) throws SQLException {
		int i = uDao.insertStarPoint(storeId, score);
		if(i>0) {
			// 별점주기 성공
		}else {
			// 별점주기 실패
			throw new SQLException("별점등록에 실패하였습니다.");
		}
	}

	@Override
	public List<Menu> searchMenuList(int storeId) throws SQLException {
		List<Menu> list = uDao.searchMenuList(storeId);
		if (list.size() > 0) {
			return list;
		} else {
			throw new SQLException("해당식당의 메뉴검색결과가 존재하지 않습니다.");
		}
	}

}
