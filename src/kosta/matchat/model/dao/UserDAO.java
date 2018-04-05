package kosta.matchat.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dto.Member;
import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
/**
 * ����� ��� DAO �������̽�
 */
public interface UserDAO {
	/**
	 * ȸ������
	 * @param member ȸ�������� ȸ��
	 * @return ��������
	 */
	public int joinMember(Member member) throws SQLException;
	
	
	/**
	 * ȸ��Ż��
	 * @param memberId Ż���� ȸ�� ID
	 * @param memberPassword Ż���� ȸ�� Password
	 * @return ��������
	 */
	public int quitMember(String memberId) throws SQLException;
	
	
	/**
	 * �α���
	 * @param memberId �α����� ȸ�� ID
	 * @param memberPassword �α����� ȸ�� Password
	 * @return ��������
	 */
	public int loginMember(String memberId, String memberPassword) throws SQLException;
	
	
	/**
	 * ID �ߺ� üũ (ȸ������ �� �ش� ID�� �ߺ��ϴ��� üũ) -> JoinMember() �ȿ��� ȣ��� �޼ҵ�
	 * @param memeberId �ߺ� üũ�� ȸ�� ID
	 * @return ��������
	 */
	public int checkDuplicateId(String memberId) throws SQLException;;
	
	
	/**
	 * �Ĵ��̸� �˻�
	 * sql exam) ���ΰ� ���������̿�
	 * @param stroeName �˻��� ���� �̸�
	 * @return �˻��� ���� DTO List
	 */
	public List<Restaurant> searchByStoreName(String storeName) throws SQLException;
	
	
	/**
	 * �Ĵ� ����Ʈ �˻� (������ -> �ѽ�, ���, �Ͻ�, �߽�)
	 * sql exam)
	 *     select * from restaurant where restaur_kind = StoreKind
	 * @param Storekind �Ĵ� ����
	 * @return �Ĵ� ������ �ش��ϴ� ��������Ʈ
	 */
	public List<Restaurant> searchByStoreKind(String StoreKind) throws SQLException;
	
	
	/**
	 * �Ĵ� ����Ʈ �˻� (������ -> �ѽ�, ���, �Ͻ�, �߽�) + ���� �� ����
	 * sql exam)
	 *     select * from restaurant where restaur_kind = StoreKind order by restaur_point DESC;
	 * @param StoreKind �Ĵ�����
	 * @return ���������� ���ĵ� �Ĵ������� �ش��ϴ� ��������Ʈ
	 */
	public List<Restaurant> searchByOrderStoreSP(String StoreKind) throws SQLException;
	
	
	/**
	 * �Ĵ� ����Ʈ �˻� (������ -> �ѽ�, ���, �Ͻ�, �߽�) + ��� ���� ��ü�� �˻�
	 * sql exam)
	 *     select * from restaurant where restaur_kind = StoreKind AND restaur_deliver = O;
	 * @param StoreKind �Ĵ�����
	 * @return ��ް��ɾ�ü�� ���Ե� �Ĵ������� �ش��ϴ� ��������Ʈ
	 */
	public List<Restaurant> searchByDeliv(String StoreKind) throws SQLException;
	

	/**
	 * ���� ���ã�� �߰�
	 * sql exam)
	 *     insert into favorites (restaur_id, member_id)
	 *     values(storeId, memberId)
	 * @param storeId ���ã�⿡ �߰��� ���� ID
	 * @param memberId �ڽ��� ȸ�� ID
	 * @return ��������
	 */
	public int insertFavorite(int storeId, String memberId) throws SQLException;
	
	
	/**
	 * ���ã�� ��ȸ
	 * sql exam)
	 *     select * from restaurant
	 *     where restaur_id IN (select restaur_id from favorites where member_id = memberId)
	 * @param memeberId ���ã�� ����� ��ȸ�� ȸ�� ID
	 * @return �ش� ȸ��ID�� �����ִ� ���ã�� ����Ʈ
	 */
	public List<Restaurant> searchFavorites(String memberId) throws SQLException;
	
	
	/**
	 * ���� ���� �ο�
	 * sql exam)
	 *     update restaurant set (restaur_point = score)
	 *     where restaur_id = storeId
	 * @param storeId ������ �ο��� �ش� ����
	 * @param score ����(1~5 ���� ����)
	 * @return ��������
	 */
	public int insertStarPoint(int storeId, int score) throws SQLException;
	
	/**
	 * �ش� ���� �޴�����Ʈ ��ȸ
	 * @param storeId �޴��� ��ȸ�� �ش� ����
	 * @return �ش� ������ �����ִ� �޴� ����Ʈ
	 */
	public List<Menu> searchMenuList(int storeId) throws SQLException;
	
}
