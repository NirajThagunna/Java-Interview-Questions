package oops;

// Banking Management System - Niraj Thagunna
public class Main {
	
	public static void main(String[] args) {
		
		BankingSystem bank = new BankingSystem();
		
		bank.accountHolderName = "Niraj Thagunna";
		bank.setBalance(0);
		bank.setEmailId("nt@gmail.com");
		bank.setPhoneNumber(9810773232d);
		
		System.out.println(bank.accountHolderName);
		bank.createAccount();
		
		System.out.println();
		bank.addBalance(1000);
		bank.checkBalance();
		
		System.out.println();
		bank.withdraw(500);
		bank.checkBalance();
		
		System.out.println();
		bank.withdraw(1000);
	}
}
