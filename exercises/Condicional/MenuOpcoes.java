import java.util.Scanner;

public class MenuOpcoes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double conta;

        System.out.print("Digite o primeiro valor: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double b = scanner.nextDouble();
        System.out.println("Escolha a opção:\n1 - Soma de 2 números.\n2 - Diferença entre 2 números (maior pelo menor).\n3 - Produto entre 2 números.\n4 - Divisão entre 2 números (o denominador não pode ser zero)");
        char opcao = scanner.next().charAt(0);

        switch(opcao){
            case '1':
                conta = a + b;
                System.out.println("A soma dos dois números deu " + conta);
            break;
            case '2':
                if(a > b){
                    conta = a - b;
                    System.out.println("A diferença entre os dois números deu " + conta);
                }
                else{
                    conta = b - a;
                    System.out.println("A diferença entre os dois números deu " + conta);
                }
                
            break;
            case '3':
                conta = a * b;
                System.out.println("A multiplicação entre os dois números deu " + conta);
            break;
            case '4':
                if(b == 0){
                    System.out.println("Não é possível dividir por zero");
                }
                else{
                    conta = a / b;
                    System.out.println("A divisão deu " + String.format("%.3f", conta));
                }
            break;
            default:
            System.out.println("Operação inválida");
            break;
        }

        scanner.close();
}
}
