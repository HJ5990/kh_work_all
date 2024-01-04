package com.kh.product;

public class Product {

	//필드
	private String name;   // 상품명
	private int price;   // 가격
	private String description;   // 상품설명
	private int count;	//재고
	
	private final int MAX_COUNT = 50;
	
	
	// 생성자
	public Product(String name, int price, String description) {
		this.name = name == null ? "이름없음" : name;
		this.price = price < 0 ? 0 : price;
		this.description = description == null ? "-" : description;
		this.count = this.MAX_COUNT;
	}
	
	
	// 3가지 기본 메서드
	//	 getter (필드 데이터 반환).
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public String getDescription() {
		return this.description;
	}
	
	//	 setter (필드 데이터에 값 대입)
	public void setName(String name) {
		this.name = name == null ? "이름없음" : name;
	}
	public void setPrice(int price) {
		this.price = price < 0 ? 0 : price;
	}
	public void setDescription(String description) {
		this.description = description == null ? "-" : description;
	}
	
	// 	 toString (모든 데이터 정보 String으로 반환)
	public String toString() {
		String str = this.name + "\t" + this.price + "\t"  + this.description;
		return str;
	}
	
	
	
	
	
	
}
