package javaTest;
import java.util.*;

public class SwitchTest_01_QA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

//		int num;
//		String str;
//		
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("7. 종료");
//		System.out.print("메뉴 번호를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		if (num == 1)
//			System.out.println("입력 메뉴입니다.");
//		else if (num == 2)
//			System.out.println("수정 메뉴입니다.");
//		else if (num == 3)
//			System.out.println("조회 메뉴입니다.");
//		else if (num == 4)
//			System.out.println("삭제 메뉴입니다.");
//		else if (num == 7)
//			System.out.println("프로그램이 종료됩니다.");
//		else
//			System.out.println("잘못 입력하셨습니다.");
		
				
		
		

		
//		int num;
//		
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("7. 종료");
//		System.out.print("메뉴 번호를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		switch (num) {
//		case 1:
//			System.out.println("입력 메뉴입니다.");
//			break;
//		case 2:
//			System.out.println("수정 메뉴입니다.");
//			break;
//		case 3:
//			System.out.println("조회 메뉴입니다.");
//			break;
//		case 4:
//			System.out.println("삭제 메뉴입니다.");
//			break;
//		case 7:
//			System.out.println("종료 메뉴입니다.");
//			break;
//		default:
//			System.out.println("잘못 입력하셨습니다.");
//		}
	
		
		
		// 실습문제 2
		
//		int num;
//		
//		System.out.print("숫자를 한 개 입력하세요 : ");
//		num = sc.nextInt();
//		
////		if (num > 0)
////			if (num % 2 == 0)
////				System.out.println("짝수다");
////			else
////				System.out.println("홀수다");
////		else
////			System.out.println("양수만 입력해주세요.");
//
//	
//		
//		if (num > 0 && num % 2 == 0)
//			System.out.println("짝수다");
//		else if (num > 0 && num % 2 != 00)
//			System.out.println("홀수다");
//		else
//			System.out.println("양수만 입력해주세요");
//		
		
		
		
		// 실습문제3
	
//		int a, b, c, sum;
//		float average;
//		
//		System.out.print("국어점수 : ");
//		a = sc.nextInt();
//		System.out.print("수학점수 : ");
//		b = sc.nextInt();
//		System.out.print("영어점수 : ");
//		c = sc.nextInt();
//		
//		sum = a + b + c;
//		average = sum/3.0f;
//		
//		if (a >= 40 && b >= 40 && c >= 40 && average >= 60) {
//			System.out.println("국어 : " + a);
//			System.out.println("수학 : " + b);
//			System.out.println("영어 : " + c);
//			System.out.println("합계 : " + sum);
//			System.out.println("평균 : " + average);
//			System.out.println("축하합니다, 합격입니다!");
//		} else {
//			System.out.println("불합격입니다.");
//		}
		
		
		
		
		
		// 실습문제 4
	
//		String a, b;
//		final String ID = "myId", PASS = "myPassword12";
//				
//		System.out.print("아이디 : ");
//		a = sc.next();
//		System.out.print("비밀번호 :");
//		b = sc.next();
//		
//		if (a.equals(ID) && b.equals(PASS)) {
//			System.out.println("로그인 성공");		
//		} else if (!b.equals(PASS)) {
//			System.out.println("비밀번호가 틀렸습니다.");
//		} else if (!a.equals(ID)) {
//			System.out.println("아이디가 틀렸습니다");
//		}
		
		
		
		// 실습문제 5
		
//		int month;
//		String season;
//		
//		month = sc.nextInt();
//		
////		if(month == 1 || month == 2 || month == 12) {
////			season = "겨울";
////					
////		} else if (month >= 3 && month <= 5) {
////			season = "봄";
////		} else if (month >= 6 && month <= 8) {
////			season = "여름";
////		} else if (month >= 9 && month <= 11) {
////			season = "가을";
////		} else {
////			season ="해당하는 계절이 없습니다";
////		}
////	System.out.println(season);
//	
//		switch (month) {
//			case 1: case 2: case 12:
//				season = "겨울";
//				break;
//			case 3: case 4: case 5:
//				season = "봄";
//				break;
//			case 6: case 7: case 8:
//				season = "여름";
//				break;
//			case 9: case 10: case 11:
//				season = "가을";
//				break;
//			default :
//				season = "해당하는 계절이 없습니다";
//		}
//		
//		System.out.println(season);
		
		
		
		
		
		// 실습문제 6
		
