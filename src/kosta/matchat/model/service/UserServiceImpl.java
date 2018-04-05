package kosta.matchat.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dao.UserDAOImpl;
import kosta.matchat.model.dto.Member;
import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;

public class UserServiceImpl implements UserService {
	private UserDAOImpl uDao = UserDAOImpl.getInstance();

	// �̱���
	private UserServiceImpl() {
	}

	public static UserServiceImpl instance = new UserServiceImpl();

	public static UserServiceImpl getInstance() {
		return instance;
	}

	@Override
	public void joinMember(Member member) throws SQLException {
		int i = uDao.joinMember(member);
		if (i > 0) {
			// ���Լ���
		} else {
			// ���Խ���
			throw new SQLException("ȸ�����Կ� �����Ͽ����ϴ�");
		}
	}

	@Override
	public void quitMember(String memberId) throws SQLException {
		int i = uDao.quitMember(memberId);
		if (i > 0) {
			// Ż�𼺰�
		} else {
			// Ż�����
			throw new SQLException("ȸ��Ż�� �����Ͽ����ϴ�. ���̵�� �н����带 Ȯ�����ּ���.");
		}
	}

	@Override
	public void loginMember(String memberId, String memberPassword) throws SQLException {
		if(memberId == null || memberPassword == null) {
			throw new SQLException("��ĭ�� ��� ä���ּ���.");
		}
		int i = uDao.loginMember(memberId, memberPassword);
		if (i > 0) {
			// �α��μ���
		} else {
			// �α��ν���
			throw new SQLException("�α��ο� �����Ͽ����ϴ�. ���̵�� �н����带 Ȯ���� �ּ���.");
		}
	}

	@Override
	public int checkDuplicateId(String memberId) throws SQLException {
		int i = uDao.checkDuplicateId(memberId);
		if (i > 0) {
			// ���̵��ߺ�
			System.out.println("ser"+i);
			throw new SQLException(memberId + "�� �̹� ������� ���̵��Դϴ�.");
			
		}
		
		return i;
	}

	@Override
	public List<Restaurant> searchByStoreName(String storeName) throws SQLException {
		List<Restaurant> list = uDao.searchByStoreName(storeName);
		if (list.size() > 0) {
			//����
			return list;
		} else {
			//����
			throw new SQLException(storeName + "�˻������ �������� �ʽ��ϴ�.");
		}
	}

	@Override
	public List<Restaurant> searchByStoreKind(String StoreKind) throws SQLException {
		List<Restaurant> list = uDao.searchByStoreKind(StoreKind);
		if(list.size() > 0) {
			//����
			return list;
		}else {
			//����
			throw new SQLException("�˻� ����� �����ϴ�.");
		}
	}

	@Override
	public List<Restaurant> searchByOrderStoreSP(String StoreKind) throws SQLException {
		List<Restaurant> list = uDao.searchByOrderStoreSP(StoreKind);
		if(list.size() > 0) {
			//����
			return list;
		}else {
			//����
			throw new SQLException("�˻� ����� �����ϴ�.");
		}
	}

	@Override
	public List<Restaurant> searchByDeliv(String StoreKind) throws SQLException {
		List<Restaurant> list = uDao.searchByDeliv(StoreKind);
		if(list.size() > 0) {
			//����
			return list;
		}else {
			//����
			throw new SQLException("�˻� ����� �����ϴ�.");
		}
	}

	@Override
	public void insertFavorite(int storeId, String memberId) throws SQLException {
		int i = uDao.insertFavorite(storeId, memberId);
		if (i > 0) {
			// ��ϿϷ�
		} else {
			// ��Ͻ���
			throw new SQLException("���ã�� �߰��� �����߽��ϴ�.");
		}
	}

	@Override
	public List<Restaurant> searchFavorites(String memberId) throws SQLException {
		List<Restaurant> list = uDao.searchFavorites(memberId);
		if(list.size()>0) {
			// ��ȸ����
		}else {
			// ��ȸ����
			throw new SQLException("��ϵ� ���ã�� ����� �����ϴ�.");
		}
		return list;
	}

	@Override
	public void insertStarPoint(int storeId, int score) throws SQLException {
		int i = uDao.insertStarPoint(storeId, score);
		if(i>0) {
			// �����ֱ� ����
		}else {
			// �����ֱ� ����
			throw new SQLException("������Ͽ� �����Ͽ����ϴ�.");
		}
	}

	@Override
	public List<Menu> searchMenuList(int storeId) throws SQLException {
		List<Menu> list = uDao.searchMenuList(storeId);
		if (list.size() > 0) {
			return list;
		} else {
			throw new SQLException("�ش�Ĵ��� �޴��˻������ �������� �ʽ��ϴ�.");
		}
	}

}
