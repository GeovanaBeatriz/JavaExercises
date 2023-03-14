import java.util.Scanner;

import java.util.Scanner;

public class Degraus {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do degrau em centimetros: ");
        double centimetros = scanner.nextDouble();
        System.out.println("Digite a altura que voce deseja subir em centimetros: ");
        double altura = scanner.nextDouble();

        double degraus = altura / centimetros;

        System.out.println("Você irá subir " + degraus + " degraus");
    }
}
