package kosta.matchat.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;

public class AdminServiceImpl implements AdminService {

	//ΩÃ±€≈Ê
	private AdminServiceImpl() {}
	public static AdminServiceImpl instance = new AdminServiceImpl();
	public static AdminServiceImpl getInstance() {
		return instance;
	}
	@Override
	public void insertStore(Restaurant restaurant) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteStore(int storeId) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateStore(Restaurant restaurant) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertMenu(int storeId, Menu menu) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteMenu(int storeId, int menuId) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Restaurant> searchTotalList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
