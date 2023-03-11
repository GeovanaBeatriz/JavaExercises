import java.util.Scanner;

public class Resto {
    
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de quatro digitos: ");
        int num = scanner.nextInt();

        int d4 = num % 10;
        int num2 = num / 10;
        int d3 = num2 % 10;
        int num3 = num2 / 10;
        int d2 = num3 % 10;
        int d1 = num3 / 10;

        System.out.println(d1 + "\n" + d2 + "\n" + d3 + "\n" + d4);

        scanner.close();
    }
}