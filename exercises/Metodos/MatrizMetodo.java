import java.util.Scanner;

public class MatrizMetodo {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int vetor [][] = new int[2][2];

        System.out.println("Digite os números do vetor: ");
        for(int i = 0; i < vetor.length; i++){
            for(int x = 0; x < vetor.length; x++){
                vetor[i][x] = sc.nextInt();
            }
        }


        somarElementos(vetor);
        imprimirElementos(vetor);
        diagonalPrincipalSecundaria(vetor);
        sc.close();
    }
   
    public static void somarElementos(int vetor[][]){
 
        int soma = 0;
        System.out.println("----------------------------");
        System.out.println("Soma de todos os valores da matriz: ");
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length; j++){
                soma = soma + vetor[i][j];
            }
        }
        return;
    }
 
    public static void imprimirElementos(int vetor[][]){

        System.out.println("----------------------------");
        System.out.println("Imprimir os valores da matriz: ");
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length; j++){
                System.out.print(vetor[i][j] + " | ");
            }
            System.out.println(" ");
        }
        return;
    }
	
    public static void diagonalPrincipalSecundaria(int vetor[][]){

        System.out.println("----------------------------");
        System.out.println("Imprimir diagonal principal e secundária: ");
        System.out.println("Diagonal principal: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
             if(i == j){
                System.out.print(vetor[i][j] + " | ");
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
                System.out.print(vetor[i][j] + " | ");
            }
            else{
                System.out.print("  | ");
            }
        }
            System.out.println(" ");
        }
    }
}