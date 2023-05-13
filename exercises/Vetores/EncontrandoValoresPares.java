package Vetores;

import java.util.Scanner;

public class EncontrandoValoresPares {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int [] pares = new int[8];

        System.out.println("Digite alguns valores: ");

        for(int i = 0; i < pares.length; i++){
           
            pares[i] = scanner.nextInt();

        }

        System.out.println("Valores pares: ");
        for(int i = 0; i < pares.length; i++){
           
            if(pares[i] % 2 == 0){
                System.out.print(pares[i] + " - ");
            }
        }

        

        scanner.close();

    }
}
