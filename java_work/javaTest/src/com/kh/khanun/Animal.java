package com.kh.khanun;

public class Animal {
	// 필드
	String name; // 종
	int age;
	String gender;
	
	// 생성자
	public Animal(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	// 매서드
	void makeSound() {
		System.out.println(name + "(이)가 소리를 냅니다");
	}
	
	
	

}
