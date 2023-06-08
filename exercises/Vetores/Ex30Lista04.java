package Vetores;

import java.util.Scanner;

public class Ex30Lista04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];

        int i;
        int j;

        System.out.println("Digite os valores do vetor A: ");
        for (i = 0; i < A.length; i++) {

            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (i = 0; i < B.length; i++) {

            B[i] = sc.nextInt();
        }

        int[] AB = new int[10];
        int k = 0; // para o tamanho do vetor

        for (i = 0; i < 10; i++) {
            int novo = A[i];
            for (j = 0; j < 10; j++) {
                if (A[i] == B[j] && k < AB.length) {
                    boolean repete = false;
                    for (int l = 0; l < k; l++) {
                        if (AB[l] == novo) {
                            repete = true;
                        }
                    }
                    if (!repete) {
                        AB[k] = novo;
                        k++;
                    }
                }
            }

        }

        System.out.print("Intersecção: [");

        if (k > 0) {
            for (i = 0; i < k; i++) {
                System.out.print(AB[i] + " ");
            }
        } else {
            System.out.println("Não existem elementos na intersecção dos vetores");
        }

        sc.close();
    }
}