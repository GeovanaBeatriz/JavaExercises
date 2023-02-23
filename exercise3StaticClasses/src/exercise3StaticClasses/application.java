package exercise3StaticClasses;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//It's not necessary to instance => CurrencyConverter currency = new CurrencyConverter();
		
		System.out.print("What is the dollar price: ");
		CurrencyConverter.dollarprice = sc.nextDouble();
		System.out.print("How many dollars will be bought: ");
		CurrencyConverter.dollars = sc.nextDouble();
		System.out.print("Amount to be paid in reais: " + CurrencyConverter.amountToPay());
		
		sc.close();
	}

}
