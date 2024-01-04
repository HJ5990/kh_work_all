package com.kh.interface_test;

public class Cat implements Animal {

	@Override
	public void eat(String food) {
		System.out.println(food + "를 먹었다 (야옹)");
	}

	@Override
	public void move() {
		System.out.println("의자를 긁고 있다 (야옹)");
	}



		
		


}
