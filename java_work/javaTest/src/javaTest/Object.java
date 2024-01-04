package javaTest;

public class Object {

	public static void main(String[] args) {

		// 메서드 예제 1
//		System.out.println("프로그램의 시작");
//		hiEveryone(12);
//		hiEveryone(13);
//		System.out.println("프로그램의 끝");
//	}
//	public static void hiEveryone(int age) {
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 " + age + "세 입니다.");
//	}

		
		
		
		// 메서드 예제 2 - 매개변수가 없는 메서드
//		double myHeight = 175.9;
//		hiEveryone(12, 12.5);
//		hiEveryone(12, myHeight);
//		byEveryone();
//	}
//	
//	public static void hiEveryone(int age, double height) {
//		System.out.println("제 나이는 " + age + "세 입니다.");
//		System.out.println("제 키는 " + height + "cm 입니다.");
//	}
//		
//	public static void byEveryone() {
//		System.out.println("다음에 뵙겠습니다");
//	}
		
		
		
		
		// 메서드 예제3 - 값을 반환하는 메서드 (reture)
//		int result;
//		result = adder(4, 5);
//		System.out.println("4 + 5 = " + result);
//		System.out.println("3.5 * 3.5 = " + square(3.5));
//	}
//
//	public static int adder(int num1, int num2) {
//		int addResult = num1 + num2;
//		return addResult;
//	}
//	public static double square(double num) {
//		return num * num;
//	}
	
	
		
		
		// 메서드 재귀 호출 (3!)
//		System.out.println(factorial(3));
//}
//	
//	public static int factorial(int n) {
//		if (n == 1)
//			return 1;
//		else
//			return n * factorial(n-1);
//	}
	
		
		
		
		
		
		// 통장 객체 생성 1
		
//		BankAccount yoon = new BankAccount();
//		BankAccount park = new BankAccount();
//		
//		System.out.println(yoon.balance);
//		System.out.println(park.balance);
//		
//		yoon.deposit(1000);
//		park.deposit(2000);
//		
//		/* yoon과 park의 참조변수(주소) 바꾸기
//		 * BankAccount tmp;
//		 * tmp = yoon;
//		 * yoon = park;
//		 * park = tmp;
//		 * tmp = null;   // 참조변수에 null 넣으면 연결되어있던 주소 끊어줌
//	 	 */
//		
//		yoon.cheakMyBalance();
//		park.cheakMyBalance();
		
	
		
		
		// 통장 객체 생성 2 (생성자 이용)
		
		// 기본생성자로 객체 생성해서 이름, 잔액 출력
		BankAccount choi = new BankAccount();
		System.out.println(choi.name + choi.balance);
		
		// 매개변수가 2개인 생성자로 객체 생성하고 이름, 잔액 출력
		BankAccount kim = new BankAccount(10000, "김지원");
		System.out.println(kim.name + kim.balance);
	
		
	
	}
}
	

// 통장 클래스 생성
class BankAccount {
	int balance = 0;
	String name;
	
	//기본 생성자 (내가 생성자 안만들면 자동으로 생기는것.)
	public BankAccount() {
		balance = 0;
		name = "이름없음";
		}
	
	// 생성자 (내가 만든 것)
	public BankAccount(int b, String n) {
		balance = b;
		name = n;
		}
	
	public void name(String n) {
		name = n;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int cheakMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	





}
	



	