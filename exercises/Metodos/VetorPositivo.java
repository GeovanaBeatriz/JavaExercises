import java.util.Scanner;

public class VetorPositivo {

     public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int vet [] = new int[5];

 
        System.out.println("Digite os números do vetor: ");
        for(int i = 0; i < vet.length; i++){
            vet [i] = sc.nextInt();
        }
		
        imprimirPos(vet);
        sc.close();

    }

    public static void imprimirPos(int vet[]){

        System.out.println("----------------------------");
        System.out.println("Os números positivos são: ");
          for(int i = 0; i < vet.length; i++){
            if (vet[i] > 0){
                System.out.println(vet[i]);
            }
        }

        return;

    }

}