package exercise4Encapsulamento;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposite (y/n): ");
		char option = sc.next().charAt(0);
		if(option == 'y') {
			
			System.out.print("Enter inital deposite: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, name, initialDeposit);
			
		}
		else {
			account = new Account(accountNumber, name);
		}
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.print("Enter a deposite value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();

	}

}
