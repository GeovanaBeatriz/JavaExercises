import java.util.Scanner;

public class NumeroPerfeito {
    
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

        int soma = 0;
        for(int y = 2; y <= num; y = y + 1){
            if(num % y == 0){
                soma = soma + y;
            }
        }

        soma = soma - num;

        if(soma == num){
            System.out.println("Soma dos divisores: " + soma);
            System.out.println("Este número é perfeito!");
        }
        else{
            System.out.println("Este número não é perfeito!");
        }

        scanner.close();
    }
}
