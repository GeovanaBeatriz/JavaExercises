package VetoresEMetodos;

import java.util.Scanner;

public class ContaLetrasMaiusculas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.print("Digite um nome: ");
        String frase = sc.nextLine();

        for(int x = 0; x < frase.length(); x++){

            char letra = frase.charAt(x);
            boolean b1 = Character.isUpperCase(letra);

            if((b1 == true)){
                cont = cont + 1;
            }  
        }  

        System.out.print("A frase * " + frase + " * possui " + cont + " letras maiúsculas.");
        sc.close();
    }

}
