package com.kh.employee_0811;
import java.util.Scanner;

public class EmployeeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	
	public EmployeeMenu() {
		
		while (true) {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 수정");
		System.out.println("3. 사원 삭제");
		System.out.println("4. 사원 출력");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호를 누르세요 : ");
		int i = sc.nextInt();
		sc.nextLine();
		
		switch (i) {
				case 1:
					insetEmp();
					break;
				case 2:
					updateEmp();
					break;
				case 3:
					deleteEmp();
					break;
				case 4:
					printEmp();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다");
					return;
				default:
					System.out.println("다시 입력해주세요");
			}
		}
	}
	
	
	// 1. 사원추가
	public void insetEmp() {
		int empNo;
		String name;
		char gender;
		String phone;
		String dept;
		int salary;
		double bonus;
		
		System.out.print("사원 번호 : ");
		empNo = sc.nextInt();
		sc.nextLine();
		System.out.print("사원 이름 : ");
		name = sc.nextLine();
		System.out.print("사원 성별 : ");
		gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("전화 번호 : ");
		phone = sc.nextLine();
		
		while(true) {
			System.out.print("추가 정보를 더 입력하시겠습니까? (y/n) : ");
			
			switch (sc.nextLine()) {
			case "y":{
				System.out.print("사원 부서 : ");
				dept = sc.nextLine();
				System.out.print("사원 연봉 : ");
				salary = sc.nextInt();
				System.out.print("보너스 율 : ");
				bonus = sc.nextDouble();
				ec.add(empNo, name, gender, phone, dept, salary, bonus);
				return;
			}
			case "n":{
				ec.add(empNo, name, gender, phone);
				return;
			}
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
		
	}
	
	// 2. 사원수정
	public void updateEmp() {
		while (true) {
			System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
			System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
			System.out.println("1. 전화 번호");
			System.out.println("2. 사원 연봉");
			System.out.println("3. 보너스 율");
			System.out.println("9. 돌아가기");
			System.out.print("메뉴 번호를 누르세요 : ");
			int i = sc.nextInt();
			sc.nextLine();
			
			switch(i) {
			case 1:
				System.out.print("수정할 전화번호 : ");
				ec.modify(sc.nextLine());
				return;
			case 2:
				System.out.print("수정할 연봉 : ");
				ec.modify(sc.nextInt());
				sc.nextLine();
				return;
			case 3:
				System.out.print("수정할 보너스율 : ");
				ec.modify(sc.nextDouble());
				sc.nextLine();
				return;
			case 9:
				System.out.println("메인메뉴로 돌아갑니다");
				return;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
		
	}
	
	// 3. 사원삭제
	public void deleteEmp() {
		
		
		while (true) {
			System.out.print("정말 삭제하시겠습니까? (y/n) : ");
			
			switch (sc.nextLine()) {
				case "y" :
					ec.remove();
					System.out.println("데이터 삭제에 성공하였습니다.");
					return;
				case "n" :
					System.out.println("데이터 삭제 취소.");
					return;
				default:
					System.out.println("다시 입력해주세요.");
			}
		}
		
	}
	
	// 4. 사원출력
	public void printEmp() {
		if (ec == null) {
			System.out.println("사원데이터가 없습니다.");
			return;
		} else {
		System.out.println(ec.inform()); 
		}
	}
	
	
	

}
