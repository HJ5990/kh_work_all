package com.kh.shape;

public class SquareController {
	
	private Shape s = new Shape();
	
	
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width);
		return (height * 2) + (width * 2);
	}

	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);
		return height * width;
	}
	
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	
	public String print() {
		String str = "사각형 " + s.information();
		return str;
	}

	
}
