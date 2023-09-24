package VetoresEMetodos;

import java.util.Scanner;

public class Opcoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        /*
         * while(n != 1 || n != 2 || n != 3){
         * 
         * System.out.println("Digite um número válido: ");
         * 
         * n = sc.nextInt();
         * 
         * }/*
         */

        switch (n) {
            case 1: {
                System.out.println("A soma da função 1 é = " + f1());
                break;
            }
            case 2: {
                f2();
                break;
            }
            case 3: {
                f3();
                break;
            }
        }
        sc.close();
    }

    public static int f1() {

        System.out.println("----------------------------");
        Scanner sc = new Scanner(System.in);
        int vetA[] = new int[5];
        int soma = 0;
        System.out.println("Digite os valores do vetor: ");
        for (int x = 0; x < vetA.length; x++) {
            vetA[x] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (vetA[i] % 2 == 0 && vetA[i] % 3 == 0) {
                soma = soma + vetA[i];
            }
        }
        sc.close();
        return soma;
    }

    public static void f2() {
        System.out.println("----------------------------");
        Scanner sc = new Scanner(System.in);
        int vetA[] = new int[7];
        int vetB[] = new int[7];
        System.out.println("Digite os valores do vetor: ");
        for (int x = 0; x < vetA.length; x++) {
            vetA[x] = sc.nextInt();
        }
        for (int x = 0; x < vetB.length; x++) {
            for (int i = 0; i <= vetA[x]; i++) {
                vetB[x] = vetB[x] + i;
            }
        }

   for(int i = 0; i < vetA.length; i++){
               System.out.print(vetA[i] + " | ");
        }
        System.out.println(" ");

        for(int i = 0; i < vetB.length; i++){
               System.out.print(vetB[i] + " | ");
        }
        return;
    }

    public static void f3(){
        System.out.println("----------------------------");
        int matriz[][] = new int[5][5];
         Scanner sc = new Scanner(System.in);

        for(int x = 0; x < matriz.length; x++){
            for(int i = 0; i < matriz.length; i++){
                    matriz[x][i] = sc.nextInt();
            }
        }

       int somaP = 0;
       for(int i=0; i<2; i++){
           for(int j=0; j<2; j++){
            if(i == j){
               somaP = somaP + matriz[i][j];

               if(somaP % 2 != 0){
                System.out.println("V");
               }
            }
       }
    }

    int somaS = 0;
    for(int i=0; i<2; i++){
        for(int j=0; j<2; j++){
         if(i + j == 2 - 1){
            somaS = somaS + matriz[i][j];
             if(somaS % 3 == 0){
                System.out.println("F");
               }
        }  

    }
    }
       sc.close();
        return;
    }
}