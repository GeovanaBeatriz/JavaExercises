package Vetores;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in);

        int[] v = new int [10]; 

        System.out.println("Digite 10 valores: ");   

        for(int i = 0; i < v.length; i++){ 

            System.out.print("posicao " + i + ": "); 

            v[i] = entrada.nextInt(); 

        } 


        int maior = v[0]; 
        int menor = v[0];

        for(int i = 1; i < v.length; i++){
            if(v[i] > maior){ 
                maior = v[i]; 
            } 
            if(v[i] < menor){
                menor = v[i];
            }

        } 

         

        System.out.println("Maior: " + maior); 
        System.out.println("Menor: " + menor);
        

        entrada.close(); 

    } 
}
