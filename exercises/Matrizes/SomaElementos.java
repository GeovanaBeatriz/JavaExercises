import java.util.Scanner;

public class SomaElementos {
    

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[2][2];
        int soma = 0;

        System.out.print("Digite 16 valores: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                matriz[i][j] = sc.nextInt();
                soma = soma + matriz[i][j];
            }
        }

        System.out.print("A soma da matriz é: " + soma);
    }

}

