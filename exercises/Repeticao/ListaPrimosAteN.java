import java.util.Scanner;
public class ListaPrimosAteN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero para verificar todos os primos ate ele: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int j=2; j <= n; j++) {
            int raiz = (int) Math.sqrt(j);
            boolean ePrimo = true;
            for (int i=2; i<=raiz && ePrimo; i++) {
                if (j % i == 0) {
                    ePrimo = false;
                }
            }
            if (ePrimo) {
                System.out.print(j + " ");
            }
        }
    }
}
