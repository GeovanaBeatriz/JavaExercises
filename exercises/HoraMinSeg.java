import java.util.Scanner;

public class HoraMinSeg {
    
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        int h, m, s, resto;

        System.out.println("Digite um numero em segundos para ser transformado em horas, minutos e segundos: ");
        int segundos = scanner.nextInt();

        h = segundos / 3600;
        resto = segundos % 3600;
        m = resto / 60;
        s = resto / 60;

        System.out.printf(h + "h"+ m + "min"+ s + "seg");

        scanner.close();
    }
}
