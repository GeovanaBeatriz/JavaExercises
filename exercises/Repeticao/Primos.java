import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero para verificar se ele e primo: ");
        int n = scanner.nextInt();
        scanner.close();
        int raiz = (int) Math.sqrt(n);
        boolean ePrimo = true;
        for (int i = 2; i <= raiz && ePrimo; i++) {
            if (n % i == 0) {
                ePrimo = false;
            }
        }
        if (ePrimo) {
            System.out.println(n + " e primo");
        } else {
            System.out.println(n + " nao e primo");
        }
        // while (n != 0) {
        // System.out.println("raiz = " + Math.sqrt(n));
        // System.out.println("raiz cast int = " + (int)Math.sqrt(n));
        // n = scanner.nextInt();
        // }
    }
}
