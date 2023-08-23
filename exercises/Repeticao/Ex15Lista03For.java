import java.util.Scanner;

public class Ex15Lista03For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero inteiro: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i=1; i <= n; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}
