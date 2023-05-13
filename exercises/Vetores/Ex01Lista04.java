package Vetores;

public class Ex01Lista04 {
    
    public static void main(String[] args) {
        
        int [] a = new int[6];

        a[0] = 1;
        a[1] = 0;
        a[2] = 5;
        a[3] = -2;
        a[4] = -5;
        a[5] = 7;

        int soma = a[0] + a[1] + a[5];
        System.out.println("Soma: " + soma);

        a[4] = 100;

        System.out.println("Valores do vetor A: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " - ");
        }

    
    }
}
