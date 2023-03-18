package Strings_E_Variaveis;
import java.util.Scanner;

public class AreaCirculo {
    
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        double raio = scanner.nextDouble();

        double conta =  3.141592 * raio * raio;

        System.out.println("O valor da área da circunferência é: " + conta);

        scanner.close();
    }
}
