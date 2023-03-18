package Condicional;
import java.util.Scanner;

public class PesoIdeal {
    
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        char sexo;
        double h, pI;

        System.out.print("Qual a sua altura: ");
        h = scanner.nextDouble();
        System.out.print("Qual o seu sexo");
        sexo = scanner.next().charAt(0);

    
        if(sexo == 'f' || sexo == 'F'){
            pI = 62.1 * h - 44.7;
            System.out.println(pI);
        }
        else{
            pI = 72.7 * h - 58;
            System.out.println(pI);
        }

        scanner.close();
    }
}
