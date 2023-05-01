import java.util.Scanner;

public class Ex30Lista03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int somaSequencia = 0;
        for (int x = 1; x <= num; x++) {

            somaSequencia = somaSequencia + x;
        }

        int aux = 1;
        int somaSequenciaSub = 0;
        for (int y = 1; y <= (2 * num - 1); y++) { // O exercicio fornece essas informacoes

            somaSequenciaSub += aux * y;
            aux = -aux; // inverte o sinal para fazer a sequencia de n - n+1
        }

        int somaSequenciaImpares = 0;
        for (int i = 1; i <= num; i = i + 2) {

            somaSequenciaImpares = somaSequenciaImpares + i;
        }

        System.out.println("A soma da sequência de 1 em 1 é " + somaSequencia);
        System.out.println("A soma da sequência de 1 em 1 é " + somaSequenciaSub);
        System.out.println("A soma da sequência de Impares é " + somaSequenciaImpares);
        scanner.close();
    }
}
