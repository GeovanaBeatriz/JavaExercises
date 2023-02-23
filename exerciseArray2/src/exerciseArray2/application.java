package exerciseArray2;

import java.util.Locale;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quanto números você digitar: ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		
		for(int i = 0; i<n; i++) {
			
			System.out.printf("Dados da " + (i+1) + "° pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		double alturaMedia = 0.0;
		double resultado;
		
		for(int i = 0; i<n; i++) {
			
			alturaMedia += altura[i];
			
		}
		
		resultado = alturaMedia / n;
		System.out.printf("Altura Média: " + resultado);
		
		int contaIdade = 0;
		
		for(int i = 0; i<n; i++) {
			
			if(idade[i]<16) {
				contaIdade = contaIdade + 1;
			}
		}
		
		double percent = contaIdade * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos : %.1f%%%n", percent);
		sc.nextLine();
		
		for(int i = 0; i<n; i++) {
					
					if(idade[i]<16) {
						System.out.printf(nome[i]);
					}
				}
				
		
		
		
		sc.close();

	}

}
