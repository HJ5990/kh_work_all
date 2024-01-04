package com.kh.chorong;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			sc.nextLine();
			
			
			int count=0;
			
			for (int i=0; i < str.length(); i++) {
				if(str.charAt(i) == ch) {
					count += 1;
				}
			}
			System.out.println(count);
			

			System.out.print("더 하시겠습니까? (y/n) : ");
			char ans = sc.nextLine().charAt(0);
			if(ans == 'y') {
				continue;
			} else if (ans == 'n'){
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요");
			}
			break;

			
		}
		
		
	}

}
