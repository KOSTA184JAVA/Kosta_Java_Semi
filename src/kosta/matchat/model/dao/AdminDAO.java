package kosta.matchat.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
/**
 * 관리자 기능 DAO 인터페이스
 */
public interface AdminDAO {
	/**
	 * 맛집 추가
	 * @param restaurant 추가할 맛집 DTO
	 * @return 성공여부
	 */
	public int insertStore(Restaurant restaurant) throws SQLException;
	
	/**
	 * 맛집 id생성
	 **/
	public int SearchStoreId() throws SQLException;
	
	/**
	 * 맛집 삭제
	 * @param storeId 삭제할 맛집 ID
	 * @return 성공여부
	 */
	public int deleteStore(int[] StoreIds) throws SQLException;
	
	
	/**
	 * 맛집 수정
	 * @param restaurant 수정할 맛집 DTO
	 * @return 성공여부
	 */
	public int updateStore(Restaurant restaurant) throws SQLException;
	
	
	/**
	 * 식당에 메뉴추가
	 * @param storeId 메뉴를 추가할 식당 ID 
	 * @param menu 추가할 메뉴 DTO
	 * @return 성공여부
	 */
	public int insertMenu(int storeId, Menu menu) throws SQLException;
	
	
	/**
	 * 식당의 메뉴 삭제
	 * @param storeId 메뉴를 삭제할 식당 ID
	 * @param menuId 삭제할 메뉴 ID
	 * @return 성공여부
	 */
	public int deleteMenu(int storeId, int menuId) throws SQLException;
	
	
	/**
	 * 맛집 전체리스트 검색
	 * @return List<Restaurant> 맛집 전체 리스트
	 */
	public List<Restaurant> searchTotalList() throws SQLException;

	
}
