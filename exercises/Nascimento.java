import java.util.Scanner;

public class Nascimento {
    
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        int anoNascimento = 2023 - idade;

        System.out.println("Você nasceu em " + anoNascimento);

        scanner.close();
    }
}
