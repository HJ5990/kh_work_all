package com.kh.library_0828review;

//Book 객체를 만들기 위한 클래스
public class Book {
	private String title;
	private String author;
	private int code;
	private boolean isRent;
	
	
	public Book(String title, String author, int Code) {
		this.title = title;
		this.author = author;
		this.code = Code;
		this.isRent = true;
	}
	
	
	public int getCode() {
		return this.code;
	}
	public boolean getIsRent() {
		return this.isRent;
	}
	public void setIsRent(boolean isRent) {
		this.isRent = isRent;
	}


	@Override
	public String toString() {
		return this.code +  "\t" + this.title + "\t" + author + "\t" +
					(this.isRent ? "대여가능" : "대여불가");
	}
	
	

}
