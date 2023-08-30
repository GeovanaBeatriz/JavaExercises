import java.util.Scanner;

public class LendoStrings{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um nome: ");
		String nome1 = sc.next();
		System.out.print("Digite um outro nome: ");
		String nome2 = sc.next();
		
		System.out.println("Os nomes digitados foram: " + nome1 + " e " + nome2);
		
		System.out.println("A segunda letra de " + nome1 + " é = " + nome1.charAt(1));
		System.out.println("A segunda letra de " + nome2 + " é = " + nome2.charAt(1));
		
		sc.close();
	}
}