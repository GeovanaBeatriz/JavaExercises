
import java.util.Scanner;


public class Parcelas {
    
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        double conta, desconto, divisao;

        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a quantidade de parcelas: ");
        int parcelas = scanner.nextInt();

        if(parcelas == 1){
            desconto = valor * 10 / 100;
            conta = valor - desconto;
            

            System.out.println("A compra foi no valor de R$" + valor + " e você ganhou um desconto de 10%. Sua compra agora vale R$ " + conta);
        }
        else if(parcelas == 2){
            desconto = valor * 20 / 100;
            conta = valor - desconto;
            divisao = conta / 2;

            System.out.println("A compra foi no valor de R$" + valor + " e você ganhou um desconto de 20%. Sua compra agora vale R$ " + conta + ". Cada parcela vale R$ " + divisao);
        }
        else if(parcelas == 3){
            desconto = valor * 30 / 100;
            conta = valor - desconto;
            divisao = conta / 3;

            System.out.println("A compra foi no valor de R$" + valor + " e você ganhou um desconto de 30%. Sua compra agora vale R$ " + conta + ". Cada parcela vale R$ " + divisao);
        }
        else{
            System.out.println("Valor inválido!");
        }

        scanner.close();
    }
}
