package com.kh.javai;

public class Student {
	
	// 필드(데이터 집합)
	// 이름, 나이, 성별, 수학점수, 영어점수, 국어점수
	static int count = 0;    // 전체학생수
	
	
	String name;    //이름
	int age;    //나이
	String gender;    //성별
	int maScore;    //수학점수
	int enScore;    //영어점수
	int koScore;    //국어점수
	
	
	
	// 생성자
	// 인스턴스 객체를 생성할 때 데이터를 초기화 하기 위해 자동으로 한번만 실행하는 특별한 메서드
	// 메서드처럼 접근해서 실행할수 없으며 class의 이름과 동일한 이름을 가진다
	// 초기화를 위한 메서드이기 때문에 반환값은 없다
	/* 기본생성자 Student() {}
	 * 생성자를 아무것도 작성하지 않았을 때 컴파일러가 기본적으로 생성해주는 생성자 (아무 기능이 없다)
	 */
	
	// 생성자는 여러개 생성이 가능하다
	// 생성자가 여러개일때는 매개변수를 통해서 식별한다
	// 애매한 생성자는 사용을 지양한다 (논리에러)
	

	public Student() {
		System.out.println("student의 기본생성자");
	}
	public Student(String tName, int tAge, String tGender) {
		count++;
		name = tName;
		age = tAge;
		gender = tGender;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("학생이 추가되었습니다.");
	}
	
	
	
	// 메서드 (기능집합)
	
	// info메서드 생성
	// 저는 ㅇㅇ살의 상ㅇㅇ ㅇㅇㅇ입니다.

	public void info() {
		System.out.println(name + "\t" + age + "\t" + gender);
	}
	
	
	// set메서드 => 필드데이더에 값을 저장하기 위한 메서드 (값을 셋팅하는 메서드)
	// setter 세터라고 함
	public void setEnScore(int e) {
		if (e < 0) {
			enScore = 0;
			return;
		}
		enScore = e;
	}
	public void setKoScore(int k) {
		if (k < 0) {
			koScore = 0;
			return;
		}
		koScore = k;
	}
	public void setMaScore(int m) {
		if (m < 0) {
			maScore = 0;
			return;
		}
		maScore = m;
	}
	
	// get메서드 => 필드데이터의 값을 사용하기 위한 메서드
	// getter 게터라고 함
	public int getEnScore() {
		return enScore;
	}
	public int getKoScore() {
		return koScore;
	}
	public int getMaScore() {
		return maScore;
	}
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}

	
	
	
	// 기능을 담당하는 메서드
	
	// 토탈값을 반환하는 메서드
	public int getTotal() {
		return enScore + koScore + maScore;
	}
	// 평균값을 반환하는 메서드
	public float getAvg() {
		return getTotal() / 3.0f;
	}
	// 합격 불합격 판단 메서드
	public void checkpass() {
		if (enScore>=40 && koScore>=40 && maScore>=40 && getAvg()>=60 )
			System.out.println("합격입니다");
		else
			System.out.println("불합격입니다");
	}
	
	public boolean checkpassIsTrue() {
		if (enScore>=40 && koScore>=40 && maScore>=40 && getAvg()>=60 )
			return true;
		else
			return false;
	}
	
	
	
	// displayMyInfo 메서드를 만들어보자
	// 매개변수는 없고, 리턴값도 존재하지 않는다
	// 실행의 결과
	// 저는 oo살의 000입니다
	// 국어 : 00점
	// 영어 : 00점
	// 수학 : 00점
	// 합계 : 00점
	// 평균 : 00점
	// 으로 시험에 ㅇㅇ하였습니다
	
	public void displayMyInfo() {
		System.out.println("저는 " + age + "살의 " + name + "입니다");
		System.out.println("국어 : " + koScore);
		System.out.println("영어 : " + enScore);
		System.out.println("수학 : " + maScore);
		System.out.println("합계 : " + getTotal());
		System.out.println("평균 : " + getAvg());
		if (checkpassIsTrue()) {
			System.out.println("으로 시험에 합격하였습니다");
		} else {
			System.out.println("으로 시험에 불합격하였습니다");
		}
	}
	
	
	// 매개변수 값과 객체의 데이터가 동일하다면 turn, 아니면 false를 반환
	public boolean equals(String name, int age, String gening) {
		if (this.name.equals(name) && this.age == age && this.gender.equals(gening))
			return true;
		else
			return false;
	}
	
	public static int showCount() {
		return count;
	}
	
	
	
	
	
	
	
	
}
