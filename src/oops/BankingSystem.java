package oops;

/*
 * Banking System based on OOPs concepts
 * @Author : Niraj Thagunna
 * Design a banking system where a customer can open a new account, check his account balance and withdraw some money from
 * his account.
 */
public class BankingSystem {
	
	// Encapsulation
	public String accountHolderName;
	private int balance;
	private String emailId;
	private double phoneNumber;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public double getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void createAccount() {
		System.out.println("Account created for " + accountHolderName);
	}
	
	// Abstraction
	public void addBalance(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + " is deposited\nYour total balance is " + this.balance);
		}
		else {
			System.out.println("Please give some amount");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance = " + balance);
	}
	
	// Business Logic for withdraw money
	public void withdraw(int amount) {
		if (amount < balance) {
			balance -= amount;
			System.out.println(amount + " is debitated\nNow your current balance is " + this.balance);
		}
		else {
			System.out.println("In-sufficient balance");
		}
	}
}
