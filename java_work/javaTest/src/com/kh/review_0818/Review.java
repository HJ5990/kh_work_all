package com.kh.review_0818;
import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		// int형 변수 num을 입력받으세요
//		// num이 10보다 크면 "10초과" 작거나 같으면 "10이하 출력
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		
////		System.out.print("정수를 입력하세요 :");
////		num = sc.nextInt();
////		if (num > 10) {
////			System.out.println("10 초과");
////		} else if (num <= 10) {
////			System.out.println("10 이하");
////		}
//		
//		// 1000에서 1~num 까지 순서대로 전부 뺀 값을 출력
//		int value = 1000;
//		for (int i=1; i<= num; i++) {
//			value -= i;
//		}
//		System.out.println(value);
//
//		
//		// num크기의 int 형 배열을 만들고 모든 인덱스에 num의 숫자를 저장하고 출력
//		int[] arr = new int[num];
//		for (int i=0; i < arr.length; i++) {
//			arr[i] = num;
//			System.out.print(arr[i] + " ");
//		}
		
		
		Student kim = new Student("김효주", 50);
		kim.makeSound();
		kim.sleep();
		kim.swim();

		// 업캐스팅 다운캐스팅
		Human lee = new Student("김효주", 50);
		lee.makeSound();
		((Student)lee).sleep();
		((Student)lee).swim();
		

		
		
	}

}
