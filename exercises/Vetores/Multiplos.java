package Vetores;

import java.util.Scanner;

public class Multiplos {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int [] valores = new int[10];
        

        System.out.println("Digite algum valor alaeatório: ");
        int x = scanner.nextInt();

        System.out.println("Digite alguns valores: ");

        for(int i = 0; i < valores.length; i++){
           
            valores[i] = scanner.nextInt();

        }

        System.out.println("Multiplos de " + x + ": ");
        for(int i = 1; i < valores.length; i++){
           
            if(valores[i] % x == 0){
                System.out.print(valores[i] + " - ");
            }
        }

        

        scanner.close();

    }
}
