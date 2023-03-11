import java.util.Scanner;

public class VolumeCilindro {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();


        double volume =  3.141592 * raio * raio * altura;

        System.out.println("O valor do volume do cilindro é : " + volume);

        scanner.close();
    }
}
