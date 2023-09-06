import java.util.*;

public class Soma{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        System.out.println("Digite um valor inteiro: ");
        int valor2 = sc.nextInt();
        calcularSoma(valor, valor2);
        sc.close();

    }

    public static void calcularSoma(int valor, int valor2){
        int soma = valor + valor2;
        System.out.println("A soma dos valores = " + soma);
        return;
    }
}