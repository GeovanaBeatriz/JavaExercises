package Vetores;

import java.util.Scanner; 

 
 

public class SomaVetor { 

    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 

        int tamanho; 

        System.out.print("digite o tamanho do vetor: "); 

        tamanho = entrada.nextInt(); 

        int[] v = new int [tamanho]; 

        System.out.print("Agora digite " + tamanho + " valores para somar");   

 
 

        double soma = 0; 

 
 

        for(int i = 0; i < tamanho; i++){ 

            System.out.print("posicao " + i + ": "); 

            v[i] = entrada.nextInt(); 

            soma = soma + v[i]; 

        } 

        System.out.println("Soma = " + soma); 

        

        entrada.close(); 

    } 

} 
