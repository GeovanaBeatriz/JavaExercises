import java.util.Scanner;

public class Encanador {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos dias o encanador trabalhou: ");
        int dias = scanner.nextInt();

        double conta = (dias * 30.0) - 8.0/100.0;

        System.out.println("O encanador receberá R$" + conta);

        scanner.close();
    }
}
