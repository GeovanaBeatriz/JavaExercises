import java.util.Scanner;

public class VetorPares {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int numeros [] = new int[5];

        System.out.println("Digite os números do vetor: ");

        for(int i = 0; i < numeros.length; i++){

            numeros [i] = sc.nextInt();

        }


        System.out.println("A soma dos valores pares é: " + somarPares(numeros));
        sc.close();

    }

 

    public static int somarPares(int numeros[]){

        int soma = 0;

        System.out.println("----------------------------");
          for(int i = 0; i < numeros.length; i++){
                if(numeros[i] % 2 == 0){

                    soma = soma + numeros[i];

                }
        }
        return soma;
    }
}