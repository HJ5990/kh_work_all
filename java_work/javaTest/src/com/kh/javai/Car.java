package com.kh.javai;

public class Car {
	
	String color;    // 색상
	String company;    // 제조회사
	String type;    // 타입 (준준형, 중형, 대형, 스포츠카)
	String engine;    // 엔진 (가솔린, 디젤, 하이브리드, 가스) 
	String date;    // 제조날짜 (ex) 2023-08-04)
	int speed;   //현재속도
	int maxSpeed;    // 최대속도
	int zero100;    // 제로백
	int maxCc;   // 최대주유량
	int cc;   //현대주유량
	
	
	
	// 생성자
	public Car(String color, String company, String type, 
			String engine, String date, int maxSpeed, int zero100, 
			int maxCc) {
		
		this.color = color;
		this.company = company;
		this.type = type;
		this.engine = engine;
		this.date = date;
		this.maxSpeed = maxSpeed;
		this.zero100 = zero100;
		this.maxCc = maxCc;
		this.cc = 0;
		this.speed = 0;
	}
	
	
	public Car() {
	}
	
	
	
	
	// 메서드
	
	// 호출하면 speed +5 하고 속도표시
	// 최대속도일 때는 고정
	public int onAxel() {
		if (speed + 5 >= maxSpeed) {
		speed = maxSpeed;
		} else {
			speed += 5;	
		}
		return speed;	
	}
	
	// 호출하면 speed +5 하고 속도표시
	// 최저속도는 0
	public int onBreak() {
		if ((speed - 5) <= 0) {
			speed = 0;
		} else {
			speed -= 5;	
		}
		return speed;	
	}
	
	// 넣은 기름만큼 추가 남은양 반환
	public int insertCc(int tCc) {
		if (cc + tCc > maxCc) {
			int temCc = (cc + tCc - maxCc);
			cc = maxCc;
			return temCc;
		} else {
			cc += tCc;
			return 0;	
		}
	}
	
	
	
	
	
	// statusDisplay 차량상태 확인
	
	
	public void statusDisplay(int type) {
		switch (type) {
			case 1 : {
				System.out.println("이 차는 "+company+"에서 "+date+"년에 제작한 "+type+"크기의 "+engine+" 엔진 차량입니다");
				System.out.println("색상은 "+color+"이며 최고속도는 " + maxSpeed + ", 제로백은 " + zero100 + ", 최대주유량은 " + maxCc + "입니다.");	
			}
			case 2 : {
				System.out.println("속도 : " + this.speed);
				System.out.println("잔여 기름 : " + this.cc);
			}
		
		
		}
	}
	
	
	
	
}
	
//this.color = color;
//this.company = company;
//this.type = type;
//this.engine = engine;
//this.date = date;
//this.maxSpeed = maxSpeed;
//this.zero100 = zero100;
//this.maxCc = maxCc;
//this.cc = 0;
//this.speed = 0;
 

