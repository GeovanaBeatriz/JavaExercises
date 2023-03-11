import java.util.Scanner;

public class Bee1004 {
    
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite A: ");
        int A = scanner.nextInt();
        //System.out.println("Digite B: ");
        int B = scanner.nextInt();

        int PROD = A * B;

        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}
