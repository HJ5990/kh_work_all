package javaTest;
import java.util.*;

public class ArraysTest_02_QA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			
		
	// 실습문제 0
		
//		String[][] arr4 = new String[3][3];
//
//		for (int i = 0 ; i < arr4.length; i++) {
//			for (int j = 0 ; j < arr4[i].length; j++) {
//				arr4[i][j] = "(" + i + ", " + j + ")";
//				System.out.print(arr4[i][j]);
//			} System.out.println();
//		}
		
		
		
		// 실습문제 1
		// 3행 3열짜리 문자형 배열을 선언하고 a~i까지 차례대로 저장, 출력
//		char ch = 'a';
//		char[][] arr5 = new char[3][3];
//		
//		for (int i = 0 ; i < arr5.length; i++) {
//			for (int j = 0 ; j < arr5[i].length; j++) {
//				arr5[i][j] = ch++;
//				System.out.print(arr5[i][j] + " ");
//			} System.out.println();
//		}
		
		
		
		// 실습문제 2
		// 4행 4열짜리 정수형 배열을 선언하고 1~16까지 차례대로 저장, 출력
//		int[][] arr6 = new int[4][4];
//		int count = 1;
//		
//		for (int i=0; i < arr6.length; i++) {
//			for (int j=0; j < arr6[i].length; j++) {
//				arr6[i][j] = count++;
//				System.out.print(arr6[i][j] + " ");
//			} System.out.println();
//		}
		
		
		
		// 실습문제 3
		// 4행 4열짜리 정수형 배열을 선언하고 1~16까지 거꾸로 저장, 출력
//		int[][] arr6 = new int[4][4];
//		int count = 16;
//		
//		for (int i=0; i < arr6.length; i++) {
//			for (int j=0; j < arr6[i].length; j++) {
//				arr6[i][j] = count--;
//				System.out.print(arr6[i][j] + " ");
//			} System.out.println();
//		}
		
		
		
		
		// 실습문제 4 (내가푼거)
		
//		int[][] arr7 = new int[4][4];
//		int count = 1;
//		
//		// 1~9까지
//		for (int i=0; i < arr7.length-1; i++) {
//			for (int j=0; j < arr7[i].length-1; j++) {
//				arr7[i][j] = count++;
//			}
//		}
//		// 행의 합
//		for (int i =0; i < arr7.length-1 ; i++) {
//			arr7[i][3] = arr7[i][0] + arr7[i][1] + arr7[i][2];
//		}
//		// 열의 합
//		for (int i =0; i < arr7[i].length-1 ; i++) {
//			arr7[3][i] = arr7[0][i] + arr7[1][i] + arr7[2][i];
//		}
//		// 행+열의 합
//		arr7[3][3] = arr7[0][3] + arr7[1][3] + arr7[2][3] +
//						arr7 [3][0] + arr7[3][1] + arr7[3][2];
//		// 출력
//		for (int i=0; i < arr7.length; i++) {
//			for (int j=0; j < arr7[i].length; j++) {
//				System.out.print(arr7[i][j] + " ");
//			} System.out.println();
//		}
		
		
		
		// 실습문제 4 (선생님 답안)
		
		int[][] arr8 = new int[4][4];
		// 0~2열 계산
		for (int i=0; i< arr8.length - 1; i++) {
			for (int j=0; j < arr8[i].length - 1; j++) {
				arr8[i][j] = (j + 1 + (i * 3));
				arr8[i][3] += arr8[i][j];
				arr8[3][3] += arr8[i][j];
			}
			// 3열 계산 (밑에 주석 줄인것)
			for (int h=0; h< arr8.length -1 ; h++) {
				arr8[3][h] += arr8[i][0];
				arr8[3][3] += arr8[i][h];
			}
//			arr8[3][0] += arr8[i][0];
//			arr8[3][1] += arr8[i][1];
//			arr8[3][2] += arr8[i][2];
//			arr8[3][3] += arr8[i][0];
//			arr8[3][3] += arr8[i][1];
//			arr8[3][3] += arr8[i][2];
		}
		
		// 출력
		for (int i=0; i < arr8.length; i++) {
			for (int j=0; j < arr8[i].length; j++) {
				System.out.print(arr8[i][j] + " ");
			} System.out.println();
		}
		
		
		
		
	}	
}
		
		

