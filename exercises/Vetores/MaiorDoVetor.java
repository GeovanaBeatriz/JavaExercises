package Vetores;

 

import java.util.Scanner; 

 
 

public class MaiorDoVetor{ 

 
 

public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 

        int tamanho; 

        System.out.print("digite o tamanho do vetor: "); 

        tamanho = entrada.nextInt(); 

        int[] v = new int [tamanho]; 

        System.out.print("Agora digite " + tamanho + " valores para somar");   

 
 

         

        for(int i = 0; i < tamanho; i++){ 

            System.out.print("posicao " + i + ": "); 

            v[i] = entrada.nextInt(); 

        } 

 
 

        int maior = v[0]; 

        for(int i = 1; i < tamanho; i++){ 

            if(v[i] > maior){ 

                maior = v[i]; 
            } 
        } 

        System.out.print("Maior: " + maior); 

        entrada.close(); 

    } 

} 

 
 

 

 