//		String input;
//		
//		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
//		input = sc.next();
//		
////		switch (input) {
////			case "관리자" :
////				System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
////				break;
////			case "회원" :
////				System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
////				break;
////			case "비회원" :
////				System.out.println("게시글 조회");
////				break;
////		}
//				
//			if (input.equals("관리자"))
//				System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
//			else if (input.equals("회원"))
//				System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//			else if (input.equals("비회원"))
//				System.out.println("게시글 조회");
		
		
		
		// 실습문제 7
		
//		double a, b, c;
//		
//		System.out.print("키(m)를 입력해 주세요 : ");
//		a = sc.nextDouble();
//		System.out.print("몸무게(kg)를 입력해 주세요 : ");
//		b = sc.nextDouble();
//		
//		c = b / (a * a) ;
//		
//		System.out.println("BMI 지수 : " + c);
//		
//		if (c < 18.5)
//			System.out.println("저체중");
//		else if (18.5 <= c && c < 23)
//			System.out.println("정상체중");
//		else if (23 <= c && c < 25)
//			System.out.println("과체중");
//		else if (25 <= c && c < 30)
//			System.out.println("비만");
//		else
//			System.out.println("고도비만");
		
		
		
		
		// 실습문제 8
		
//		int num1, num2 ;
//		char a;
//		
//		System.out.print("피연산자1 입력 : ");
//		num1 = sc.nextInt();
//		System.out.print("피연산자2 입력 : ");
//		num2 = sc.nextInt();
//		System.out.print("연산자를 입력(+,-,*,/,% : ");
//		a = sc.next().charAt(0);
//		
////		if (num1 > 0 && num2 > 0) {
////			if (a == '+') {
////				System.out.println(num1 + " " + a + " " + num2 + " = " + (num1+num2));
////			} else if (a == '-') {
////				System.out.println(num1 + " " + a + " " + num2 + " = " + (num1-num2));
////			} else if (a == '*') {
////				System.out.println(num1 + " " + a + " " + num2 + " = " + (num1*num2));
////			} else if (a == '/') {
////				System.out.printf("%d %c %d = %.6f \n", num1, a, num2, ((double)num1/num2));
//////				System.out.println(num1 + " " + a + " " + num2 + " = " + ((double)num1/num2));
////			} else if (a == '%') {
////				System.out.println(num1 + " " + a + " " + num2 + " = " + (num1%num2));
////			} else {
////			 	System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
////			}
////		} else
////			System.out.println("양수를 입력하세요.");
//		
//		if (num1 > 0 && num2 > 0) {
//			switch (a) {
//				case '+':
//					System.out.println(num1 + " " + a + " " + num2 + " = " + (num1+num2));
//					break;
//				case '-':
//					System.out.println(num1 + " " + a + " " + num2 + " = " + (num1-num2));
//					break;
//				case '*':
//					System.out.println(num1 + " " + a + " " + num2 + " = " + (num1*num2));
//					break;
//				case '/':
//					System.out.printf("%d %c %d = %.6f \n", num1, a, num2, ((double)num1/num2));
//					break;
//				case '%':
//					System.out.println(num1 + " " + a + " " + num2 + " = " + (num1%num2));
//					break;
//				default :
//					System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
//			}
//		} else {
//			System.out.println("양수를 입력하세요.");
//		}
		
		
		
		
		// 실습문제 9
		
//		int num1, num2, num3, num4;
//		double total1;
//	
//		System.out.print("중간 고사 점수 : ");
//		num1 = sc.nextInt();
//		System.out.print("기말 고사 점수 : ");
//		num2 = sc.nextInt();
//		System.out.print("과제 점수 : ");
//		num3 = sc.nextInt();
//		System.out.print("출석 회수 : ");
//		num4 = sc.nextInt();
//		
//		total1 = (num1 * 0.2)+(num2 * 0.3)+(num3 * 0.3)+(num4);
//		
//		System.out.println("============== 결과 ==============");
//		System.out.println("중간 고사 점수(20) : " + (num1 * 0.2));
//		System.out.println("기말 고사 점수(30) : " + (num2 * 0.3));
//		System.out.println("과제 점수    (30) : " + (num3 * 0.3));
//		System.out.println("출석 점수    (20) : " + (double)num4);
//		System.out.println("총점 : " + total1);
//		
//		
//		if (total1 < 70 || (20*0.7) > num4)
//			if ((20*0.7) <= num4)
//				System.out.println("fail [점수 미달]");
//			else
//				System.out.println("fail [출석 미달]");
//		else
//			System.out.println("pass");
//		
//		
////		if (total1 >= 70 && (20*0.7) <= num4)
////			System.out.println("pass");
////		else if ((20*0.7) > num4)
////			System.out.println("fail [출석 미달]");
////		else
////			System.out.println("fail [점수 미달]");
		
		
		
		
		// 실습문제 10  (실습문제 종합)
		
