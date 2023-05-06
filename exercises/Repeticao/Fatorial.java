import java.util.Scanner; 

public class Fatorial { 

    public static void main(String[] args){ 

        //ler um numero inteiro maior ou igual a 0 e calcular seu fatorial 

        int n, fat; 

        Scanner scanner = new Scanner(System.in); 

        //ler n com validacao 

        do{ 

            System.out.print("Digite um número inteiro: "); 
            n = scanner.nextInt(); 
        } 
        while(n<0); 
        scanner.close(); 


        fat = 1; 
        int cont = 2; 

        if(n < 2){ //Condicao para pegar fatorial de 1 
            System.out.print("Fatorial de " + n + " = " + fat); 
        } 
        else{ 
            do{ 

            fat = fat * cont; //Fatorial de 1 não funciona por causa do do while. Se o teste viesse no começo, funcionaria 

            cont++; 

            } 

        while(cont <= n); 
        System.out.println("Fatorial de " + n + " = " + fat); 

    } 
} 

} 
