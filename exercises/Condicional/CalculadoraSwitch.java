import java.util.Scanner;

public class CalculadoraSwitch {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double conta;

        System.out.print("Digite o primeiro valor :");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo valor :");
        double b = scanner.nextDouble();
        System.out.print("Escolha uma operação:\n + para soma \n - para subtração \n * para multiplicação \n / para divisão");
        char opcao = scanner.next().charAt(0);

        switch(opcao){
            case '+':
                conta = a + b;
                System.out.println("A soma deu " + conta);
            break;
            case '-':
                conta = a - b;
                System.out.println("A subtração deu " + conta);
            break;
            case '*':
            case 'x':
                conta = a * b;
                System.out.println("A multiplicação deu " + conta);
            break;
            case '/':
                if(b == 0){
                    System.out.println("Não é possível dividir por zero");
                }
                else{
                    conta = a / b;
                    System.out.println("A divisão deu " + conta);
                }
            break;
            default:
            System.out.println("Operação inválida");
            break;
        }

        scanner.close();
    }
}
