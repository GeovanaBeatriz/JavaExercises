package Vetores;

import java.util.Scanner;

public class OrdemInversaVetor {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        int [] valores = new int[6];

        System.out.println("Digite os valores do vetor: "); 

        for(int i = 0; i < valores.length; i++){

            valores[i] = entrada.nextInt(); 

        } 

        System.out.println("Vou mostrar os valores ao contrario: "); 

        for(int i = valores.length - 1; i >= 0; i--){ 

            System.out.print(valores[i] + " "); 

        } 

        entrada.close(); 

    
    }
}
