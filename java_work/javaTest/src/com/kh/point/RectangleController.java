package com.kh.point;

public class RectangleController {
	
	private Rectangle r = new Rectangle();
	
	
	// 넓이
	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		int res = height * width;
		return "넓이 : " + r.toString() + " / " + res;
	}

	// 둘레
	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		int res = 2 * (height + width);
		return "둘레 : " + r.toString() + " / " + res;
	}
	
	
	
}
