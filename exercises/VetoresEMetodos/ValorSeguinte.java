package VetoresEMetodos;

import java.util.Scanner;

public class ValorSeguinte {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número qualquer: ");
        int A = sc.nextInt();
        System.out.println("Digite o número de termos na sequência: ");
        int n = sc.nextInt();

        System.out.println("A soma é: " + calcular(A, n));
        sc.close();
    }

    public static double calcular(int A, int n){

        double conta = 0;
        for(int x = 1; x <= n; x++){
            conta = conta + 1.0/(A*x);
        }
        return conta;
    }
}
