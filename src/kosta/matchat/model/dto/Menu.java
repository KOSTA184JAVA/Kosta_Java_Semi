package kosta.matchat.model.dto;
/**
 * 식당별 메뉴 DTO
 * 관리자가 메뉴 데이터를 추가할 때 필요함
 */
public class Menu {
	private int menuId;	    //메뉴아이디
	private String name;	//메뉴이름
	private int price;		//메뉴가격
	private String desc;	//메뉴설명
	private int kcal;		//칼로리
	private String source;	//원재료명
	
	
	public Menu(String name, int price, String desc, int kcal, String source, int menuId) {
		this.name = name;
		this.price = price;
		this.desc = desc;
		this.kcal = kcal;
		this.source = source;
		this.menuId = menuId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getKcal() {
		return kcal;
	}


	public void setKcal(int kcal) {
		this.kcal = kcal;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}
	
	public int getMenuId() {
		return menuId;
	}


	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	
	
	
	
}
