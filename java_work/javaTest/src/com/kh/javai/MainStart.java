package com.kh.javai;
import java.util.Scanner;

// main 메서드를 실행해주기 위한 class
public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 인스턴스 객체 생성방법
		// 클래스명 생성할객체이름 = new 생성자 (클래스와 이름이 동일한 메서드)
//		Student choi = new Student("최지원", 48, "여자");
//		Student kim = new Student("김지원", 11, "남자");

		// 아래 두 코드가 실행되면 각기 다른 결과값이 나온다
//		choi.info();
//		kim.info();
		
		
		
		// 영어점수, 수학점수, 국어점수를 입력받아
		// 각 과목이 40점 이상이고 평균이 60점 이상일 때 합격
		// 조건을 충족하지 못하면 불합격을 나타내주는 프로그램 작성
		// ex) 영어점수 : 40
		//     수학점수 : 70
		//     국어점수 : 70
		//     총합 : 180
		//     평균 : 60.0
		//     불합격입니다.
		
		
		
//		Student choi = new Student("최지원", 65, "남자");
//		
//		int en, ma, ko, sum;
//		
//		System.out.print("영어점수 : ");
//		choi.setEnScore(sc.nextInt());
//		System.out.print("국어점수 : ");
//		choi.setKoScore(sc.nextInt());
//		System.out.print("수학점수 : ");
//		choi.setMaScore(sc.nextInt());
//		
//		choi.displayMyInfo();
		
		


		
		
// ---------------------------------------------------------------
		
		
		// 객체 생성하고 정보디스플레이 메서드 호출
		Car mycar = new Car("흰색", "현대", "중형", "가솔린", "2023-08-04", 150, 5, 100); 
//		mycar.statusDisplay(1);
		
		// 행동을 입력받고 진행하는 프로그램을 작성하세요
		// 1. 달린다
		// 2. 멈춘다
		// 3. 기름을 충전한다
		// 4. 속도와 잔여 기름양을 확인한다
		// 다른 버튼을 누르면 종료
		
//		boolean isFinish = false;
//		while (!isFinish) {
//			int num;
//			System.out.println("원하는 행동의 버튼을 클릭하세요.");
//			System.out.println("-------------------------");
//			System.out.println("1. 달린다");
//			System.out.println("2. 멈춘다");
//			System.out.println("3. 기름을 충전한다");
//			System.out.println("4. 속도와 잔여 기름양을 확인한다");
//			System.out.println("다른 버튼을 누르면 종료");
//			System.out.println("-------------------------");
//			System.out.print("입력 : ");
//			num = sc.nextInt();
//			
//			switch(num) {
//				case 1 :
//					mycar.onAxel();
//					mycar.statusDisplay(2);
//					break;
//				case 2 :
//					mycar.onBreak();
//					mycar.statusDisplay(2);
//					break;
//				case 3 :
//					System.out.print("얼마나 충전하시겠습니까? : ");
//					int cc = sc.nextInt();
//					mycar.insertCc(cc);
//					break;
//				case 4 :
//					mycar.statusDisplay(2);
//					break;
//				default:
//					System.out.println("종료되었습니다.");
//					isFinish = true;
//			
//			}
//		}
		
		
		
// ---------------------------------------------------------------
		
		
//		Student kim = new Student("가가", 2, "남자");
//		Student lee = new Student("나나", 12, "남자");
//		Student pack = new Student("다다", 16, "여자");
//		Student.showCount();
		
		
		
		
		
		
		
// 객체배열-----------------------------------------------------------
		
		
		
		
		
		
		
		

	}

}
