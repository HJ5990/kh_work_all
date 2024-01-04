package com.kh.review_0818;

public class Student extends Human implements Swimmable, Sleepable {

	
	// Human 부모객체 초기화 필수 ( 매개변수 생성자가 있기 때문에)
	public Student(String name, int age) {
		super(name, age);
	}
	
	
	@Override
	public void sleep() {
		System.out.println(super.getName() + "님은 잠을 잡니다.");
	}
	
	@Override
	public void swim() {
		System.out.println(super.getName() + "님은 수영을 합니다.");
	}

	@Override
	public void makeSound() {
		System.out.println("저는 "+super.getName()+"이고 "+super.getAge()+"살 입니다");
	}
	

}
