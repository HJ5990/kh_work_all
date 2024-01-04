package javaTest;

public class BankAccountPO_Main {

	public static void main(String[] args) {
		
		BankAccountPO choi1 = new BankAccountPO();
		BankAccountPO choi2 = new BankAccountPO(1000);
		BankAccountPO choi3 = new BankAccountPO(1000, "지원");
		
		
		
		choi1.deposit(1000);
		choi1.cheakMyBalance();
		
	}

}
