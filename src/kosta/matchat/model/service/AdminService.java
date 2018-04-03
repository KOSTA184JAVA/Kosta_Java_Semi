package kosta.matchat.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;

public interface AdminService {
	/**
	 * ���� �߰�
	 * @param restaurant �߰��� ���� DTO
	 */
	public void insertStore(Restaurant restaurant) throws SQLException;
	
	
	/**
	 * ���� ����
	 * @param storeId ������ ���� ID
	 */
	public void deleteStore(int storeId) throws SQLException;
	
	
	/**
	 * ���� ����
	 * @param restaurant ������ ���� DTO
	 */
	public void updateStore(Restaurant restaurant) throws SQLException;
	
	
	/**
	 * �Ĵ翡 �޴��߰�
	 * @param storeId �޴��� �߰��� �Ĵ� ID 
	 * @param menu �߰��� �޴� DTO
	 */
	public void insertMenu(int storeId, Menu menu) throws SQLException;
	
	
	/**
	 * �Ĵ��� �޴� ����
	 * @param storeId �޴��� ������ �Ĵ� ID
	 * @param menuId ������ �޴� ID
	 */
	public void deleteMenu(int storeId, int menuId) throws SQLException;
	
	
	/**
	 * ���� ��ü����Ʈ �˻�
	 * @return List<Restaurant> ���� ��ü ����Ʈ
	 */
	public List<Restaurant> searchTotalList() throws SQLException;
}
