package kosta.matchat.model.dto;

/**
 * 회원 DTO
 */
public class Member {
	private String id;			//아이디
	private String password;	//비밀번호
	private String name;		//이름
	private String phone;		//연락처
	private String addr;		//주소 
	
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
