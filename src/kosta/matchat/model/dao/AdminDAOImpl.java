package kosta.matchat.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
/**
 * °ü¸®ÀÚ ±â´É DAO
 */
public class AdminDAOImpl implements AdminDAO {
	
	//½Ì±ÛÅæ
	private AdminDAOImpl() {}
	public static AdminDAOImpl instance = new AdminDAOImpl();
	public static AdminDAOImpl getInstance() {
		return instance;
	}
	@Override
	public int insertStore(Restaurant restaurant) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteStore(int storeId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateStore(Restaurant restaurant) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int insertMenu(int storeId, Menu menu) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteMenu(int storeId, int menuId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Restaurant> searchTotalList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
