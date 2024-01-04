package com.kh.interface_test;

public interface Animal {
	public static final String name = "동물";
	
	public abstract void eat(String food);
	void move();   // 이렇게 써도 위에랑 똑같음 'public abstract' 가 생략되어있음

}
