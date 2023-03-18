package Strings_E_Variaveis;
import java.util.Scanner;

public class NovoSalario {
    
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de seu salario: ");
        double salario = scanner.nextDouble();
       
        double conta = 25 * salario / 100;
        double aumento = salario + conta;

        System.out.println("O novo salário é de R$ " + aumento);

        scanner.close();
    }
}
