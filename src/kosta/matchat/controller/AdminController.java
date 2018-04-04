package kosta.matchat.controller;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.model.service.AdminServiceImpl;

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
			System.out.println(e.getMessage());
		}
	}

	public static void deleteStore(int storeId) {
		try {
			aService.deleteStore(storeId);
			System.out.println("������ �����߽��ϴ�");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
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

	public static void searchTotalList() {
		try {
			List<Restaurant> list = aService.searchTotalList();
			for(Restaurant temp : list) {
				System.out.println(temp.getResKind()+" | "+temp.getResName() +" | "+ temp.getResAddr() +" | "+ temp.getResPhone() +" | "+ temp.getResDeliv() +" | "+ temp.getResSp() );
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
