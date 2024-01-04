package com.kh.review_0823;

public class Book {
	String title;
	
	
	Book(String title){
		this.title = title;
	}
	
	
	void setTitle (String title) {
		this.title = title;
	}
	String getTitle () {
		return this.title;
	}
	public String toString() {
		return this.title;
	}

}
