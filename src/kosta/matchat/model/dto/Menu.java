package kosta.matchat.model.dto;
/**
 * �Ĵ纰 �޴� DTO
 * �����ڰ� �޴� �����͸� �߰��� �� �ʿ���
 */
public class Menu {
	private int menuId;	    //�޴����̵�
	private String name;	//�޴��̸�
	private int price;		//�޴�����
	private String desc;	//�޴�����
	private int kcal;		//Į�θ�
	private String source;	//������
	
	
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
