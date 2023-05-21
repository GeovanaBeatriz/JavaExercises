package Vetores;

import java.util.Scanner;
public class Ex27Lista04 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[10];
        int i, x;

        System.out.println("Digite 10 valores: ");
        for(i = 0; i < numeros.length; i++){

            numeros[i] = sc.nextInt();

            int raiz = (int) Math.sqrt(numeros[i]);
            boolean ePrimo = true;
            for (x = 2; x <= raiz && ePrimo; x++) {
            if (numeros[i] % x == 0) {
                ePrimo = false;
            }
        }
            if (ePrimo) {
                System.out.println(numeros[i] + " é primo. Na posição: " + i);
            } 
            else {
                System.out.println(numeros[i] + " não é primo.");
            }
    }

        sc.close();

        
    }
}
