package Repeticao;
import java.util.Scanner;

public class Somar10Valores {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        double soma = 0;

        while(x <= 9){
            System.out.print("Digite o primeiro valor: ");
            soma = scanner.nextDouble();
            soma = soma + x;
            x++;
        }
        System.out.println("A soma é: " + soma);

        scanner.close();
    }
}
