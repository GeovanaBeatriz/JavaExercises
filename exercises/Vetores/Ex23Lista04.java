package Vetores;

import java.util.Scanner;

public class Ex23Lista04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double [] x = new double[5];
        double [] y = new double[5];

        int i;
        int j;
        double soma = 0;
        double produtoEscalar = 0;

        System.out.println("Digite os valores do conjunto X: ");
        for(i = 0; i < x.length; i++){

            x[i] = sc.nextDouble();
        }

        System.out.println("Digite os valores do conjunto Y: ");
        for(j = 0; j < y.length; j++){

            y[j] = sc.nextDouble();
        }

        for(i = 0; i < 5; i++){

            produtoEscalar = x[i] * y[i];
            soma = soma + produtoEscalar;
        }

        System.out.println("Produto escalar = " + soma);
        sc.close();
    }
}
