package VetoresEMetodos;

import java.util.Scanner;

public class ContaEspacos {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.print("Digite um nome: ");
        String frase = sc.nextLine();


        for(int x = 0; x < frase.length(); x++){

            if((frase.charAt(x) == ' ')){
                cont = cont + 1;
            }  
        }

        System.out.print("A frase * " + frase + " * possui " + cont + " espaços.");
        sc.close();
    }
}
