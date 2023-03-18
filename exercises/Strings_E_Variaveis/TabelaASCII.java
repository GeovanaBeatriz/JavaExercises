package Strings_E_Variaveis;
import java.util.Scanner;

public class TabelaASCII {
    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra maiuscula: ");
        char maiuscula = scanner.next().charAt(0);

        char minuscula = Character.toLowerCase(maiuscula);
        System.out.println("A letra maiuscula '" + maiuscula + "' equivale a letra '" + minuscula + "'");

        scanner.close();
    }
}
