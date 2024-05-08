import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NossoVetor v;

        System.out.print("Digite o tamanho do vetor, 0 encerra: ");
        int n = sc.nextInt();

        while(n > 0){
            v = new NossoVetor(n);
            v.preencheVetor();

            v.insertionSort();
            System.out.print("Insertion: " + v);
            System.out.print("\nDigite o tamanho do vetor, 0 encerra: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}
