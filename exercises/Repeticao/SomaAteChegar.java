
import java.util.Random; 

import java.util.Scanner; 

public class SomaAteChegar{ 
    public static void main(String[] args) { 

        Random random = new Random(); 

        Scanner scanner = new Scanner(System.in); 

        int tentativas = 0; 

        int soma = 0; 

        int premio = random.nextInt(901) + 100; //gerando um valor aleatorio entre 100 e 1000 

        while(soma < premio){ 

            System.out.println("Digite um número: "); 

            int n = scanner.nextInt(); 

            soma = soma + n; 

            //soma+= scanner.nextInt(); 

            tentativas++; 

        } 

        System.out.println("O prêmio é " + premio); 

        System.out.println("Você somou " + soma); 

        System.out.println("Número de tentativas " + tentativas); 

        if(soma != premio){ 

            System.out.println("Você devolve " + (soma - premio)); 

        } 

        scanner.close(); 

    } 

}
