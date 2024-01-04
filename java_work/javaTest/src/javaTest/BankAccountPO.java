package javaTest;

public class BankAccountPO {
	int balance;
	
	// 생성자 (
	public BankAccountPO() {
		balance = 0;
		String name;
	}
	public BankAccountPO(int b) {
		balance = b;
	}
	public BankAccountPO(int b, String n) {
		balance = b;
		String name;
	}
	
	
	
	
	// 메서드
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int cheakMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	


}