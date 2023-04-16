package Repeticao;

import java.util.Scanner;

public class ComposicaoDoNumero {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Digite um número entre 100 e 999: ");
        num = scanner.nextInt();

        int x = 0;
        while(num < 100 || num > 999){
            System.out.println("Número inválido!");
            System.out.println("Digite um número entre 100 e 999: ");
            num = scanner.nextInt();

            x++;
        }
        

        int d3 = num % 10;
        int num2 = num / 10;
        int d2 = num2 % 10;
        int d1 = num2 / 10;

        System.out.println(d1 + "\n" + d2 + "\n" + d3);

        scanner.close();
    }

}
