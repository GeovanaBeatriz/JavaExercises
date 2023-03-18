package Condicional;
import java.util.Scanner;

public class ImparOuPar {
    
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        if(valor % 2 == 0){
            System.out.println("Valor par");
        }
        else{
            System.out.println("Valor impar");
        }

        scanner.close();
    }
}