//		int number;
//		
//		System.out.println("실행할 기능을 선택하세요.");
//		System.out.println("1. 권한 확인");
//		System.out.println("2. BMI");
//		System.out.println("3. 계산기");
//		System.out.println("4. P/F");
//		number = sc.nextInt();
//		
//		System.out.print("선택 : " + number);
//		System.out.println();
//		
//		if (number == 1) {
//			String input;
//		
//			System.out.print("권한을 확인하고자 하는 회원 등급 : ");
//			input = sc.next();
//			
//			if (input.equals("관리자"))
//				System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
//			else if (input.equals("회원"))
//				System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//			else if (input.equals("비회원"))
//				System.out.println("게시글 조회");
//		} else if (number == 2) {
//			
//			double a, b, c;
//			
//			System.out.print("키(m)를 입력해 주세요 : ");
//			a = sc.nextDouble();
//			System.out.print("몸무게(kg)를 입력해 주세요 : ");
//			b = sc.nextDouble();
//			
//			c = b / (a * a) ;
//			
//			System.out.println("BMI 지수 : " + c);
//			
//			if (c < 18.5)
//				System.out.println("저체중");
//			else if (18.5 <= c && c < 23)
//				System.out.println("정상체중");
//			else if (23 <= c && c < 25)
//				System.out.println("과체중");
//			else if (25 <= c && c < 30)
//				System.out.println("비만");
//			else
//				System.out.println("고도비만");
//			
//		} else if (number == 3) {
//			int num1, num2 ;
//			char a;
//			
//			System.out.print("피연산자1 입력 : ");
//			num1 = sc.nextInt();
//			System.out.print("피연산자2 입력 : ");
//			num2 = sc.nextInt();
//			System.out.print("연산자를 입력(+,-,*,/,% : ");
//			a = sc.next().charAt(0);
//			
//			if (num1 > 0 && num2 > 0) {
//				switch (a) {
//					case '+':
//						System.out.println(num1 + " " + a + " " + num2 + " = " + (num1+num2));
//						break;
//					case '-':
//						System.out.println(num1 + " " + a + " " + num2 + " = " + (num1-num2));
//						break;
//					case '*':
//						System.out.println(num1 + " " + a + " " + num2 + " = " + (num1*num2));
//						break;
//					case '/':
//						System.out.printf("%d %c %d = %.6f \n", num1, a, num2, ((double)num1/num2));
//						break;
//					case '%':
//						System.out.println(num1 + " " + a + " " + num2 + " = " + (num1%num2));
//						break;
//					default :
//						System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
//				}
//			} else {
//				System.out.println("양수를 입력하세요.");
//			}
//			
//		} else if (number == 4) {
//			
//			int num1, num2, num3, num4;
//			double total2;
//		
//			System.out.print("중간 고사 점수 : ");
//			num1 = sc.nextInt();
//			System.out.print("기말 고사 점수 : ");
//			num2 = sc.nextInt();
//			System.out.print("과제 점수 : ");
//			num3 = sc.nextInt();
//			System.out.print("출석 회수 : ");
//			num4 = sc.nextInt();
//			
//			total2 = (num1 * 0.2)+(num2 * 0.3)+(num3 * 0.3)+(num4);
//			
//			System.out.println("============== 결과 ==============");
//			System.out.println("중간 고사 점수(20) : " + (num1 * 0.2));
//			System.out.println("기말 고사 점수(30) : " + (num2 * 0.3));
//			System.out.println("과제 점수    (30) : " + (num3 * 0.3));
//			System.out.println("출석 점수    (20) : " + (double)num4);
//			System.out.println("총점 : " + total2);
//			
//			
//			if (total2 < 70 || (20*0.7) > num4)
//				if ((20*0.7) <= num4)
//					System.out.println("fail [점수 미달]");
//				else
//					System.out.println("fail [출석 미달]");
//			else
//				System.out.println("pass");
//			
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		
		
		
		
		
	}
		
}
