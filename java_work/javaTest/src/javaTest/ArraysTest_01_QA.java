package javaTest;
import java.util.*;

public class ArraysTest_01_QA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

				
		
		// 실습문제 1
//		int[] arr = new int[10];
//		ArraysTest_01_QA.java
//		for (int i=0 ; i < arr.length ; i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i] + " ");
//		}
		
		
		
		
		// 실습문제 2 (내가푼거)
//		int[] arr = new int[10];
//		
//		for (int i = arr.length; i > 0 ; i--) {
//			arr[i-1] = i;
//			System.out.print(arr[i-1] + " ");
//		}
		
		
		
		// 실습문제 2 (선생님답안)
		
//		int[] arr = new int[10];
//		for (int i=0 ; i < 10 ; i++) {
//			arr[i] = (10-i);
//			System.out.print(arr[i] + " ");
//		}
		
		
		
		
		// 실습문제 3
		
//		int num;
//		
//		System.out.print("양의 정수 : ");
//		num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		
//		for (int i= 0 ; i < arr.length; i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i] + " ");
//		}
		
		
		
		// 실습문제 4
		
//		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};	
//		System.out.println(arr[1]);

		
		
		
		// 실습문제 5
		
		String str;
		char cha;
		int count=0;
		
		System.out.print("문자열 : ");
		str = sc.next();
		System.out.print("문자 : ");
		cha = sc.next().charAt(0);
		
		
		System.out.print(str + "에 " + cha + "가 존재하는 위치(인덱스) : ");
		
		// 배열의 길이만큼 반복 돌리기
		for (int i=0 ; i<str.length(); i++) {
			
			// 글자 하나씩 추출하면서 cha랑 똑같은지 비교
			if (str.charAt(i) == cha) {
				
				// 똑같으면 i(배열인덱스 위치) 배열인덱스는 0부터 시작하고, 배열도 0부터 돌렸으니 숫자가 같음
				System.out.print(i + " ");
				
				// 똑같은게 있을때마다 (if조건에 맞아 들어왔을때마다) 카운트에 +1해줌
				count++;
			}
		}
		
		System.out.println();
		System.out.println(cha + "의 개수 : " + count);


		
		// 실습문제 6
		
//		String arr[] = {"월", "화", "수", "목", "금", "토", "일"};
//		int num;
//		
//		System.out.print("0 ~ 6 사이 숫자 입력 : ");
//		num = sc.nextInt();
//		
//		
//		// if 사용
//		if (num > 7)
//			System.out.println("잘못 입력하셨습니다.");
//		else
//			System.out.println(arr[num] + "요일");
//		
//		// switch 사용
//		switch (num) {
//			case 0:
//			case 1:
//			case 2:
//			case 3:
//			case 4:
//			case 5:
//			case 6:
//				System.out.println(arr[num] + "요일");
//				break;
//			default :
//				System.out.println("잘못 입력하셨습니다.");
//		}
			
		
		
		
		// 실습문제 7
		
//		int num1, sum=0;
//		int[] arr1;
//			
//		System.out.print("정수 : ");
//		num1 = sc.nextInt();
//		arr1 = new int[num1];
//		
//		for (int i = 0 ; i < arr1.length ; i++) {
//			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
//			arr1[i] = sc.nextInt();
//		}
//		
//		for (int i = 0 ; i < arr1.length; i++) {
//			sum += arr1[i];
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.print("\n총 합 : " + sum);

		
		
		// 실습문제 8
	
//		int num, count=0;
//		int[] arr;
//		
//		do {
//			System.out.print("정수 : ");
//			num = sc.nextInt();
//			
//			if (num < 3 || num % 2 == 0)
//				System.out.println("다시 입력하세요.");
//			else 
//				break;
//		} while (true);
//		
//		arr = new int[num];
//		
//		for (int i = 0 ; i < arr.length ; i++) {
//			if ((arr.length / 2) < i) {
//				count--;
//			} else {
//				count++;
//			}
//			arr[i] = count;
//			
//			System.out.print(arr[i] + ((i == arr.length - 1) ? "" : ", "));
//		}

		
		
		// 실습문제 9
		
	
