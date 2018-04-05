package kosta.matchat.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import kosta.matchat.model.dao.AdminDAOImpl;
import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;

public class AdminServiceImpl implements AdminService {
	private AdminDAOImpl aDao = AdminDAOImpl.getInstance();

	// �̱���
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
			// �����߰� ����
		} else {
			// �����߰� ����
			throw new SQLException("�˻��� ���ڵ尡 �����ϴ�");
		}
	}

	@Override
	public int deleteStore(int[] StoreIds) throws SQLException {
		int i=0;
		i = aDao.deleteStore(StoreIds);
		if (i == 0) throw new SQLException("���� ������ �����Ͽ����ϴ�.");
	return i;
	}

	@Override
	public void updateStore(Restaurant restaurant) throws SQLException {
		int i = aDao.updateStore(restaurant);
		if (i > 0) {
			// �������� ����
		} else {
			// �������� ����
			throw new SQLException("���� ������ �����Ͽ����ϴ�.");
		}
	}

	@Override
	public void insertMenu(int storeId, Menu menu) throws SQLException {
		int i = aDao.insertMenu(storeId, menu);
		if (i > 0) {
			// �޴����� ����
		}else {
			// �޴����� ����
			throw new SQLException("�Ĵ�(ID:"+storeId+")�� �������� �ʾ� menu ��Ͽ� �����Ͽ����ϴ�.");
		}

	}

	@Override
	public void deleteMenu(int storeId, int menuId) throws SQLException {
		int i = aDao.deleteMenu(storeId, menuId);
		if (i > 0) {
			// �޴����� ����
		} else {
			// �޴����� ����
			throw new SQLException("�Ĵ�(ID:" + storeId + ")�� �޴�(ID:" + menuId + ")�� �������� �ʾ� ������ �� �����ϴ�.");
		}

	}

	@Override
	public List<Restaurant> searchTotalList() throws SQLException {
		List<Restaurant> list = aDao.searchTotalList();
		if (list.size()>0) {
			//��ü �˻� ����
		}else {
			throw new SQLException("��ü �˻������ �������� �ʽ��ϴ�.");
		}
	return list;
	}

	@Override
	public int SearchStoreId() throws SQLException {
		int re = aDao.SearchStoreId();
		if (re > 0) {
			//���̵� �˻� ����
		} else {
			throw new SQLException("�ش� Restaurant ���̵� �����ϴ�");
		}
		return re;
	}

}
