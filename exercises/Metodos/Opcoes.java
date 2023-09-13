import java.util.Scanner;

public class Opcoes {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int vet [] = new int[5];

        System.out.println("Digite um número: ");
        int opcao = sc.nextInt();

        System.out.println("Digite os números do vetor: ");
        for(int i = 0; i < vet.length; i++){
            vet [i] = sc.nextInt();
        }

        switch(opcao){
            case 1:{
                f1(vet);
                break;
            }
            case 2:{
                f2(vet);
                break;
            }
            case 3:{
                f3(vet);
                break;
            }
            case 4:{
                f4(vet);
                break;
            }
            default:{
                System.out.println("Não existe uma opção correspondente à que foi digitada!");
            }
        }
        sc.close();
    }

    public static void f1(int vet[]){

       System.out.println("----------------------------");
        System.out.println("Imprimindo valores: ");
          for(int i = 0; i < vet.length; i++){
                System.out.println(vet[i]);
        }
        return;
    }

     public static void f2(int vet[]){
        System.out.println("----------------------------");
        System.out.println("Posições ímpares: ");
          for(int i = 0; i < vet.length; i++){
            if(i % 2 != 0){
                System.out.println(vet[i]);
            }
        }
        return;
    }

    public static void f3(int vet[]){

        System.out.println("----------------------------");
        System.out.println("Quadrado das posições pares do vetor: ");
          for(int i = 0; i < vet.length; i++){
            if(i % 2 == 0){
                System.out.println(vet[i] * vet[i]);
            }
        }
        return;
    }
 
    public static void f4(int vet[]){

        int soma = 0;
 
        System.out.println("----------------------------");
        System.out.println("Soma dos números divísiveis por 4 no vetor : ");
          for(int i = 0; i < vet.length; i++){
            if(vet[i] % 4 == 0){
                soma = soma + vet[i];
            }
        }
        System.out.println(soma);
        return;
    }

}

 