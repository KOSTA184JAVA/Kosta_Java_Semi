package kosta.matchat.controller;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dto.Member;
import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.model.service.UserServiceImpl;

/**
 * ��ê ����� ��� ��Ʈ�ѷ�
 */
public class UserController {
	private static  UserServiceImpl uService = UserServiceImpl.getInstance();

	public static void joinMember(Member member) {
		try {
			uService.joinMember(member);
			System.out.println(member.getId() + "�� ���������� ȸ����ϵǾ����ϴ�.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void quitMember(String memberId, String memberPassword) {
		try {
			uService.quitMember(memberId, memberPassword);
			System.out.println(memberId + "�� ���������� ȸ��Ż��Ǿ����ϴ�.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static boolean loginMember(String memberId, String memberPassword) {
		try {
			uService.loginMember(memberId, memberPassword);
			System.out.println(memberId+"�� ȯ���մϴ�.");
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public static void checkDuplicateId(String memberId) {
		try {
			uService.checkDuplicateId(memberId);
			System.out.println(memberId+"�� ��밡���� ���̵��Դϴ�.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static List<Restaurant> searchByStoreName(String storeName) {
		List<Restaurant> list = null;
		try {
			list =uService.searchByStoreName(storeName);
//			for(Restaurant temp : list) {
//				System.out.println(temp.getResKind()+" | "+temp.getResName() +" | "+ temp.getResAddr() +" | "+ temp.getResPhone() +" | "+ temp.getResDeliv() +" | "+ temp.getResSp() );
//			}	
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}	
	return list;	
	}

	public static List<Restaurant> searchByStoreKind(String StoreKind) {
		try {
			List<Restaurant> list = uService.searchByStoreKind(StoreKind);
			return list;
			/*for(Restaurant temp : list) {
				System.out.println(temp.getResKind()+" | "+temp.getResName() +" | "+ temp.getResAddr() +" | "+ temp.getResPhone() +" | "+ temp.getResDeliv() +" | "+ temp.getResSp() );
			}*/
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	return null;
	}

	public static void searchByOrderStoreSP(String StoreKind) {
		try {
			List<Restaurant> list = uService.searchByOrderStoreSP(StoreKind);
			for(Restaurant temp : list) {
				System.out.println(temp.getResKind()+" | "+temp.getResName() +" | "+ temp.getResAddr() +" | "+ temp.getResPhone() +" | "+ temp.getResDeliv() +" | "+ temp.getResSp() );
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void searchByDeliv(String StoreKind) {
		try {
			List<Restaurant> list = uService.searchByDeliv(StoreKind);
			for(Restaurant temp : list) {
				System.out.println(temp.getResKind()+" | "+temp.getResName() +" | "+ temp.getResAddr() +" | "+ temp.getResPhone() +" | "+ temp.getResDeliv() +" | "+ temp.getResSp() );
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void insertFavorite(int storeId, String memberId) {
		try {
			uService.insertFavorite(storeId, memberId);
			System.out.println("���ã�� �߰��� �����߽��ϴ�.");
		}catch(SQLException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static List<Restaurant> searchFavorites(String memberId) {
		List<Restaurant> list =null;
		try {
			list = uService.searchFavorites(memberId);
			for(Restaurant temp : list) {
				System.out.println(temp.getResKind()+" | "+temp.getResName() +" | "+ temp.getResAddr() +" | "+ temp.getResPhone() +" | "+ temp.getResDeliv() +" | "+ temp.getResSp() );
			}
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public static void insertStarPoint(int storeId, int score) {
		try {
			uService.insertStarPoint(storeId, score);
			System.out.println(score+"�� ����Ͽ����ϴ�.");
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void searchMenuList(int storeId){
		try {
			List<Menu> list =uService.searchMenuList(storeId);
			for(Menu temp : list) {
				System.out.println(temp.getName()+" | "+temp.getPrice() +" | "+ temp.getDesc() +" | "+ temp.getKcal() +" | "+ temp.getSource());
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
