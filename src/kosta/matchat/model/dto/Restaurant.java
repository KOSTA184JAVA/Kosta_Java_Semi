package kosta.matchat.model.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * 맛집 정보 DTO
 */
public class Restaurant {
	private int resId;       //맛집id
	private String resKind;	 //맛집종류(한식, 양식, 중식 , 일식)
	private String resName;  //맛집이름
	private String resAddr;  //맛집주소
	private String resPhone; //맛집연락처
	private String resDeliv; 
	private String resSp;    //맛집별점
	
	private List<Menu> list = new ArrayList<>();  //식당에 해당하는 메뉴 리스트

	
	public Restaurant(String resKind, String resName, String resAddr, String resPhone, String resDeliv,String resSp, int resId) {
		this.resKind = resKind;
		this.resName = resName;
		this.resAddr = resAddr;
		this.resPhone = resPhone;
		this.resSp = resSp;
		this.resId = resId;
		this.resDeliv = resDeliv;
	}
	
	public List<Menu> getList() {
		return list;
	}
	
	public void setList(List<Menu> list) {
		this.list = list;
	}
	
	public String getResKind() {
		return resKind;
	}
	public void setResKind(String resKind) {
		this.resKind = resKind;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResAddr() {
		return resAddr;
	}
	public void setResAddr(String resAddr) {
		this.resAddr = resAddr;
	}
	public String getResPhone() {
		return resPhone;
	}
	public void setResPhone(String resPhone) {
		this.resPhone = resPhone;
	}
	public String getResSp() {
		return resSp;
	}
	public void setResSp(String resSp) {
		this.resSp = resSp;
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}
	public String getResDeliv() {
		return resDeliv;
	}

	public void setResDeliv(String resDeliv) {
		this.resDeliv = resDeliv;
	}
	
}
