package com.kh.extendsjava;

public class Man {
	String name;

	public Man() {
		System.out.println("man 기본생성자 생성");
	}
	
	public Man(String name) {
		this.name = name;
		System.out.println("매개변수 name 넘겨받은 생성자 생성");
	}
	
	public void tellYourName() {
		System.out.println("My name is " + name);
	}

}
