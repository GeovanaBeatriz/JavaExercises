package Vetores;

import java.util.Scanner;

public class LendoValores {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int v[] = new int[6];

        System.out.println("Digite alguns valores: ");

        for(int i = 0; i < 6; i++){ 

            System.out.print("posicao " + i + ": "); 

            v[i] = scanner.nextInt(); 

        } 

        for(int i = 0; i< v.length; i++){
            System.out.println(v[i] + " ");
        }

        scanner.close();
    }
}
