package com.kh.javai;

public class Customer {
	
	//필드
	private String name, id, password, email;
	
	
	//생성자
	public Customer(String n, String i, String p, String e) {
		name = n;
		id = i;
		password = p;
		email = e;
	}
	
	
	// 값을 가지고 오는 getter 매서드
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	
	// 값을 넣어주는 setter 메서드
	public void setName(String n) {
		name = n;
	}
	public void setId(String i) {
		id = i;
	}
	public void setPassword(String p) {
		password = p;
	}
	public void setEmail(String e) {
		email = e;
	}
	
	
	// 정보를 보여주는 toString 메서드
	public String toString() {
		String str = this.name + "\t" + this.id + "\t" + this.password + "\t" + this.email;
		return str;
	}
	
	// 아이디, 비밀번호 체크
	public boolean equals(String i, String p) {
		return (this.id.equals(i) && this.password.equals(p));
	}

	public boolean idCheck(String i) {
		return (this.id.equals(i));
	}
	public boolean pwCheck(String p) {
		return (this.password.equals(p));
	}
	
	


	
	
	
	
}
