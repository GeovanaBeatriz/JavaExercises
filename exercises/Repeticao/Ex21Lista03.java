import java.util.Scanner;

public class Ex21Lista03 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo valor ");
        int num2 = scanner.nextInt();

        int soma  = 0;
        int impar = 1;
        for(int x = num1; x <= num2; x++){
            if(x % 2 == 0){
                soma = soma + x;
            }
            else{
                impar = impar * x;
            }            
        }

        System.out.print("A soma dos numeros pares desse intervalo de números é "+ soma);
        System.out.print("\nA multiplicação dos números ímpares desse intervalo é " + impar);

        scanner.close();
        

    }
}
