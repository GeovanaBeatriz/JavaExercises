package Vetores;

import java.util.Scanner;

public class QuadradoNumerosReais {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double [] entrada = new double[10];
        double [] armazenamento = new double[10];
        double quadrado;



        System.out.println("Digite 10 valores: ");

        for(int i = 0; i < entrada.length; i++){
            entrada[i] = scanner.nextDouble();
        }

        System.out.println("Valores inseridos: ");
        for(int y = 0; y < entrada.length; y++){
            System.out.println(entrada[y] + " - ");
        }

        for(int x = 0; x < entrada.length; x++){
            
            quadrado = entrada[x] * entrada[x];
            armazenamento[x] = quadrado;
            System.out.println("Quadrado de " + entrada[x] + " = " + armazenamento[x]);
        }

        scanner.close();
    }
}
