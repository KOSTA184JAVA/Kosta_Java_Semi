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
	private String resDeliv; //��޿���
	private int resSp;    //��������
	
	private List<Menu> list = new ArrayList<>();  //�Ĵ翡 �ش��ϴ� �޴� ����Ʈ

	
	public Restaurant(int resId, String resKind, String resName, String resAddr, String resPhone, String resDeliv, int resSp) {
		this.resId = resId;
		this.resKind = resKind;
		this.resName = resName;
		this.resAddr = resAddr;
		this.resPhone = resPhone;
		this.resDeliv = resDeliv;
		this.resSp = resSp;
	}
	
	public Restaurant(String resKind, String resName, String resAddr, String resPhone, String resDeliv, int resSp) {
		this.resKind = resKind;
		this.resName = resName;
		this.resAddr = resAddr;
		this.resPhone = resPhone;
		this.resDeliv = resDeliv;
		this.resSp = resSp;
	}
	public List<Menu> getList() {
		return list;
	}
	
	public void addMenu(Menu menu) {
		list.add(menu);
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
	public int getResSp() {
		return resSp;
	}
	public void setResSp(int resSp) {
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
