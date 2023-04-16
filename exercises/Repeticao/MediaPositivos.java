package Repeticao;

import java.util.Scanner;

public class MediaPositivos {
    
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int num = 0;
        int media = 0;

        while(x <= 9){
            System.out.print("Digite o primeiro valor: ");
            num = scanner.nextInt();
            if(num >= 0){
                num = num + x;
                x++;
            }
            else{
                System.out.println("Número negativo! Não será adicionado à média!");
            }
            
        }

        media = num / 10;
        System.out.println("A média é: " + media);

        scanner.close();
    }
}
