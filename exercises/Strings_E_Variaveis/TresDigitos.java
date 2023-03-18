package Strings_E_Variaveis;
import java.util.Scanner;

public class TresDigitos{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de tres digitos: ");
        int num = scanner.nextInt();

        int d3 = num % 10;
        int num2 = num / 10;
        int d2 = num2 % 10;
        int num3 = num2 / 10;
        int d1 = num3 % 10;

        System.out.printf("O novo numero gerado foi: " + d3 + d2 + d1);
       

        scanner.close();
    }
}