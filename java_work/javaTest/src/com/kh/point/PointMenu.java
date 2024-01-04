package com.kh.point;
import java.util.Scanner;


public class PointMenu {
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	//메인메뉴
	public void mainMenu() {
		
		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			switch (sc.nextInt()) {
				case 1:
					circleMenu();
					break;
				case 2:
					rectangleMenu();
					break;
				case 9:
					System.out.println("종료합니다.");
					return;
				default:
					System.out.println("다시 입력해주세요.");	
			}
		}
	}
	
	// 원메뉴
	public void circleMenu() {
		while (true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			
			switch (sc.nextInt()) {
				case 1:
					calcCircum();
					return;
				case 2:
					calcCircleArea();
					return;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					return;
				default:
					System.out.println("다시 입력해주세요.");	
			}
		}
	}
	
	// 직사각형메뉴
	public void rectangleMenu() {
		while (true) {
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			
			switch (sc.nextInt()) {
				case 1:
					calcPerimeter();
					return;
				case 2:
					calcRectArea();
					return;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					return;
				default:
					System.out.println("다시 입력해주세요.");	
			}
		}
	}
	
	// 원 둘레
	public void calcCircum() {
		int x, y, radius;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, radius));
		
	}
	
	// 원 넓이
	public void calcCircleArea() {
		int x, y, radius;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
		
	}
	
	// 직사각형 둘레 
	public void calcPerimeter() {
		int x, y, height, width;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
		System.out.print("너비 : ");
		width = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	
	// 직사각형 넓이
	public void calcRectArea() {
		int x, y, height, width;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
		System.out.print("너비 : ");
		width = sc.nextInt();
		System.out.println(rc.calcArea(x, y, height, width));
	}
	
	
	
	

}
