import java.util.Scanner;

public class AchandoLetras{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		String nome = sc.next();
		String minusculas = nome.toLowerCase();
		
		for(int x = 0; x < nome.length(); x++){
			
			minusculas = minusculas.replaceAll("a", "*");
		}
		
		System.out.print(minusculas);
		sc.close();
		
	}
}