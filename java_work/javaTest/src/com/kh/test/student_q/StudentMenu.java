package com.kh.test.student_q;

public class StudentMenu {
	
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		
		System.out.println("========== 학생 정보 출력 ==========");
		ssm.printStudent();
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.println("학생 점수 합계 : " + ssm.sumScore());
		System.out.println("학생 점수 평균 : " + ssm.avgScore());
		
		
		System.out.println("========== 성적 결과 출력 ==========");
		
	}
	
	
	
	
	
	

}
