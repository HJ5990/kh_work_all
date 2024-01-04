package com.kh.study_0818_1;

public class Box<T> {

	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}
