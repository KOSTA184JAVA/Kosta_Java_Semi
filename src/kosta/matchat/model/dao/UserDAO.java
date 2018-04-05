package kosta.matchat.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.matchat.model.dto.Member;
import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
/**
 * 사용자 기능 DAO 인터페이스
 */
public interface UserDAO {
	/**
	 * 회원가입
	 * @param member 회원가입할 회원
	 * @return 성공여부
	 */
	public int joinMember(Member member) throws SQLException;
	
	
	/**
	 * 회원탈퇴
	 * @param memberId 탈퇴할 회원 ID
	 * @param memberPassword 탈퇴할 회원 Password
	 * @return 성공여부
	 */
	public int quitMember(String memberId) throws SQLException;
	
	
	/**
	 * 로그인
	 * @param memberId 로그인할 회원 ID
	 * @param memberPassword 로그인할 회원 Password
	 * @return 성공여부
	 */
	public int loginMember(String memberId, String memberPassword) throws SQLException;
	
	
	/**
	 * ID 중복 체크 (회원가입 시 해당 ID가 중복하는지 체크) -> JoinMember() 안에서 호출될 메소드
	 * @param memeberId 중복 체크할 회원 ID
	 * @return 성공여부
	 */
	public int checkDuplicateId(String memberId) throws SQLException;;
	
	
	/**
	 * 식당이름 검색
	 * sql exam) 조인과 서브쿼리이용
	 * @param stroeName 검색할 맛집 이름
	 * @return 검색된 맛집 DTO List
	 */
	public List<Restaurant> searchByStoreName(String storeName) throws SQLException;
	
	
	/**
	 * 식당 리스트 검색 (종류별 -> 한식, 양식, 일식, 중식)
	 * sql exam)
	 *     select * from restaurant where restaur_kind = StoreKind
	 * @param Storekind 식당 종류
	 * @return 식당 종류에 해당하는 맛집리스트
	 */
	public List<Restaurant> searchByStoreKind(String StoreKind) throws SQLException;
	
	
	/**
	 * 식당 리스트 검색 (종류별 -> 한식, 양식, 일식, 중식) + 별점 순 정렬
	 * sql exam)
	 *     select * from restaurant where restaur_kind = StoreKind order by restaur_point DESC;
	 * @param StoreKind 식당종류
	 * @return 별점순으로 정렬된 식당종류에 해당하는 맛집리스트
	 */
	public List<Restaurant> searchByOrderStoreSP(String StoreKind) throws SQLException;
	
	
	/**
	 * 식당 리스트 검색 (종류별 -> 한식, 양식, 일식, 중식) + 배달 가능 업체만 검색
	 * sql exam)
	 *     select * from restaurant where restaur_kind = StoreKind AND restaur_deliver = O;
	 * @param StoreKind 식당종류
	 * @return 배달가능업체만 포함된 식당종류에 해당하는 맛집리스트
	 */
	public List<Restaurant> searchByDeliv(String StoreKind) throws SQLException;
	

	/**
	 * 맛집 즐겨찾기 추가
	 * sql exam)
	 *     insert into favorites (restaur_id, member_id)
	 *     values(storeId, memberId)
	 * @param storeId 즐겨찾기에 추가할 맛집 ID
	 * @param memberId 자신의 회원 ID
	 * @return 성공여부
	 */
	public int insertFavorite(int storeId, String memberId) throws SQLException;
	
	
	/**
	 * 즐겨찾기 조회
	 * sql exam)
	 *     select * from restaurant
	 *     where restaur_id IN (select restaur_id from favorites where member_id = memberId)
	 * @param memeberId 즐겨찾기 목록을 조회할 회원 ID
	 * @return 해당 회원ID가 갖고있는 즐겨찾기 리스트
	 */
	public List<Restaurant> searchFavorites(String memberId) throws SQLException;
	
	
	/**
	 * 맛집 별점 부여
	 * sql exam)
	 *     update restaurant set (restaur_point = score)
	 *     where restaur_id = storeId
	 * @param storeId 별점을 부여할 해당 맛집
	 * @param score 별점(1~5 사이 정수)
	 * @return 성공여부
	 */
	public int insertStarPoint(int storeId, int score) throws SQLException;
	
	/**
	 * 해당 맛집 메뉴리스트 조회
	 * @param storeId 메뉴를 조회할 해당 맛집
	 * @return 해당 맛집이 갖고있는 메뉴 리스트
	 */
	public List<Menu> searchMenuList(int storeId) throws SQLException;
	
}
