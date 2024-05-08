import java.util.Scanner;

public class TesteOrdenacao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor (0 encerra): ");
        int tamanho = sc.nextInt();

        while(tamanho > 0){
            NossoVetor v = new NossoVetor(tamanho);
            v.preencheVetor();
            System.out.println("1o vetor gerado: " + v);
            v.bubbleSort();
            System.out.println("Vetor ordenado pelo bubble: " + v);
            v.esvaziaVetor();
            v.preencheVetor();
            System.out.println("2o vetor gerado: " + v);
            v.quickSort(0, tamanho-1);
            System.out.println("Vetor ordenado pelo quick: " + v);
        }



        sc.close();
    }
}