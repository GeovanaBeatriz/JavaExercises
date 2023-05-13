package Vetores;

import java.util.Scanner;

public class Ex04Lista04 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int [] vetor = new int[8];

        
        System.out.println("Digite um valor de 0 a 7: ");
        int x =  scanner.nextInt();
        System.out.println("Digite um valor de 0 a 7: ");
        int y =  scanner.nextInt();
    
        int cont = 0;
        while(x < 0 || x > 7 || y < 0 || y > 7){

            System.out.println("VALORES INVÁLIDOS!");
            System.out.println("Digite um valor de 0 a 7: ");
            x =  scanner.nextInt();
            System.out.println("Digite um valor de 0 a 7: ");
            y =  scanner.nextInt();

            cont++;
    
        }

        int soma = 0;
        System.out.println("Digite os valores do vetor: ");

        for(int i = 0; i < vetor.length; i++){
            
            vetor[i] = scanner.nextInt();
            soma = vetor[x] + vetor[y];
        }

        System.out.println("Soma da posição " + x + " e " + y + " = " + soma);

        scanner.close();
        
    }
}
