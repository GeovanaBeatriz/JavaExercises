package Repeticao;

import java.util.Scanner;

public class Media10Valores {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int soma = 0;
        int media = 0;

        while(x <= 9){
            System.out.print("Digite o primeiro valor: ");
            soma = scanner.nextInt();
            soma = soma + x;
            x++;
        }

        media = soma / 10;
        System.out.println("A média é: " + media);

        scanner.close();
    }
}
