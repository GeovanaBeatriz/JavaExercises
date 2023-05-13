package Vetores;

import java.util.Scanner;

public class ValoresIguais {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int [] valores = new int[10];

        System.out.println("Digite alguns valores: ");

        for(int i = 0; i < valores.length; i++){
           
            valores[i] = scanner.nextInt();

        }

        int igual = valores[0];
        System.out.println("Valores iguais: ");
        for(int i = 1; i < valores.length; i++){
           
            if(valores[i] == igual){
                System.out.print(valores[i] + " - ");
            }
        }

        

        scanner.close();

    }
}
