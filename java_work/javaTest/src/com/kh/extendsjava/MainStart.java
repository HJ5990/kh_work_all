package com.kh.extendsjava;

public class MainStart {

	public static void main(String[] args) {

		// 객체를 생성할때 상속받은 클래스가(부모) 있다면
		// 부모클래스의 설계부터 확인하고 자식클래스의 설계를 따른다
		
		
//		Man choi = new Man();
//		choi.name = "jiwon";
//		choi.tellYourName();
		
		BusinessMan kim = new BusinessMan("kh", "강사", "최지원");    // Man을 상속받은 클래스
		kim.tellYourInfo();
		
		
//		kim.name = "hyoju";
//		kim.tellYourName();
//		kim.tellYourInfo();
		
	}
}
