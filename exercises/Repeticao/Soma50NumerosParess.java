package Repeticao;

public class Soma50NumerosParess {
    
    public static void main(String[] args) {
        
        int soma = 0;

        for(int x = 0; x <= 100; x = x + 2){

            soma = soma + x;
        }

        System.out.println(soma);

    }
}
