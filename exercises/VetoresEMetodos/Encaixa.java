package VetoresEMetodos;


import java.util.Scanner;

public class Encaixa{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 4 digítos: ");
        int A = sc.nextInt();
        System.out.println("Digite um número de 2 digítos: ");
        int B = sc.nextInt();

        Encaixa2(A, B);
        sc.close();

    }

    public static void Encaixa2(int A, int B){

            int y = A % 100;
            if(y == B){
                System.out.println("Encaixa");
            }
            else{
                System.out.println("Não encaixa");
    }

 
}
}