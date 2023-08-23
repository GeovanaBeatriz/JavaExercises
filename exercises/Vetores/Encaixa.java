package Vetores;

import java.util.Scanner;

public class Encaixa{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vA = new int[5];
        int[] vB = new int[5];

        System.out.println("Digite os 5 números de quatro digitos: ");
        for (int i = 0; i<5; i++){
            int x = sc.nextInt();
            if(x >= 1000 && x<=9999){
                vA[i] = x;
            }
            else{
                System.out.print("Digite novamente: ");
                i--;
            }
        }

        System.out.println("Digite outros 5 números de dois digitos: ");
        for (int i = 0; i<5; i++){
            int x = sc.nextInt();
            if(x >= 10 && x <= 99){
                vB[i] = x;
            }
            else{
                System.out.print("Digite novamente: ");
                i--;
            }
        }

 
        for(int i = 0; i<5; i++){
            int y = vA[i] % 100;
            if(y == vB[i]){
                System.out.println("Encaixa");
            }
            else{
                System.out.println("Não encaixa");
        }

    }
        sc.close();

    }

}

