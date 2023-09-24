package VetoresEMetodos;

import java.util.Scanner;

public class Histograma {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String contA = "";
        String contE = "";
        String contI = "";
        String contO = "";
        String contU = "";

        System.out.print("Digite um nome: ");
        String nome1 = sc.next();
        String maiusculas = nome1.toUpperCase();

        for(int x = 0; x < nome1.length(); x++){

            if((maiusculas.charAt(x) == 'A')){
                contA = contA + '*';
            }  
            else if((maiusculas.charAt(x) == 'E')){
                contE = contE + '*';
            }  
            else if((maiusculas.charAt(x) == 'I')){
                contI = contI + '*';
            }  
            else if((maiusculas.charAt(x) == 'O')){
                contO = contO + '*';
            }  
            else if((maiusculas.charAt(x) == 'U')){
                contU = contU + '*';
            }  
        }


        System.out.println("a: " + contA);
        System.out.println("e: " + contE);
        System.out.println("i: " + contI);
        System.out.println("o: " + contO);
        System.out.println("u: " + contU);

        sc.close();

    }

}

 
