import java.util.Scanner;

public class Ex27Lista03 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();

        int x = 1;
        while(num < 0){
            System.out.println("Digite um número inteiro positivo: ");
            x++;
        }

        double soma = 0;
        for(int i = 1; i <= num; i++){

            soma += 1.0/i;
        }

        System.out.println("O valor é " + String.format("%.4f", soma));
        scanner.close();

    }
}
