package com.kh.shape;

public class TriangleController {
	
	private static Shape s = new Shape();

	
	public double calcArea(double height, double width) {
		s = new Shape(3 , height, width);
		return height * width / 2 ;
	}
	
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		String str = "삼각형 " + s.information();
		return str;
	}
	
	
	
}
