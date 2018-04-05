package kosta.matchat.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
/**
 * ������ ��� DAO �������̽�
 */
public interface AdminDAO {
	/**
	 * ���� �߰�
	 * @param restaurant �߰��� ���� DTO
	 * @return ��������
	 */
	public int insertStore(Restaurant restaurant) throws SQLException;
	
	/**
	 * ���� id����
	 **/
	public int SearchStoreId() throws SQLException;
	
	/**
	 * ���� ����
	 * @param storeId ������ ���� ID
	 * @return ��������
	 */
	public int deleteStore(int[] StoreIds) throws SQLException;
	
	
	/**
	 * ���� ����
	 * @param restaurant ������ ���� DTO
	 * @return ��������
	 */
	public int updateStore(Restaurant restaurant) throws SQLException;
	
	
	/**
	 * �Ĵ翡 �޴��߰�
	 * @param storeId �޴��� �߰��� �Ĵ� ID 
	 * @param menu �߰��� �޴� DTO
	 * @return ��������
	 */
	public int insertMenu(int storeId, Menu menu) throws SQLException;
	
	
	/**
	 * �Ĵ��� �޴� ����
	 * @param storeId �޴��� ������ �Ĵ� ID
	 * @param menuId ������ �޴� ID
	 * @return ��������
	 */
	public int deleteMenu(int storeId, int menuId) throws SQLException;
	
	
	/**
	 * ���� ��ü����Ʈ �˻�
	 * @return List<Restaurant> ���� ��ü ����Ʈ
	 */
	public List<Restaurant> searchTotalList() throws SQLException;

	
}