//		String[] arr = {"후라이드", "양념", "간장", "반반"};
//		String name, res=null;
//		
//		System.out.print("치킨 이름을 입력하세요 : ");
//		name = sc.next();
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].equals(name)) {
//				res = name + " 치킨 배달 가능";
//				break;
//			} else
//				res = name + " 치킨은 없는 메뉴입니다.";
//		}
//		System.out.println(res);
		
		
		
		
		// 실습문제 10
		
//		String num;
//		char[] arr;
//		
//		System.out.print("주민등록번호 (-포함) : ");
//		num = sc.next();
//		arr = new char[num.length()];
//	
//		for (int i = 0 ; i < num.length(); i++) {
//			if (i > 7) {
//				arr[i] = '*';
//			} else {
//				arr[i] = num.charAt(i);
//			}
//		}
//		
//		for (int i = 0 ; i < arr.length ; i++) {
//			System.out.print(arr[i]);
//		}
			
	
	
		
		// 실습문제 11
		
	
//		int[] num = new int[10];
//		
//		for (int i = 0 ; i < num.length ; i++) {
//			num[i] = (int) (Math.random() * 10) + 1;
//			System.out.print(num[i] + " ");
//		}
		
		
		
		// 실습문제 12
		
//		int[] num = new int[10];
//		
//		for (int i = 0 ; i < num.length ; i++) {
//			num[i] = (int) (Math.random() * 10) + 1;
//			System.out.print(num[i] + " ");
//		}
//		
//		int max=0, min=10;
//		
//		for (int i = 0; i < num.length ; i++) {
//			if (num[i] > max) 
//				max = num[i];
//	
//			if  (num[i] < min) 
//				min = num[i];
//		}
//		
//		System.out.println();
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
		
	
		// 실습문제 13 (내가푼거 - 덜품)
		
//		int[] num = new int[10];
//		int[] num2 = new int[10];
//		int number;
//		
//		for (int i = 0 ; ; i++) {
//			number = (int) (Math.random() * 10) + 1;
//		
//			for (int z = 0 ; true ; z++) {
//				if (num[i] == number)
//					for(int j = 0 ; j < num2.length ; j++) {
//						num2[j] = num[i];
//						System.out.print(num[j]);
//					}
//			}	
//		}

		
		
		// 실습문제 13 (선생님답안)

//		int[] arr = new int[10];
//		int i = 0;
//		
//		while (i < arr.length) {
//			int nan = (int)(Math.random() * 10) + 1;
//
//			for (int j = 0 ; j <arr.length; j++) {
//				if (arr[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}
//			if (nan == 0)
//				continue;
//			else {
//				arr[i] = nan;
//				i++;
//			}
//		}
//		for (i = 0 ; i < arr.length ; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
		
		// 실습문제 14
		// 로또번호 6개 뽑아서 오름차순으로 출력
		
//		int[] arr = new int[6];
//
//		int i = 0;
//		while (i < arr.length) {
//			int nan = (int)(Math.random() * 45) + 1;
//
//			for (int j = 0 ; j <arr.length; j++) {
//				if (arr[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}
//			if (nan == 0)
//				continue;
//			else {
//				arr[i] = nan;
//				i++;
//			}
//		}
//		
//		Arrays.sort(arr);
//		
//		for (int j=0; j < arr.length; j++) {
//			System.out.print((arr[j]) + " ");
//		}
		
		
		
		
		
		// 랜덤 숫자 뽑고 중복체크 하는 코드 (간단하고 보편적임)
		
		
//		int[] arr = new int[6];
//		for (int i = 0 ; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 45) + 1;
//			for (int j = 0 ; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		for (int j=0; j < arr.length; j++) {
//			System.out.print((arr[j]) + " ");
//		}
		
		
		
		// 실습문제 15
		// 문자열을 입력받아 문자열을 하나씩 배열에 저장하고 (중복제거)
		// 문자의 개수와 함께 출력하세요.
		// 글자 
		
//		String str;
//		char[] strArr;
//		int count=0;
//		
//		System.out.print("문자열 : ");	
//		str = sc.next();
//		strArr = new char[str.length()];
//		
//		int i =0, j=0;
//		while(i < str.length()) {
//			strArr[j] = str.charAt(i);
//			
//			// 중복검사 방법1
//			for (int k=0 ; k < j ; k++) {
//				if (strArr[j] == strArr[k]) {
//					j--;
//					break;
//				}
//			}
//			i++;
//			j++;
//			
//		}
//		
//		System.out.print("문자열에 있는 문자 : ");
//		for (int h = 0 ; h < strArr.length; h++) {
//			if (h == (strArr.length-1) || strArr[h+1] == 0){
//				System.out.println(strArr[h]);
//				System.out.println("문자 개수 : " + (h+1));
//				break;
//			} else {
//			System.out.print(strArr[h] + ", ");
//			}
//		}
		
		
		
		
		// 실습문제 16 (내가푼거-오류)
		
//		int num;
//		String[] strArr, strArr2;
//		
//		System.out.print("배열의 크기를 입력하세요 : ");
//		num = sc.nextInt();
//		sc.nextLine();
//		
//		strArr = new String[num];
//		int i = 0;
//		while (true) {
//			for (; i < strArr.length ; i++) {
//				System.out.print((i+1) + "번째 문자열 : ");
//				strArr[i] = sc.nextLine();
//			}
//			
//			// 더 입력할지 안할지 확인 부분
//			System.out.print("더 값을 입력하시겠습니까? (y/n) : ");
//			
//			// 더 입력하겠다.
//			if ('y' == sc.next().charAt(0)) {
//				System.out.print("더 입력하고 싶은 개수 : ");
//				num = sc.nextInt();
//				sc.nextLine();
//				strArr2 = new String[strArr.length + num];
//				
//				for (i=0; i < strArr.length; i++) {
//					strArr2[i] = strArr[i];
//				}
//				strArr = strArr2;
//					
//			// 그만 입력하겠다.
//			} else {
//				System.out.print("[");
//				for (i = 0 ; i < strArr.length; i++) {
//					if (i == strArr.length - 1)
//						System.out.print(strArr[i] + "]");
//					else
//						System.out.print(strArr[i] + ", ");
//				} break;
//			}
//			
//		}
		
		
		
		// 선생님답안
		
		int num;
		String[] strArray1, strArray2;
		
		System.out.print("배열의 크기를 입력하세요 :");
		num = sc.nextInt();
		sc.nextLine();
		
		strArray1 = new String[num];
		int i = 0;
		while(true) {
			// 문자열을 입력받는 부분
			for (; i < strArray1.length; i++) {
				System.out.print((i + 1) + "번째 문자열 : ");
				strArray1[i] = sc.nextLine();
			}
			
			//더 입력할지 안할지 확인부분
			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
			
			// 더 입력하겠다.
			if ('Y' == sc.next().charAt(0)) {
				System.out.print("더 입력하고 싶은 개수 :");
				num = sc.nextInt();
				sc.nextLine();
				strArray2 = new String[strArray1.length + num];
				
				for (i = 0; i < strArray1.length; i++) {
					strArray2[i] = strArray1[i];
				}
				strArray1 = strArray2;
				// 배열 추가로 크게 생성해주고
				//복제
			} else { // 그만입력하겠다.
				System.out.print("[");
				for (i = 0; i < strArray1.length; i++) {
					if (i == strArray1.length - 1)
						System.out.print(strArray1[i] + "] ");
					else 
						System.out.print(strArray1[i] + ", ");
				}
				break;
			}
		}
		
	}	
}
		
		

