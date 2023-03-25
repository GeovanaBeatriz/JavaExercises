import java.util.Scanner;

public class NotaFinal {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota referente ao trabalho de laboratório: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a nota referente à avaliação semestral: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a nota referente ao exame final: ");
        double n3 = scanner.nextDouble();

        if(n1 < 0 && n1 > 10 && n2 < 0 && n2 > 10 && n3 < 0 && n3 > 10 ){
            System.out.println("Nota inválida!");
        }
        else{
            double mediaFinal = (2 * n1 + 3 * n2 + 5 * n3) / 10; //Aplicando média ponderada

            if(mediaFinal > 0 && mediaFinal <= 2.9){
                System.out.println("Aluno reprovado! Nota: " + mediaFinal);
            }
            else if(mediaFinal >= 3.0 && mediaFinal <= 4.9){
                System.out.println("Aluno em recuperação! Nota: " + mediaFinal);
            }
            else{
                System.out.println("Aluno aprovado! Nota: " + mediaFinal);
            }
        }
        scanner.close();
    }
}
