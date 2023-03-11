import java.util.Scanner;

public class Bee1005 {
    
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite A: ");
        double A = scanner.nextDouble();
        //System.out.println("Digite B: ");
        double B = scanner.nextDouble();

        double MEDIA = (A*3.5 + B*7.5) / 11;

        System.out.println("MEDIA = " + String.format("%.5f",MEDIA));

        scanner.close();
    }
}
