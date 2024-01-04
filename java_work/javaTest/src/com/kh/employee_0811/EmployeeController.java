package com.kh.employee_0811;

public class EmployeeController {
	
	private Employee e = new Employee();
	
	
	public void add(int empNo, String name, char gender, String phone) {
		e = new Employee(empNo,name,gender,phone);
	}
	
	public void add(int empNo, String name, char gender, String phone,String dept, int salary, double bonus) {
		e = new Employee(empNo,name,gender,phone,dept,salary,bonus);
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	}
	
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	
	// 제거
	public Employee remove() {
		return e = null;
	}
	
	public String inform() {
		return e.toString();
	}
	
	
	
	

}
