package com.kh.product;
import java.util.Scanner;

public class MainStart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CafePos pos = CafePos.getInstance();
		
		// 메뉴 생성, 삭제, 수정, 조회, 전체출력
		while (pos.getIsRun()) {
			int number = pos.printMenu();
			switch (number) {
				case 1:{
					pos.insertMenu();
				} break;
				case 2:{
					pos.updateDrinkUnit();
				} break;
				case 3:{
					pos.searchDrinkUnit();
				} break;
				case 4:{
					pos.deleteDrinkUnit2();
				} break;
				case 5:{
					pos.printDrinkArr();
				} break;
				default:
					pos.setIsRun(false);
			}
		
		}
	
		
		
		
		
		
		
		
		
	}
}
