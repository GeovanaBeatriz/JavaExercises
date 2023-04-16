package Repeticao;

import java.util.Scanner;

public class MenorEMaiorValor {
    
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int num;
        int maior = 0;
        int menor = 0;
        
        

        while(x <= 9){
            System.out.print("Digite o primeiro valor: ");
            num = scanner.nextInt();

            if(num > maior){
                maior = num;
            }
            
            if(num < menor ){
                menor = num; //O menor número fica dando 0
            }
            x++;

           
        }

        System.out.print("Maior: " + maior);
        System.out.print("\nMenor: " + menor);
        scanner.close();
    }
}
