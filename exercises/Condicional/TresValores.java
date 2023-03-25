

import java.util.Scanner;

public class TresValores {
    
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double v1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        double v2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        double v3 = scanner.nextInt();


        if(v1 >= v2 && v1 >= v3){
            System.out.println(v1 + " é o maior");
        }
        else if(v2 >= v3){
            System.out.println(v2 + " é o maior");
        }
        else{
            System.out.println(v3 + " é o maior");
        }

        scanner.close();
    }
}
