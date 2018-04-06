package kosta.matchat.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.model.service.AdminServiceImpl;
import kosta.matchat.view.start.FailView;

/**
 * ��ê ������ ��� ��Ʈ�ѷ�
 */
public class AdminController {
	private static AdminServiceImpl aService = AdminServiceImpl.getInstance();
	
	public static void insertStore(Restaurant restaurant) {
		try {
			aService.insertStore(restaurant);
			System.out.println("������ ����߽��ϴ�");
		}catch(SQLException e) {
			FailView.errorMessage("���Ŀ� ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
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
			System.out.println("������ �����߽��ϴ�");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	return result;	
	}

	public static void updateStore(Restaurant restaurant) {
		try {
			aService.updateStore(restaurant);
			System.out.println("������ �����߽��ϴ�");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void insertMenu(int storeId, Menu menu) {
		try {
			aService.insertMenu(storeId, menu);
			System.out.println("�޴������ �����߽��ϴ�.");
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void deleteMenu(int storeId, int menuId) {
		try {
			aService.deleteMenu(storeId, menuId);
			System.out.println("�޴������� �����߽��ϴ�.");
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
