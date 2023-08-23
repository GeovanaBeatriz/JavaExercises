import java.util.Scanner;
public class Ex15Lista03 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("digite um numero inteiro: ");
        int n = scanner.nextInt();
        int i = 1;  // início
        while (i <= n) {  // fim
            System.out.print(i + " ");
            i = i + 2;  // passo
        }
        scanner.close();
    }
}