import java.util.Scanner;

public class DataValida {
    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um dia: ");
        int dia = scanner.nextInt();
        System.out.print("Digite um mês: ");
        int mes = scanner.nextInt();
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if(ano <= 2023){
            if(mes > 0 && mes < 13){
                if(dia > 0){
                    if(mes == 2){
                        if(dia <= 28){
                            System.out.println("Data válida");
                        }
                        else if(dia == 29 && ano % 4 == 0){
                            System.out.println("Data válida");
                        }
                        else{
                            System.out.println("Data inválida");
                        }
                    }
                    if(mes == 4 || mes == 6 || mes == 7 || mes == 9){
                        if(dia <= 30){
                            System.out.println("Data válida!");
                        }
                        else{
                            System.out.println("Data inválida");
                        }
                    }
                    if(mes == 1 || mes == 3 || mes == 5 || mes == 8 || mes == 10 || mes == 11 || mes == 12){
                        if(dia <= 31){
                            System.out.println("Data válida");
                        }
                        else{
                            System.out.println("Data inválida");
                        }
                    }
                }
                else{
                    System.out.println("Data inválida. Dia inválido!");
                }
            }
            else{
                System.out.println("Data inválida. Mês inválido!");
            }
        }
        else{
            System.out.println("Data inválida. Ano inválido!");
        }

        scanner.close();
    }
}
