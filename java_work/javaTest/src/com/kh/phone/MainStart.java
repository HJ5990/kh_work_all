package com.kh.phone;

public class MainStart {

	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-777", "nougat");
		MobilePhone ph2 = new SmartPhone("010-999-333", "nougat");
		// 업캐스팅
		

		ph1.answer();
		ph1.playApp();
		System.out.println();
		
		ph2.answer();
//		ph2.playApp();    // 풀면오류남
		
		
		
//		SmartPhone ph3 =  new MobilePhone("010-555-778")  // 이것도 안됨
		
		
	}

}
