import java.util.Scanner;

public class ElementosPares {
    public static void main(String [] args) {
        
    Scanner sc = new Scanner(System.in);

    int matriz[][] = new int[5][5];

        System.out.println("Digite os valores da matriz: ");
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
              matriz[i][j] = sc.nextInt();
            }
        }

        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
              if((i + j) % 2 == 0){
                System.out.println("A posição ["+i+"]["+j+"], cuja soma é um número par, possui o número: " + matriz[i][j]);
              }
            }
        }
    }
}
