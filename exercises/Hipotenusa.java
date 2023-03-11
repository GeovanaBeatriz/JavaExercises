import java.util.Scanner;

public class Hipotenusa {
    
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do cateto A: ");
        double catetoA = scanner.nextDouble();
        System.out.println("Digite o valor do cateto B: ");
        double catetoB = scanner.nextDouble();


        double hipotenusa =  Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        System.out.println("O valor da hipotenusa é : " + hipotenusa);

        scanner.close();
    }
}
