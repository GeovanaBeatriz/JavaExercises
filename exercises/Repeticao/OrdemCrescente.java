
import java.util.Scanner;

public class OrdemCrescente {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro positivo: ");
        num = scanner.nextInt();

        int x = 0;
        while(num < 0){

            System.out.println("Digite um número inteiro positivo: ");
            num = scanner.nextInt();

            x++;
        }

        
        for(int y = 0; y <= num; y++){
            System.out.println(y);
        }

        scanner.close();

    }
}
