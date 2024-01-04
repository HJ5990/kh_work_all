package javaTest;

import java.util.*;

public class ifTest_01_QA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		int num = sc.nextInt();
//		
//		if (num >= 100)
//			System.out.println("3자리 수 이상입니다.");
//		else
//			System.out.println("3자리 수 이하입니다.");
		
		
		
		
//		String name, str2;
//		int num1, num2, num3;
//		double dou;
//		char cha;
//		
//		System.out.print("이름 : ");
//		name = sc.nextLine();
//		System.out.print("학년(숫자만) : ");
//		num1 = sc.nextInt();
//		System.out.print("반(숫자만) : ");
//		num2 = sc.nextInt();
//		System.out.print("번호(숫자만) : ");
//		num3 = sc.nextInt();
////		System.out.print("성별(M/F) : ");
////		cha = sc.next().charAt(0);
//		System.out.print("성별(M/F) : ");
//		str2 = sc.next();
//		System.out.print("성적(소수점 아래 둘째자리까지) : ");
//		dou = sc.nextDouble();
//		
//		if (str2.equals("M"))
//			str2 = "남학생";
//		else
//			str2 = "여학생";
//		
////		str2 = str2 == "M" ? "남" : "여";      // 위의 if문을 간단하게 표현 가능
//		
//		System.out.println();
//		System.out.print(num1 + "학년 " + num2 + "반 " + num3 + "번 " + name + " " + str2 + "의 성적은 " + dou + "이다.");
		
		
		
		
//		int age;
//		String res;
//		
//		System.out.print("나이 : ");
//		age = sc.nextInt();
//		
//		System.out.println();
//		
//		if (age <= 13)
//			System.out.println("어린이");
//		else if (age <= 19)
//			System.out.println("청소년");
//		else
//			System.out.println("성인");
//		
////		res = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";    // 이렇게 삼항연산자로도 가능하지만 가독성 떨어져서 잘 안씀
////		System.out.println(res);
		
		
		
		
		
		
//		int a, b, c, sum;
//		float avg;
//		
//		
//		System.out.print("국어 : ");
//		a = sc.nextInt();
//		System.out.print("영어 : ");
//		b = sc.nextInt();
//		System.out.print("수학 : ");
//		c = sc.nextInt();
//		
//		sum = a + b + c;
//		avg = sum / 3.0f;
//		
//		System.out.println();
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + avg);
//		
//		if (a >= 40 && b >= 40 && c >= 40 && avg >= 60)
//			System.out.println("합격");
//		else
//			System.out.println("불합격");
		
		
		
		
		
//		char 변수 이용
		
//		char a;
//		
//		System.out.print("주민번호를 입력하세요 (-포함) : ");
//		a = sc.next().charAt(7);
//		
//		if (a%2 == 0)
//			System.out.println("여자");
//		else
//			System.out.println("남자");
		
		
		
//		String 변수 이용
		
//		String number;
//		
//		System.out.print("주민번호를 입력하세요 (-포함) : ");
//		number = sc.next();
//		
//		if (number.charAt(7) == '1' || number.charAt(7) == '3' )
//			System.out.println("남자");
//		else
//			System.out.println("여자");
		
		
		
		
		
		
		
//		int a, b, c;
//		double d, e, f, g;
//		
//		System.out.print("A사원의 연봉 : ");
//		a = sc.nextInt();
//		System.out.print("B사원의 연봉 : ");
//		b = sc.nextInt();
//		System.out.print("C사원의 연봉 : ");
//		c = sc.nextInt();
//		
//		d = a * 1.4;
//		e = b * 1.0;
//		f = c * 1.15;       // 0.15 로 계산해서 더할 경우 근사치로 계산되어 소수점 올림됨
//		
//		System.out.println();
//		
//		System.out.println("A사원 연봉/연봉+a : " + a + "/" + d);
//		System.out.println(d >= 3000 ? "3000 이상" : "3000 미만");
//		
//		System.out.println("B사원 연봉/연봉+a : " + b + "/" + e);
//		System.out.println(e >= 3000 ? "3000 이상" : "3000 미만");
//		
//		System.out.println("C사원 연봉/연봉+a : " + c + "/" + f);
//		System.out.println(f >= 3000 ? "3000 이상" : "3000 미만");
//

		
		
		
		
		
//		int a, b, c;
//		double d, e, f, g;
//		
//		System.out.print("A사원의 연봉 : ");
//		a = sc.nextInt();
//		System.out.print("B사원의 연봉 : ");
//		b = sc.nextInt();
//		System.out.print("C사원의 연봉 : ");
//		c = sc.nextInt();
//		
//		d = a * 0.4;
//		e = b * 0.0;
//		f = c * 0.15;
//		
//		System.out.println();
//		
//		System.out.println("A사원 연봉/연봉+a : " + a + "/" + (a+d));
//		if ((a+d) >= 3000)
//			System.out.println("3000 이상");
//		else
//			System.out.println("3000 미만");
//		
//		System.out.println("B사원 연봉/연봉+a : " + b + "/" + (b+e));
//		if ((b+e) >= 3000)
//			System.out.println("3000 이상");
//		else
//			System.out.println("3000 미만");
//		
//		System.out.println("C사원 연봉/연봉+a : " + c + "/" + (c+f));
//		if ((c+f) >= 3000)
//			System.out.println("3000 이상");
//		else
//			System.out.println("3000 미만");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
