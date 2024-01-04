package com.kh.library_0828review;

// Human 객체를 만들기 위한 클래스
public class Human {
	
	private int key;   //사람을 식별할 수 있는 key
	private int age;
	private String name;
	private String residentNumber;
	private char gender;
	private int rentBookCode;
	
	
	Human (int key, String name, String residentNumber, int age, char gender){
		this.age = age;
		this.name = name;
		this.residentNumber = residentNumber;
		this.gender = gender;
		this.key = key;
		this.rentBookCode = 0;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKey() {
		return this.key;
	}
	public int getRrentBookCode() {
		return this.rentBookCode;
	}
	public void setRrentBookCode(int setRrentBookCode) {
		this.rentBookCode = setRrentBookCode;
	}
	
	
	@Override
	public String toString() {
		return this.key + "\t" + this.name + "\t" + this.residentNumber + "\t" + 
				this.age + "\t" + this.gender + "\t" +
				(this.rentBookCode == 0 ? "도서대여가능" : (this.rentBookCode + "번 대여중"));
	}




}
