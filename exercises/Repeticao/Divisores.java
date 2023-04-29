
import java.util.Scanner;

public class Divisores {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Digite um número inteiro positivo: ");
        num = scanner.nextInt();

        int x = 0;
        while(num < 0){
            System.out.println("Número inválido! Deve ser positivo");
            System.out.println("Digite um número inteiro positivo: ");
            num = scanner.nextInt();

            x++;
        }

        for(int y = 1; y <= num; y = y + 1){
            if(num % y == 0){
                System.out.println("Divisivel: " + y);
            }
        }

        scanner.close();
    }
}
