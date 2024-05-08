import java.util.Scanner;
import java.util.Date;

public class Ordenacao{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        NossoVetor v;

        System.out.print("Digite o tamanho do vetor, 0 encerra: ");
        int n = sc.nextInt();

        while(n > 0){
            v = new NossoVetor(n);
            v.preencheVetor();
           // System.out.println("Vetor gerado: " + v);
           //int iteracoes = v.selectionSort();
           // System.out.println("Vetor ordenado pelo Selection: " + v);
           //System.out.print("Tamanho do vetor: " + n + ", iteracoes: " + iteracoes);

            long inicio = new Date().getTime();
            v.selectionSort();
            long fim = new Date().getTime();
            System.out.print("n: " + n + " ,Selection demorou " + (fim - inicio) + "ms");
            System.out.print("\nDigite o tamanho do vetor, 0 encerra: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}   