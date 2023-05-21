package Vetores;

import java.util.Scanner;

public class Ex29Lista04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];

        int i;
        int somaPares = 0;
        int contImpar = 0;

        System.out.println("Digite os valores: ");

        for (i = 0; i < numeros.length; i++) {

            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {

                somaPares = somaPares + numeros[i];
            } else {
                contImpar++;
            }
        }

        System.out.print("Números pares: ");
        for (i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println("\nA soma dos pares: " + somaPares);
        System.out.print("Números Impares: ");
        for (i = 0; i < 6; i++) {
            if (numeros[i] % 3 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println("\nQuantidade de números impares: " + contImpar);

        sc.close();

    }
}
