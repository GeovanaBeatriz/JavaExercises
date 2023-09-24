package VetoresEMetodos;

import java.util.Scanner;

public class NPalavras {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um valor inteiro: ");
        int n = sc.nextInt();
        System.out.println("Digite uma letra: ");
        char ch = sc.next().charAt(0);
        int cont = 0;

        String[] palavrasComALetra = new String[n];

        System.out.println("Digite " + n + " palavras com o começo " + ch);
        for(int x = 0; x < n; x++){

            String aux = sc.next();

            if(ch == aux.charAt(0)){
                palavrasComALetra[cont] = aux;
                cont = cont + 1;
            }
        }

        System.out.println("");

        for(int i = 0; i < cont; i++){

            System.out.println(palavrasComALetra[i]);

        }

        sc.close();
    }

    

}
