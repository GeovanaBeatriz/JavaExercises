import java.util.Scanner;

public class SalarioBase {
    
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario-base: ");
        double salarioBase = scanner.nextDouble();

        double grat = 5 * salarioBase / 100;
        double imposto = 7 * salarioBase / 100;
        double conta = salarioBase + grat - imposto;

        System.out.println("O funcionário receberá R$" + conta);

        scanner.close();
    }
}
