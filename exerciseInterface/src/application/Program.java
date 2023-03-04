package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), sdf);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number,date,totalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int n = sc.nextInt();
		
		
		ContractService contractService  = new ContractService(new PaypalService());
		
		contractService.processContract(contract, n);
		
		System.out.println("Parcelas: ");
		
		for(Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		
		
		
		
		sc.close();
	}

}
