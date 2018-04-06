package kosta.matchat.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.model.service.AdminServiceImpl;
import kosta.matchat.view.start.FailView;

/**
 * 맛챗 관리자 기능 컨트롤러
 */
public class AdminController {
	private static AdminServiceImpl aService = AdminServiceImpl.getInstance();
	
	public static void insertStore(Restaurant restaurant) {
		try {
			aService.insertStore(restaurant);
			System.out.println("맛집을 등록했습니다");
		}catch(SQLException e) {
			FailView.errorMessage("형식에 맞지 않습니다. 다시 입력해주세요");
		}
	}
	
	public static int SearchStoreId() {
		int re=0;
		try {
			re= aService.SearchStoreId();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public static int deleteStore(int[] StoreIds) {
		int result=0;
		try {
			result = aService.deleteStore(StoreIds);
			System.out.println("맛집을 삭제했습니다");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	return result;	
	}

	public static void updateStore(Restaurant restaurant) {
		try {
			aService.updateStore(restaurant);
			System.out.println("맛집을 수정했습니다");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void insertMenu(int storeId, Menu menu) {
		try {
			aService.insertMenu(storeId, menu);
			System.out.println("메뉴등록을 성공했습니다.");
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void deleteMenu(int storeId, int menuId) {
		try {
			aService.deleteMenu(storeId, menuId);
			System.out.println("메뉴삭제를 성공했습니다.");
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static List<Restaurant> searchTotalList() {
		List<Restaurant> list=null;
		try {
			list = aService.searchTotalList();
//			for(Restaurant temp : list) {
//				System.out.println(temp.getResKind()+" | "+temp.getResName() +" | "+ temp.getResAddr() +" | "+ temp.getResPhone() +" | "+ temp.getResDeliv() +" | "+ temp.getResSp() );
//			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	return list;	
	}

}
