package kosta.matchat.model.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * ���� ���� DTO
 */
public class Restaurant {
	private int resId;       //����id
	private String resKind;	 //��������(�ѽ�, ���, �߽� , �Ͻ�)
	private String resName;  //�����̸�
	private String resAddr;  //�����ּ�
	private String resPhone; //��������ó
	private String resDeliv; 
	private String resSp;    //��������
	
	private List<Menu> list = new ArrayList<>();  //�Ĵ翡 �ش��ϴ� �޴� ����Ʈ

	
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
