package javaTest;
import java.util.*;

public class ArraysTest_03_QA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// 전체 복습
		
		
		
/*
		// double형 변수 num을 생성하고 3.75를 대입하기
		double num = 3.75;
		
		// int형 변수 num2를 생성하고 숫자를 하나 입력받기
		int num2;
		System.out.print("정수 입력 : ");
		num2 = sc.nextInt();
		
		// 입력받은 num2(길이)를 활용하여 1차원 배열을 하나 만들고 모든 수를 5로 초기화
		int[] arr = new int[num2];
		for (int i=0; i < arr.length; i++)
			arr[i] = 5;
		
		// arr배열 인덱스 2에 0을 넣기
		arr[2] = 0;
		
		// arr배열을 처음부터 끝까지 아래와 같은 방식으로 출력
		// 배열안의 값이 5이면 출력, 0이면 "5가 아닙니다"
		for (int i=0; i < arr.length; i++) {
			if (arr[i] == 5)
				System.out.print(arr[i] + " ");
			else
				System.out.print("5가 아닙니다" + " ");
		}
*/
		
		
		
		
		// 연산자 실습문제7
		
//		int num1, num2, num3, sum;
//		System.out.print("국어 : ");
//		num1 = sc.nextInt();
//		System.out.print("영어 : ");
//		num2 = sc.nextInt();
//		System.out.print("수학 : ");
//		num3 = sc.nextInt();
//		
//		sum = num1 + num2 + num3;
//		
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + sum/3.0);
//		
//		if (num1 >= 50 && num2 >= 50 && num3 >= 50 && sum/3 >= 70)
//			System.out.println("합격");
//		else
//			System.out.println("불합격");
		
		
		
		// 반복문 실습문제 4
		
//		int num;
//		
//		do {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			
//			if (num >= 1) {
//				for (int i= num ; i > 0; i--) {
//					System.out.print(i + " ");
//				}
//				break;
//			}
//		} while (num <= 0);
		
		
		
		
		// 2차원배열 실습문제 5
		
//		int num1, num2;
//		char[][] arr;
//		
//		do {
//			System.out.print("행 크기 : ");
//			num1 = sc.nextInt();
//			System.out.print("열 크기 : ");
//			num2 = sc.nextInt();
//			
//			if (num1 <= 10 && num1 > 0 && num2 <= 10 && num2 > 0) {
//				arr = new char[num1][num2];
//				for (int i=0; i<arr.length; i++) {
//					for (int j=0; j<arr[i].length; j++) {
//						arr[i][j] = (char)(Math.random()* 26 + 65);
//						System.out.print(arr[i][j] + " ");
//					}
//					System.out.println();
//				} break;
//			} else {
//				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다");
//			}
//		} while (true);
			
		
		
		// 2차원배열 실습문제 6 (가로출력, 세로출력)
		
//		String[][] strArr = {
//				{"이", "까", "왔", "앞", "힘"},
//				{"차", "지", "습", "으", "냅"},
//				{"원", "열", "니", "로", "시"},
//				{"배", "심", "다", "좀", "다"},
//				{"열", "히", "!", "더", "!!"}
//				
//		};
//		
//		for (int i=0; i < strArr.length; i++) {
//			for (int j=0; j < strArr[i].length; j++) {
//				System.out.print(strArr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for (int i=0; i < strArr.length; i++) {
//			for (int j=0; j < strArr[i].length; j++) {
//				System.out.print(strArr[j][i] + " ");
//			}
//			System.out.println();
//		}
		
		
		
		// 2차원배열 실습문제 7 (내가푼거 - 못품)
		
//		int num, num0, num1, num2, num3, count=65;
//		
//		System.out.print("행 크기 : ");
//		num = sc.nextInt();
//		System.out.print("0행의 열 크기 : ");
//		num0 = sc.nextInt();
//		System.out.print("1행의 열 크기 : ");
//		num1 = sc.nextInt();
//		System.out.print("2행의 열 크기 : ");
//		num2 = sc.nextInt();
//		System.out.print("3행의 열 크기 : ");
//		num3 = sc.nextInt();
//		
//		
//		char[] arr0 = new char[num0];
//		char[] arr1 = new char[num1];
//		char[] arr2 = new char[num2];
//		char[] arr3 = new char[num3];
//		char[][] arr = new char[num][];
//		
//		for (int i=0; i < arr.length; i++) {
//			for (int j=0; j < arr[i].length; j++) {
//				arr[i][j] = (char)count;
//				System.out.print(arr[i][j]);
//				count++;
//			}
//			System.out.println();
//		}
		
		
		
		
		// 2차원배열 실습문제 7 (선생님답안)
		
