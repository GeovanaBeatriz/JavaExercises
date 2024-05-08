import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        NossoVetor v;

        System.out.print("Digite o tamanho do vetor, 0 encerra: ");
        int n = sc.nextInt();

        while(n > 0){
            v = new NossoVetor(n);
            v.preencheVetor();

            System.out.print("Antes de ordenar: " + v);

            v.bubbleSort();

            System.out.print("Bubble: " + v);
            System.out.print("\nDigite o tamanho do vetor, 0 encerra: ");
            n = sc.nextInt();
            
        }
        sc.close();
    }
}
