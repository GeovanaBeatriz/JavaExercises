package exercise2POO;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;



public class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee employee = new employee();
		
		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		System.out.println(" ");
		System.out.printf("Employee: " + employee.Name + ", $ %.2f%n ", employee.netSalary());
		System.out.print("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + employee);


		sc.close();
	}

}
