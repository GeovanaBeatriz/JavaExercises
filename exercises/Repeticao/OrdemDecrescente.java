package Repeticao;

import java.util.*;

public class OrdemDecrescente {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       

        System.out.println("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();

        int x = 0;
        while(num < 0){

            System.out.println("Digite um número inteiro positivo: ");
            num = scanner.nextInt();

            x++;
        }

        for(int y = num; y >= 0; y = y - 1){ 
            System.out.println(y);
        }

        scanner.close();

    }
}
