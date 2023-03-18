package Strings_E_Variaveis;
import java.util.Scanner;

public class AjudaVendedores {
    
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = scanner.nextDouble();

        double descontoDez = (valor * 10 / 100);
        double contaDez = valor - descontoDez;
        double parcelaTres = valor / 3;
        double comVendaVista = contaDez * 5 / 100;
        double comVendaParcelada = valor * 5 / 100;

        System.out.print("O valor do produto é R$" + valor + "\nO desconto de 10% fará o produto custar R$" + contaDez + "\nSe parcelado em três vezes custará R$" + String.format("%.2f", parcelaTres) + "\nA comissao do vendedor se vendido a vista será de R$" + comVendaVista + "\nA comissao do vendedor se vendido parcelado será R$" + comVendaParcelada);

        scanner.close();
    }
}
