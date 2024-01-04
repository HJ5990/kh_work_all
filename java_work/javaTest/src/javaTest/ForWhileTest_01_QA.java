package javaTest;

import java.util.Scanner;

public class ForWhileTest_01_QA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int num;
//		
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		num = sc.nextInt();
//		
////		if (num > 1) {
////			for (int i = 1; i <= num ; i++) {
////				System.out.print(i + " ");
////			}
////		} else {
////			System.out.println("1 이상의 숫자를 입력해주세요");
////		}
//		
//		int i = 1;
//		while (i <= num) {
//			System.out.print(i + " ");
//			i++;
//		}
		
		
		
		
		
//		int num;
		
//		while (num < 1 ) {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if (num < 1)
//				System.out.println("1이상의 숫자를 입력하세요.");
//			else {
//				int i = 1;
//				while (i <= num) {
//					System.out.print(i + " ");
//					i++;
//				}
//			}
//		}
		
		



		
//		do {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if (num < 1)
//				System.out.println("1이상의 숫자를 입력하세요.");
//			else {
//				int i = 1;
//				while (i <= num) {
//					System.out.print(i + " ");
//					i++;
//				}
//			}
//		} while (num < 1 );
//		
		


		
//		for (int num=0 ; num < 1 ;) {
//			System.out.print("1이상의 숫자를 입력하세요. : ");
//			num = sc.nextInt();
//			if (num < 1) {
//				System.out.println("1이상의 숫자를 입력해주세요.");				
//			} else {
//				for (int i=num ; i >= 1 ; i--) {
//					System.out.print(i + " ");
//					
//				}
//			}
//		}
//		


		
		
		
//		int num, sum=0;
//		
//		System.out.print("정수를 하나 입력하세요 : ");
//		num = sc.nextInt();
//		
//		for (int i = 1 ; i <= num ; i++) {
//			sum += i;
//			if (i == num)
//				System.out.print(i + " = " + sum);
//			else
//				System.out.print(i + " + ");
//		}
		
		


		int num1, num2, min, max;
		
		
		
		// 내가 풀어본것
		
//		System.out.print("첫 번째 숫자 : ");
//		num1 = sc.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		num2 = sc.nextInt();
//		
//		if (num1 < 1 || num2 < 1) {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}else if (num1 > num2) {
//			for (int i = num2 ; i <= num1 ; i++) {
//				System.out.print(i + " ");
//			}
//		} else {
//			for (int i= num1 ; i <= num2 ; i++) {
//				System.out.print(i + " ");
//			}
//		}
	
		
		
		// 선생님 답변

//		System.out.print("첫 번째 숫자 : ");
//		num1 = sc.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		num2 = sc.nextInt();
//		
//		if (num1 > 0 && num2 > 0) {
//			
//			if (num1 > num2) {
//				max = num1;
//				min = num2;
//			} else {
//				max = num2;
//				min = num1;
//			}
//			for ( ; min <= max ; min++) {
//				System.out.print(min + " ");
//			}
//		} else {
//		System.out.println("1 이상의 숫자를 입력해주세요.");
//		}

		
		
		// 응용 문제
		
//		num1 = 0;
//		num2 = 0;
//	
//		while (num1 < 1 || num2 < 1) {
//			System.out.print("첫 번째 숫자 : ");
//			num1 = sc.nextInt();
//			System.out.print("두 번째 숫자 : ");
//			num2 = sc.nextInt();
//			
//			if (num1 < 1 || num2 < 1) {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			} else {
//				if (num1 > num2) {
//					max = num1;
//					min = num2;
//				} else {
//					max = num2;
//					min = num1;
//				}
//				for (int i = min; i <= max ; i++) {
//					System.out.print(i + " ");
//				}
//			}
//		}
		
		
		// do while 변형	
		
//		num1 = 0;
//		num2 = 0;
//	
//		 do {
//			System.out.print("첫 번째 숫자 : ");
//			num1 = sc.nextInt();
//			System.out.print("두 번째 숫자 : ");
//			num2 = sc.nextInt();
//			
//			if (num1 < 1 || num2 < 1) {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			} else {
//				if (num1 > num2) {
//					max = num1;
//					min = num2;
//				} else {
//					max = num2;
//					min = num1;
//				}
//				for (int i = min; i <= max ; i++) {
//					System.out.print(i + " ");
//				}
//			}
//		} while (num1 < 1 || num2 < 1);
		
		
		
		
		
		
//		int num1, num2, sum1, min, max;
		

		// 1~5 문제 반복학습
		
		
//		do {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num1 = sc.nextInt();
//			if (num1 < 1) {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			} else {
//				for (int i = 1 ; i <= num1 ; i++) {
//					System.out.print(i + " ");
//				}
//			}
//		} while (num1 < 1);
		

		
		
//		System.out.print("정수를 하나 입력하세요 : ");
//		num2 = sc.nextInt();
//		sum1 = 0;
//		
//		for (int i = 1; i <= num2; i++) {
//			sum1 += i;
//			if (i == num2)
//				System.out.print(i + " = ");
//			else 
//			System.out.print(i + " + ");
//			
//		}
//		System.out.println(sum1);
//		
		
		
		
		
		
		
		
		// 실습문제 8

//		int dan;
//		
//		
//		System.out.print("숫자 : ");
//		dan = sc.nextInt();
//		
//		System.out.println("===== " + dan + "단 =====");
//		
//		for (int i=1 ; i<=9 ; i++) {
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//		}

		
		
		
		// 실습문제9

