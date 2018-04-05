package kosta.matchat.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import kosta.matchat.model.dao.AdminDAOImpl;
import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;

public class AdminServiceImpl implements AdminService {
	private AdminDAOImpl aDao = AdminDAOImpl.getInstance();

	// 싱글톤
	private AdminServiceImpl() {
	}

	public static AdminServiceImpl instance = new AdminServiceImpl();

	public static AdminServiceImpl getInstance() {
		return instance;
	}

	@Override
	public void insertStore(Restaurant restaurant) throws SQLException {
		int i = aDao.insertStore(restaurant);
		if (i > 0) {
			// 맛집추가 성공
		} else {
			// 맛집추가 실패
			throw new SQLException("검색된 레코드가 없습니다");
		}
	}

	@Override
	public int deleteStore(int[] StoreIds) throws SQLException {
		int i=0;
		i = aDao.deleteStore(StoreIds);
		if (i == 0) throw new SQLException("맛집 삭제에 실패하였습니다.");
	return i;
	}

	@Override
	public void updateStore(Restaurant restaurant) throws SQLException {
		int i = aDao.updateStore(restaurant);
		if (i > 0) {
			// 맛집갱신 성공
		} else {
			// 맛집갱신 실패
			throw new SQLException("맛집 수정에 실패하였습니다.");
		}
	}

	@Override
	public void insertMenu(int storeId, Menu menu) throws SQLException {
		int i = aDao.insertMenu(storeId, menu);
		if (i > 0) {
			// 메뉴삽입 성공
		}else {
			// 메뉴삽입 실패
			throw new SQLException("식당(ID:"+storeId+")이 존재하지 않아 menu 등록에 실패하였습니다.");
		}

	}

	@Override
	public void deleteMenu(int storeId, int menuId) throws SQLException {
		int i = aDao.deleteMenu(storeId, menuId);
		if (i > 0) {
			// 메뉴삭제 성공
		} else {
			// 메뉴삭제 실패
			throw new SQLException("식당(ID:" + storeId + ")의 메뉴(ID:" + menuId + ")가 존재하지 않아 삭제할 수 없습니다.");
		}

	}

	@Override
	public List<Restaurant> searchTotalList() throws SQLException {
		List<Restaurant> list = aDao.searchTotalList();
		if (list.size()>0) {
			//전체 검색 성공
		}else {
			throw new SQLException("전체 검색결과가 존재하지 않습니다.");
		}
	return list;
	}

	@Override
	public int SearchStoreId() throws SQLException {
		int re = aDao.SearchStoreId();
		if (re > 0) {
			//아이디 검색 성공
		} else {
			throw new SQLException("해당 Restaurant 아이디가 없습니다");
		}
		return re;
	}

}
