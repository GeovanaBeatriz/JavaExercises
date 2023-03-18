package Strings_E_Variaveis;
import java.util.Scanner;

public class HorasTrabalhadas {
    
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da hora de trabalho em reais: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite quantas horas foram trabalhadas esse mês: ");
        double horas = scanner.nextInt();

        double conta = (valorHora * horas) + 10.0/100.0;

        System.out.println("O funcionário receberá R$" + conta);

        scanner.close();
    }
}
