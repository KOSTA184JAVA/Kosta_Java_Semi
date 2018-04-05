package kosta.matchat.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dto.Member;
import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;

public interface UserService {
	/**
	 * ȸ������
	 * @param member ȸ�������� ȸ��
	 */
	public void joinMember(Member member) throws SQLException;
	
	
	/**
	 * ȸ��Ż��
	 * @param memberId Ż���� ȸ�� ID
	 * @param memberPassword Ż���� ȸ�� Password
	 */
	public void quitMember(String memberId) throws SQLException;
	
	
	/**
	 * �α���
	 * @param memberId �α����� ȸ�� ID
	 * @param memberPassword �α����� ȸ�� Password
	 */
	public void loginMember(String memberId, String memberPassword) throws SQLException;
	
	
	/**
	 * ID �ߺ� üũ (ȸ������ �� �ش� ID�� �ߺ��ϴ��� üũ) -> JoinMember() �ȿ��� ȣ��� �޼ҵ�
	 * @param memeberId �ߺ� üũ�� ȸ�� ID
	 */
	public int checkDuplicateId(String memberId) throws SQLException;
	
	
	/**
	 * �Ĵ��̸� �˻� 
	 * @param stroeName �˻��� ���� �̸�
	 * @return �˻��� ���� DTO List
	 */
	public List<Restaurant> searchByStoreName(String storeName) throws SQLException;
	
	
	/**
	 * �Ĵ� ����Ʈ �˻� (������ -> �ѽ�, ���, �Ͻ�, �߽�)
	 * @param Storekind �Ĵ� ����
	 * @return �Ĵ� ������ �ش��ϴ� ��������Ʈ
	 */
	public List<Restaurant> searchByStoreKind(String StoreKind) throws SQLException;
	
	
	/**
	 * �Ĵ� ����Ʈ �˻� (������ -> �ѽ�, ���, �Ͻ�, �߽�) + ���� �� ����
	 * @param StoreKind �Ĵ�����
	 * @return ���������� ���ĵ� �Ĵ������� �ش��ϴ� ��������Ʈ
	 */
	public List<Restaurant> searchByOrderStoreSP(String StoreKind) throws SQLException;
	
	
	/**
	 * �Ĵ� ����Ʈ �˻� (������ -> �ѽ�, ���, �Ͻ�, �߽�) + ��� ���� ��ü�� �˻�
	 * @param StoreKind �Ĵ�����
	 * @return ��ް��ɾ�ü�� ���Ե� �Ĵ������� �ش��ϴ� ��������Ʈ
	 */
	public List<Restaurant> searchByDeliv(String StoreKind) throws SQLException;
	

	/**
	 * ���� ���ã�� �߰�
	 * @param storeId ���ã�⿡ �߰��� ���� ID
	 * @param memberId �ڽ��� ȸ�� ID
	 */
	public void insertFavorite(int storeId, String memberId) throws SQLException;
	
	
	/**
	 * ���ã�� ��ȸ
	 * sql exam)
	 * @param memeberId ���ã�� ����� ��ȸ�� ȸ�� ID
	 * @return �ش� ȸ��ID�� �����ִ� ���ã�� ����Ʈ
	 */
	public List<Restaurant> searchFavorites(String memberId) throws SQLException;
	
	
	/**
	 * ���� ���� �ο�
	 * @param storeId ������ �ο��� �ش� ����
	 * @param score ����(1~5 ���� ����)
	 */
	public void insertStarPoint(int storeId, int score) throws SQLException;
	
	/**
	 * �ش� ���� �޴�����Ʈ ��ȸ
	 * @param storeId �޴��� ��ȸ�� �ش� ����
	 * @return �ش� ������ �����ִ� �޴� ����Ʈ
	 */
	public List<Menu> searchMenuList(int storeId) throws SQLException;
}
