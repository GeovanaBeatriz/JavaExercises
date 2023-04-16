package Repeticao;

import java.util.Scanner; 

public class ContaAteUsuarioParar{ 

    public static void main(String[] args){ 

        Scanner scanner = new Scanner(System.in); 

        char continua = 'c'; 

        int cont = 1; 

        while(continua == 'c' || continua == 'C'){ 

            System.out.println(cont++); 

            System.out.print("Digite c para continuar ou outra coisa pra parar"); 

            continua = scanner.next().charAt(0); 

        } 
        scanner.close(); 

    } 
} 