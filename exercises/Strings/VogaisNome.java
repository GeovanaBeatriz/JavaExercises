import java.util.Scanner;

public class VogaisNome{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		
		System.out.print("Digite um nome: ");
		String nome1 = sc.next();
		String maiusculas = nome1.toUpperCase();
		
		
		for(int x = 0; x < nome1.length(); x++){
			
			
			if((maiusculas.charAt(x) == 'A') || (maiusculas.charAt(x) == 'E') || (maiusculas.charAt(x) == 'I') || (maiusculas.charAt(x) == 'O') || (maiusculas.charAt(x) == 'U' )){
				
				cont = cont + 1;
			}	
			
		}
		
		System.out.print("O nome * " + nome1 + " * possui " + cont + " vogais.");
		sc.close();
	}
}