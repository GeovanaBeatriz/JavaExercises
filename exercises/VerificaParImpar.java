import java.util.*;

public class VerificaParImpar{

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        verificarValor(valor);
        sc.close();
    }

    public static void verificarValor(int valor){

        if(valor % 2 == 0){
            System.out.println("É par");
        }
        else{
            System.out.println("É impar");
        }
        return;
    }
}