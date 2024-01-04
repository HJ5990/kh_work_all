package javaTest;
import java.util.*;

public class Arrays1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
//		int[] ar = new int[3];
//		
//		ar[0] = 7;
//		ar[1] = 8;
//		ar[2] = 9;
//		
//		int num = ar[0] + ar[1] + ar[2];
//		System.out.println(num);
		
		
		
		
//		// 길이가 5인 int형 1차원 배열
//		int[] ar1 = new int[5];
//		
//		// 길이가 7일 double형 1차원 배열
//		double[] ar2 = new double[7];
//		
//		// 배열의 변수선언과 메모리할당을 분리하며 길이가 9인 float형 배열 ar3 생설
//		float[] ar3;
//		ar3 = new float[9];
//		
//		// 배열의 길이를 구하는 방법
//		System.out.println("ar1의 길이 : " + ar1.length);
//		System.out.println("ar1의 길이 : " + ar2.length);
//		System.out.println("ar1의 길이 : " + ar3.length);
//		
//		// 문자열의 길이 구하는 방법
//		String str = "abcde";
//		System.out.println("str의 길이 : " + str.length());
		
		
//		// 문자열 배열의 총 길이 구하는 방법
//		String str1[] = new String[5];
//		str1[0] = "hyoju";
//		str1[1] = new String("acd");
//		str1[4] = "hi";
//		str1[2] = "tree";
//		str1[3] = "kim";
//		
//		int count = 0;
//		
//		for (int i = 0; i < str1.length; i++)
//			count += str1[i].length();
//		
//		
////		System.out.println("총 문자의 수는 " + (int)(str1[0].length() + str1[1].length() + str1[2].length() + str1[3].length() + str1[4].length()));
//		System.out.println("총 문자의 수는 " + count);
//		
		
//		// 배열 : 얕은 복사
//		int[] arr1 = {1, 2, 3, 4, 5};
//		int[] arr2 = arr1;
//		arr2[2] = 0;
//		
//		System.out.println(arr1[2]);
		
		
		
		
		
//		// 배열 : 깊은 복사 (복제, 완전한 복사) 방법1
//		int[] arr1 = {1, 2, 3, 4, 5};
//		int[] arr2 = new int[5];
//		for(int i = 0 ; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
		
		
		// 배열 : 깊은 복사 (복제, 완전한 복사) 방법2
//		int[] arr1 = {1, 2, 3, 4, 5};
//		int[] arr2 = new int[5];
//		arr2 = arr1.clone();
		
		// 배열 arr1을 전부 7로 초기화
//		Arrays.fill(arr1, 7);
		
		
		
//		
//		
//		//반복문을 통해서 arr1, arr2에 있는 모든 요소 출력
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
		
		
		
		
//		// 1. 배열형식의 참조변수 선언 (메모리의 주소값이 저장)
//		int[] ref;   
//		// 2. 배열 객체 할당 
//		ref = new int[6];
//		// 3. 배열 데이터의 초기화 1
//		ref[0] = 1;
//		ref[1] = 2;
//		ref[2] = 3;
//		ref[3] = 4;
//		ref[4] = 5;
//		ref[5] = 6;
//		// 배열 데이터의 초기화 2
//		for (int i = 0; i < ref.length; i++) {
//			ref[i] = i + 1;
//		}
//	
//		// 1~3번을 한번에
//		int[] ref2 = {1,2,3,4,5,6};
//		
//		// 4. 배열 데이터 활용 (반복문을 이용해서 배열 전체값 출력)
//		for (int i = 0; i<ref.length; i++) {
//		System.out.print(ref[i]);
//		}
		
		
		
		
		/* 전체적인 복습 */
		
		
		// int형 변수 num을 생성하고 값을 10으로 초기화
		int num = 10;
		
		// String형 변수 str을 생성하고 값을 'hi' 로 초기화
		String str = "hi";
		
		//num과 str을 출력
		System.out.println(num);
		System.out.println(str);
		
		// 만약 num이 5보다 크다면 "num은 5보다 큰 수 입니다" 출력
		// 더 작다면 "num은 5보다 작은 수 입니다" 출력
		// 5라면 "num은 5입니다" 출력
		if (num > 5)
			System.out.println("num은 5보다 큰 수 입니다");
		else if (num < 5)
			System.out.println("num은 5보다 작은 수 입니다");
		else 
			System.out.println("num은 5입니다");

		// 반복문을 활용해서 1~num 까지 숫자를 순차적으로 출력
		// ex) num = 3일때 1 2 3 출력
		// for while 각각 작성
		int num1 = 5;
		for (int i = 1 ; i <= num1 ; i++) {
			System.out.print(i + " ");
		} System.out.println();
		
		int j = 1;
		while (j <= num1) {
			System.out.print(j + " ");
			j++;
		} System.out.println();
		
		// 길이가 20인 int형 배열 arr 생성 후
		// 반복문을 이용하여 값을 1~20까지 순차적으로 초기화
		// 반복문을 이용하여 arr 요소 전체출력
		int[] arr = new int[20];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		} System.out.println();
	
		//String형 길기아 5인 배열 arr2를 생성과 동시에
		// {"사과", "포도", "귤", "파인애플", "바나나"} 로 초기화
		// 반복문을 이용하여 arr2 요소 전체출력
		String[] arr2 = {"사과", "포도", "귤", "파인애플", "바나나"};
		
		for(int i = 0 ; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		
		
		
		
	}

}
