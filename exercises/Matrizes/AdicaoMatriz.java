import java.util.Scanner;

public class AdicaoMatriz{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A [][] = new int [2][2];
        int B [][] = new int [2][2];
        int C [][] = new int [2][2];

 
        System.out.println("Digite os valores da matriz A: ");
        for(int x=0; x<2; x++){
            for(int y=0; y<2; y++){
                A[x][y] = sc.nextInt();
            }
        }

 
        System.out.println("Digite os valores da matriz B: ");
        for(int x=0; x<2; x++){
            for(int y=0; y<2; y++){
                B[x][y] = sc.nextInt();
            }
        }

 
        for(int x=0; x<2; x++){
            for(int y=0; y<2; y++){
                C[x][y] = A[x][y] + B[x][y];
            }
        }
        sc.close();
    }
}
