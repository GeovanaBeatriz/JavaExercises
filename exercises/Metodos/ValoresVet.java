import java.util.Scanner;

public class ValoresVet {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        double vet [] = new double[5];

 
        System.out.println("Digite os números do vetor: ");
        for(int i = 0; i < vet.length; i++){
            vet [i] = sc.nextInt();
        }

        imprimirValores(vet);
        calcularMedia(vet);

       
        System.out.println("O maior valor é: " + maiorValor(vet));
        sc.close();
    }


    public static void imprimirValores(double vet[]){

        System.out.println("----------------------------");
        System.out.println("Imprimindo valores: ");
          for(int i = 0; i < vet.length; i++){

                System.out.println(vet[i]);

        }
        return;

    }

    public static void calcularMedia(double vet[]){

        double media = 0;
        double soma = 0;

        System.out.println("----------------------------");
        System.out.println("A média dos valores é: ");

          for(int i = 0; i < vet.length; i++){
                soma = soma + vet[i];
        }

        media = soma / vet.length;
        System.out.println(media);
        return;

    }

    public static double maiorValor(double vet[]){

        double maior = vet[0];

        System.out.println("----------------------------");
          for(int i = 0; i < vet.length; i++){
                if(maior  < vet[i]){
                    maior = vet[i];
                }
        }
       
        return maior;

    }
}