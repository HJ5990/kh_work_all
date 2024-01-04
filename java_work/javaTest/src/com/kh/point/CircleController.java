package com.kh.point;

public class CircleController {
	
	
	private Circle c = new Circle();
	
	

	
	// 원둘레
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		
		double res = Math.PI * radius * 2;
		return "둘레 : " + c.toString() + " / " + res;
	}
	
	// 원넓이
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		
		double res = Math.PI * radius * radius;
		return "넓이 : " + c.toString() + " / " + res;
	}
	

}
