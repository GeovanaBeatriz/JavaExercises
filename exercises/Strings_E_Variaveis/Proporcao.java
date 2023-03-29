package Strings_E_Variaveis;

import java.util.Scanner;

public class Proporcao {
    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto a primeiro pessoa apostou:\n R$ ");
        double aposta1 = scanner.nextDouble();
        System.out.print("Quanto a segunda pessoa apostou:\n R$ ");
        double aposta2 = scanner.nextDouble();
        System.out.print("Quanto a terceira pessoa apostou:\n R$ ");
        double aposta3 = scanner.nextDouble();
        System.out.print("Insira o valor do premio:\n R$ ");
        double premio = scanner.nextDouble();

        double somaDasApostas = aposta1 + aposta2 + aposta3;
        double porcentagem1 = aposta1 / somaDasApostas;
        double porcentagem2 = aposta2 / somaDasApostas;
        double porcentagem3 = aposta3 / somaDasApostas;

        double proporcao1 = premio * porcentagem1;
        double proporcao2 = premio * porcentagem2;
        double proporcao3 = premio * porcentagem3;

        System.out.print("O primeiro ganhou R$ " + String.format("%.2f", proporcao1) + "\nO segundo ganhou R$ " + String.format("%.2f", proporcao2) + "\nO terceiro ganhou R$ " + String.format("%.2f", proporcao3));

        scanner.close();
    }
}
