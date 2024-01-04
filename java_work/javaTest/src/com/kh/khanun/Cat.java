package com.kh.khanun;

public class Cat extends Animal {
	
	public Cat (String name, int age, String gender) {
		super(name, age, gender);
	}
	
	public void welcomeHome() {
		System.out.print("숨는다.");
	}
	
	
	// 부모class 메서드명과 동일한 메서드가 있다면 자식class 메서드로 덮어버림
	// 오버라이딩이라고 함 (자식 우선)
	// 한개를 매개변수를 바꿔주면 (오버로딩) 매개변수에 맞게 호출함
	void makeSound() {
		System.out.println("야옹");
	}

}
