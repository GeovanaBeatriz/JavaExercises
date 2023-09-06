import java.util.*;

public class Conceito{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a média: ");
        double media = sc.nextDouble();
        emitirConceito(media);
        sc.close();
    }

    public static void emitirConceito(double media){

            if(media >= 0 && media <= 4.9){
                System.out.println("Conceito =  D");
            }
            else if(media >= 5.0 && media <= 6.9){
                System.out.println("Conceito =  C");
            }
            else if(media >= 7.0 && media <= 8.9){
                System.out.println("Conceito =  B");
            }
            else if(media >= 9.0 && media <= 10.0){
                System.out.println("Conceito =  A");
            }
            else{
                System.out.println("Valor incorreto!");
            }
            return;
        }
    }

 