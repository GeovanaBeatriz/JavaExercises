package Vetores;

import java.util.Scanner;

public class Ex30Lista04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] A = new int[3];
        int [] B = new int[3];
        
        int [] aux = new int[A.length + B.length];

        int k = 0;
        int i;
        int j;

        System.out.println("Digite os valores do vetor A: ");
        for(i = 0; i < A.length; i++){

            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for(i = 0; i < B.length; i++){

            B[i] = sc.nextInt();
        }

        for(i=0;i< A.length;i++){

            for(j=0;j<B.length;j++){
                
                if(A[i] == B[j]){
                    aux[k++] = A[i];
                }
            }
        }

        int [] AB = new int[k];
        for(i = 0; i < k; i++){

            AB[i] = aux[i];
        }

        System.out.println(AB[i]);
        
        sc.close();
    }
}
