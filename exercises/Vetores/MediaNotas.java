package Vetores;

import java.util.Scanner;

public class MediaNotas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] notas = new double[15];
        double media = 0;
        double soma = 0;

        System.out.println("Digite as notas dos alunos: ");

        for(int i = 0; i < notas.length; i++){
            notas[i] = scanner.nextDouble();
            soma = soma + notas[i];
        }

        media = soma / 15;

        System.out.println("A média da sala foi: " + media);

        scanner.close();
    }
}
