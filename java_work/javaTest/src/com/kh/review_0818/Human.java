package com.kh.review_0818;

// 추상클래스 Human ('추상'단어가 나오면 abstract 붙여준다고 생각하면 됨)
public abstract class Human {
	private String name;
	private int age;
	
	// 필드값을 초기화하는 생성자
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	
	// 추상메서드 makeSound
	abstract void makeSound();
	
	

	
	
}


	

