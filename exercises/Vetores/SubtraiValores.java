package Vetores;


import java.util.Random; 
public class SubtraiValores { 
    public static void main(String[] args){ 

         
        //Exercício 21 

        int[] a = new int[10], b = new int[10], c = new int[10]; 

        Random r = new Random(); 
        int i; 

 
        //Entrada de dados 

        for(i = 0; i < 10; i++){ 

            a[i] = r.nextInt(100); 
            b[i] = r.nextInt(100); 

            c[i] = a[i] - b[i]; 


        } 


        //Mostrando na tela 

        System.out.print("a = ["); 

        for(i = 0; i < 10; i++){ 

            System.out.print(a[i] + " "); 

        } 


        System.out.print("]\nb = ["); 

        for(i = 0; i < 10; i++){ 

            System.out.print(b[i] + " "); 
        } 


        System.out.print("]\nc = ["); 

        for(i = 0; i < 10; i++){ 

            System.out.print(c[i] + " "); 

        } 

        System.out.println("]"); 

    } 
} 