//		int dan2=0;
//
//		
//		do {
//			System.out.print("숫자 : ");
//			dan2 = sc.nextInt();
//			
//			if (dan2 > 9) {
//			System.out.println("9 이하의 숫자만 입력해주세요.");
//			}
//			else {
//				
//				for (int j= dan2 ; j <=9 ; j++) {
//					System.out.println("===== " + j + "단 =====");
//					for (int i=1 ; i<=9 ; i++) {
//						System.out.println(j + " * " + i + " = " + (j * i));
//					}
//					dan2++;
//				}
//			}
//		} while (dan2 == 9);
			
		
		
		
		
		
		// 실습문제 11

//		int num3, num4;
//		
//		System.out.print("시작 숫자 : ");
//		num3 = sc.nextInt();
//		System.out.print("공차 : ");
//		num4 = sc.nextInt();
//		
//		for (int i = 1 ; i <=10; i++) {
//			System.out.print(num3 + " ");
//			num3 += num4;
//		}
		
		
		
		
		
		// 실습문제 12 (내가푼거)
		
		
//		int num1, num2;
//		String str;
//		
//		
//		do {
//			System.out.print("연산자(+, -, *, /, %) : ");
//			str = sc.next();
//			
//			if (str.equals("exit")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			
//			
//			System.out.print("정수1 : ");
//			num1 = sc.nextInt();
//			System.out.print("정수2 : ");
//			num2 = sc.nextInt();
//			
//			if (str.equals("/") && num2 == 0) {
//				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//			} else {
//				switch (str) {
//					case "+" :
//						System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//						break;
//					case "-" :
//						System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//						break;
//					case "/" :
//						System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//						break;
//					case "%" :
//						System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//						break;
//					case "*" :
//						System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//						break;
//					default:
//						System.out.println("없는 연산자입니다. 다시 입력해주세요.");
//				} break;
//			}
//		} while (true);
		
		
		
		
		// 실습문제 12 (선생님 답안)   // 정리 조금 필요함

//		int num3, num4;
//		String str2;
//		
//		while (true) {
//			System.out.print("연산자(+, -, *, /, %) : ");
//			str2 = sc.next();
//			
//			if (str.equals("exit")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			
//			System.out.print("정수1 : ");
//			num3 = sc.nextInt();
//			System.out.print("정수2 : ");
//			num4 = sc.nextInt();
//		
//
//			switch (str2) {
//				case "+":
//					System.out.print(num3 + " + " + num4 + " = " + (num3 + num4));
//					break;
//				case "-":
//					System.out.println(num3 + " - " + num4 + " = " + (num3 - num4));
//					break;
//				case "*":
//					System.out.println(num3 + " * " + num4 + " = " + (num3 * num4));
//					break;
//				case "/":
//					if (num4 == 0) {
//						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//					} else { 
//						System.out.println(num3 + " / " + num4 + " = " + (num3 / num4));
//						break;
//					}
//				case "%":
//					System.out.println(num3 + " % " + num4 + " = " + (num3 % num4));
//					break;
//				default:
//					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
//			}
//		}
			
			
		
		
		// 실습문제 13
		
//		int num5;
//		
//		System.out.print("정수 입력 : ");
//		num5 = sc.nextInt();
//		
//		for (int i=1; i <=num5 ; i++) {
//			for (int j=1 ; j<=i ; j++) {
//				System.out.print('*');
//			}	
//			System.out.println();
//		}
		
			
			
			
		// 실습문제 1
		
		
//		int num6;
//		
//		System.out.print("정수 : ");
//		num6 = sc.nextInt();
//		
//		if (num6 < 1) {
//			System.out.println("양수가 아닙니다.");
//		} else {
//			for (int i = 1 ; i <= num6 ; i++) {
//				if (i % 2 == 1) {
//					System.out.print('박');
//				} else {
//					System.out.print('수');
//				}
//			}
//		}
		
		
				
		
		
		// 실습문제 2  (1의 응용. 질문반복)
		
//		int num6;
//		
//		do {
//			System.out.print("정수 : ");
//			num6 = sc.nextInt();
//			
//			if (num6 < 1) {
//				System.out.println("양수가 아닙니다.");
//			} else {
//				for (int i = 1 ; i <= num6 ; i++) {
//					if (i % 2 == 1) {
//						System.out.print('박');
//					} else {
//						System.out.print('수');
//					}
//				}
//			}
//		} while (num6 < 1);
		
			
			
		
		// 실습문제 5
		
//		int num1, num2, sum=1;
//		
//		System.out.print("난수를 입력하세요 : ");
//		num1 = sc.nextInt();
//		
//		do {
//		System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
//		num2 = sc.nextInt();
//		
//			if (0 >= num2 || num2 > 100) {
//				System.out.println("1~100 사이의 숫자를 입력해주세요.");
//				continue;
//			} else {
//				if (num2 > num1) {
//					System.out.println("DOWN!");
//					sum++;
//				} else if (num2 < num1) {
//					System.out.println("UP!");
//					sum++;
//				} else {
//					System.out.println("정답입니다!!");
//					System.out.println(sum + "회만에 맞추셨습니다.");
//					break;
//				}
//			}
//		} while (true);
		
		
		
		
		
		
		// 위의 문제 반복
		
		
//		
//		int num7;
//		
//		System.out.print("정수 입력 : ");
//		num7 = sc.nextInt();
//		
//		for (int i = 1 ; i <=num7 ; i++) {
//			for (int j = 1 ; j <= i ; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
	}

}
