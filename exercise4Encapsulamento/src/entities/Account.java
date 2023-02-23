package entities;

public class Account {

	private int accountNumber;
	private String name;
	private double value;
	
	
	
	
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}


	public Account(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getValue() {
		return value;
	}


	public void deposit(double amount) {
		value += amount;
		
	}
	
	public void withdraw(double amount) {
		value -= amount + 5.0;
		
	}
	
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + name + ", Balance: "
				+ String.format("%.2f", value);
	}
	
	
	
}
