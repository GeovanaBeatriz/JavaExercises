package Repeticao;

import java.util.*;

public class ParOrdemCrescente {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro par: ");
        num = scanner.nextInt();

        int x = 0;
        while(num % 2 != 0){

            System.out.println("Digite um número inteiro par: ");
            num = scanner.nextInt();

            x++;
        }

        
        for(int y = 0; y <= num; y = y + 2){
            System.out.println(y);
        }

        scanner.close();

    }
}
