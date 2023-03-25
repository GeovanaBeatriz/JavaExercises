
import java.util.Scanner;

public class PositivoOuNegativo {
    
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        if(valor < 0){
            System.out.println("Valor negativo");
        }
        else{
            System.out.println("Valor positivo");
        }

        scanner.close();
    }
}
