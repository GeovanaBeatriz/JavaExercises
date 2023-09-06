import java.util.*;

public class Tempo{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor em segundos: ");
        int tempo = sc.nextInt();
        verificarTempo(tempo);
        sc.close();
    }

    public static void verificarTempo(int tempo){
			//OBS: SEMPRE APLICAR '%' EM TIPO INT
            int horas = tempo / 3600; //horas
            int restoMin = tempo % 3600;
            int minutos = restoMin / 60; // minutos
            int segundos = tempo % 60;//segundos
            System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos");
        return;
        }
    }