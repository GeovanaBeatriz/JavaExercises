package Vetores;
import java.util.Scanner; 

 
public class ExemploVetor1 { 

    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 

        int tamanho; 

        System.out.print("digite o tamanho do vetor: "); 

        tamanho = entrada.nextInt(); 

        int[] v = new int [tamanho]; 

        System.out.print("Agora digite " + tamanho + " valores"); 

        for(int i = 0; i < tamanho; i++){ 

            System.out.print("posicao " + i + ": "); 

            v[i] = entrada.nextInt(); 

        } 

        System.out.println("Vou mostrar os valores ao contrario: "); 

        for(int i = v.length - 1; i >= 0; i--){ 

            System.out.print(v[i] + " "); 

        } 

        entrada.close(); 

    } 

} 

 
