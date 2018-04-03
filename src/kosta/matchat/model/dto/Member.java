package kosta.matchat.model.dto;

/**
 * ȸ�� DTO
 */
public class Member {
	private String id;			//���̵�
	private String password;	//��й�ȣ
	private String name;		//�̸�
	private String phone;		//����ó
	private String addr;		//�ּ� 
	
	public Member(String id, String password, String name, String phone, String addr) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
