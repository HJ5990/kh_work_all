package com.kh.khanun;

public class Dog extends Animal {
	
	
	// 부모 생성자의 매개변수도 받아줘야함
	public Dog(String name, int age, String gender) {
		super(name, age, gender);
	}
	
	public void welcomeHome() {
		System.out.print("꼬리를 흔듭니다");
	}
	
	void makeSound() {
		System.out.println("멍멍");
	}
	
	
}
