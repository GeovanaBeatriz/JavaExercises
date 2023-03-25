import java.util.Scanner;

public class PrimeiroGrau {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente B: ");
        double b = scanner.nextDouble();

        if(a == 0){
            System.out.print("Os coeficientes não representam uma equação de 1 grau");
        }
        else{
            double x = -b / a;
            System.out.print("X = " + x);
        }

        scanner.close();
    }
}