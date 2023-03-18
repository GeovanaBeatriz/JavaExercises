package Strings_E_Variaveis;
import java.util.Scanner;

public class DescontoProd {
    
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double preco = scanner.nextDouble();
       
        double desconto = 12 * preco / 100;

        System.out.println("O desconto do produto é de R$ " + desconto);

        scanner.close();
    }
}