//		int row;
//		System.out.print("행 크기 : ");
//		row = sc.nextInt();
//		
//		// 열 크기 입력받기 및 설정 (참조변수 활용)
//		char[][] arr = new char[row][];
//		for (int i=0; i < arr.length; i++) {
//			int col;
//			System.out.print(i + "행의 열 크기 : ");
//			col = sc.nextInt();
//			arr[i] = new char[col];
//		}
//		
//		// 2차원배열에 값대입 + 출력 (다른거랑 똑같음)
//		char al = 'a';
//		for (int i=0; i < arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = al++;
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
		
		// 2차원배열 실습문제 8
		
		String[] arr1 = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
						"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr2 = new String[3][2];
		String[][] arr3 = new String[3][2];
		
		int count = 0;
		
		System.out.println("== 1분단 ==");
		for (int i=0; i < arr2.length; i++) {
			for (int j=0; j < arr2[i].length; j++) {
				arr2[i][j] = arr1[count++];
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for (int i=0; i < arr3.length; i++) {
			for (int j=0; j < arr3[i].length; j++) {
				arr3[i][j] = arr1[count++];
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		// 이름 검색기능 추가  (내가 한거 = 풀었음)
//		String name;
//		System.out.print("검색할 학생 이름을 입력하세요 : ");
//		name = sc.next();
//		
//		for (int i=0; i < arr2.length; i++) {
//			for (int j=0; j < arr2[i].length; j++) {
//				if (arr2[i][j].equals(name)) {
//					if (arr2[i][j] == arr2[i][1]) {
//					System.out.println("검색하신 " + name + " 학생은 1분단 " + (i+1) + "번째 줄 오른쪽에 있습니다.");
//					} else {
//					System.out.println("검색하신 " + name + " 학생은 1분단 " + (i+1) + "번째 줄 왼쪽에 있습니다.");
//					}
//				} else {
//					continue;
//				}
//			}
//		}
//		for (int i=0; i < arr3.length; i++) {
//			for (int j=0; j < arr3[i].length; j++) {
//				if (arr3[i][j].equals(name)) {
//					if (arr3[i][j] == arr3[i][1]) {
//					System.out.println("검색하신 " + name + " 학생은 2분단 " + (i+1) + "번째 줄 오른쪽에 있습니다.");
//					} else {
//					System.out.println("검색하신 " + name + " 학생은 2분단 " + (i+1) + "번째 줄 왼쪽에 있습니다.");
//					}
//				} else {
//					continue;
//				}
//			}
//		}
		
		
		// 선생님 답안 (다른방식)

		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		int bundan=0, line=0, isRight=0;
		boolean isTrue = false;
		
		for (int i=0; i < arr2.length && !isTrue; i++) {
			for (int j=0; j < arr2[i].length; j++) {
				if (arr2[i][j].equals(name)) {
					bundan = 1;
					line = i;
					isRight = j;
					isTrue = true;
				}
			}
		}
		
		if (!isTrue) {
			for (int i=0; i < arr3.length && !isTrue; i++) {
				for (int j=0; j < arr3[i].length; j++) {
					if (arr3[i][j].equals(name)) {
						bundan = 2;
						line = i;
						isRight = j;
						isTrue = true;
					}
				}
			}
		}
		
		if (isTrue) {
			System.out.println("검색하신 " + name + " 학생은 " + bundan + "분단 " + 
							(line+1) + "번째 줄 " + (isRight == 0? "왼쪽" : "오른쪽") +"에 있습니다.");
			
		} else {
			System.out.println("검색하신 " + name + " 학생은 찾지 못했습니다." );
		}
		
		
		
	}
}

	








	