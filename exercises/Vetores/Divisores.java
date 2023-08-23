package Vetores;
import java.util.Scanner;

public class Divisores {
    

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] divis = new int[5];

        System.out.println("Digite os 10 números: ");
        for (int i = 0; i<10; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Digite outros 5 números: ");
        for (int i = 0; i<5; i++){
            divis[i] = sc.nextInt();
        }

        for (int x = 0; x<10; x++){
            for(int y = 0; y<5; y++){
                if(num[x] % divis[y] == 0){
                    System.out.println("Número " + num[x] + " é divisível por  " + divis[y]);
                }
            }
        }
        sc.close();
    }
}

