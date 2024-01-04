package com.kh.study_0818_1;

public class Run {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();  // T를 Apple로 결정
		Box<Orange> oBox = new Box<Orange>();  // T를 Orange로 결정
		
		aBox.set(new Apple());  // 사과를 상자에 담는다
		oBox.set(new Orange());  // 오렌지를 상자에 담는다
		
		Apple ap = aBox.get();  // 사과를 꺼내는데 형변환 하지 않는다
		Orange og = oBox.get();  // 오렌지를 꺼내는데 형변환 하지 않는다
		
		System.out.println(ap);
		System.out.println(og);
	}

}
