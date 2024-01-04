package com.kh.book_alone;
import java.util.Scanner;

public class Book {

	

	// 필드
	private String name, author, issue;
	private int price;
	
	// 생성자
	public Book(String name, String author, String issue, int price) {
		this.name = name;
		this.author = author;
		this.issue = issue;
		this.price = price;
	}
	
	
	// getter
	public String getName() {
		return this.name;
	}
	public String getAuthor() {
		return this.author;
	}
	public String getIssue() {
		return this.issue;
	}
	public int getPrice() {
		return this.price;
	}
	
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	// toString
	public String toString() {
		String str = this.name + "\t" + this.author + "\t" + this.issue + "\t" + this.price;
		return str;
	}
	
	
	
	
	
	
}
