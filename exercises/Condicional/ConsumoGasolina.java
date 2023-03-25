import java.util.Scanner;

public class ConsumoGasolina {
    
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em Km: ");
        double distancia = scanner.nextDouble();
        System.out.print("Digite a quantidade de litros de gasolina gastos: ");
        double gasolina = scanner.nextDouble();

        if(gasolina == 0){
            System.out.println("Não é possível dividir por zero!");
        }
        else{
            double consumo = distancia / gasolina;

            if(consumo < 8){
                System.out.println("Venda o carro!");
            }
            else if(consumo >= 8 && consumo <=14){
                System.out.println("Econômico!");
            }
            else{
                System.out.println("Super econômico!");
            }
        }
        
        scanner.close();

    }
}
