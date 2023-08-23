import java.util.Scanner;

public class DiagonalPrincipalSecundaria{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int matriz[][] = new int[2][2];

        System.out.println("Digite os valores da matriz: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
              matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
             if(i == j){
                System.out.print(matriz[i][j] + " | ");
            }
            else{
                System.out.print("  | ");
            }
        }
            System.out.println(" ");
        }

 
        System.out.println("Diagonal secundária: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
             if(i + j == 2 - 1){
                System.out.print(matriz[i][j] + " | ");
            }
            else{
                System.out.print("  | ");
            }
        }
            System.out.println(" ");
        }
    }
}