package javaTest;
import java.util.*;

public class Input {
	public static void main(String[] args) {
		
		// 숫자 입력 받기
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		float num2 = sc.nextFloat();
//		System.out.println(num1 + num2);
//		
//		// 문자열 입력 받기
//		String str;
//		Scanner sc1 = new Scanner(System.in);
//		str = sc1.nextLine();
//		System.out.println(str + "입니다.");
		
		
		String str1, str2, str3;
		Scanner sc2 = new Scanner(System.in);
		str1 = sc2.next();		// 공백 만나면 종료
		str2 = sc2.nextLine();  // \n 만나면 종료
		str3 = sc2.next();		// 공백 만나면 종료
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
	}

}
