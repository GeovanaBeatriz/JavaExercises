import java.util.*;

public class Media{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        System.out.println("Digite um valor inteiro: ");
        int valor2 = sc.nextInt();
        System.out.println("Digite 'A' ou 'P': ");
        char opcao = sc.next().charAt(0);
        int media = calcularMedia(valor, valor2, opcao);

        if (opcao == 'A'){
            System.out.println("A media arimetica = " + media);
        }
        else{
            System.out.println("A media ponderada = " + media);
        }

        sc.close();
    }

    public static int calcularMedia(int valor, int valor2, char opcao){

            if(opcao == 'A'){
            int mediaA = (valor + valor2) / 2;
            return mediaA;
            }
            else{
                int mediaP = (valor * 7 + valor2 * 3) / 10;
            return mediaP;
            }
        }
    }

 

 

 