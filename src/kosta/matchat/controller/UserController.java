package kosta.matchat.controller;

import java.sql.SQLException;

import kosta.matchat.model.dto.Member;
import kosta.matchat.model.service.UserService;
import kosta.matchat.model.service.UserServiceImpl;
/**
 * 맛챗 사용자 기능 컨트롤러
 */
public class UserController {
	private UserService uService = UserServiceImpl.getInstance();
	
	public void joinMember(Member member) {
		
	}

	public void quitMember(String memberId, String memberPassword) {
		
	}

	public void loginMember(String memberId, String memberPassword) {
		
	}

	public void checkDuplicateId(String memberId) {
		
	}

	public void searchByStoreName(String stroeName) {
		
	}

	public void searchByStoreKind(String StoreKind) {
		try {
			uService.searchByStoreKind(StoreKind);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void searchByOrderStoreSP(String StoreKind) {
		try {
			uService.searchByOrderStoreSP(StoreKind);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void searchByDeliv(String StoreKind) {
		try {
			uService.searchByDeliv(StoreKind);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertFavorite(int storeId, String memberId) {
		
	}

	public void searchFavorites(String memberId) {
		
	}

	public void insertStarPoint(int storeId, int score) {
		
	}
	
}
