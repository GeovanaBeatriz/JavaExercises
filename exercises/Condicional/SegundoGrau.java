import java.util.Scanner;

public class SegundoGrau {
        public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite o coeficiente A: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o coeficiente B: ");
            double b = scanner.nextDouble();
            System.out.print("Digite o coeficiente C: ");
            double c = scanner.nextDouble();
    
            if(a == 0){
                System.out.print("Os coeficientes não representam uma equação de 1 grau");
            }
            else{
                double delta = b * b - 4 * a * c;
                
                if(delta < 0){
                    System.out.println("Não tem raiz real");
                }
                else{
                    double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b + Math.sqrt(delta)) / (2 * a);

                    System.out.println("Os valores de X são: " + x1 + " e " + x2);
                }
            }
    
            scanner.close();
        }
}
