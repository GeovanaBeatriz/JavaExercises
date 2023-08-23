import java.util.Scanner;

public class OrdemDecrescente {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       

        System.out.println("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();

        int x = 0;
        while(num < 0){

            System.out.println("Digite um número inteiro positivo: ");
            num = scanner.nextInt();

            x++;
        }

        for(int y = num; y >= 0; y--){ 
            System.out.print(y + " ");
        }

        scanner.close();

    }
}
