import javax.swing.JOptionPane;

public class Ex60Lista03 {
    
    public static void main(String[] args) {
        
        int num;
        int soma = 0;
        int cont = 0;
        int contPares = 0;
        int somaPares = 0;
        int maior = 0;
        int menor = 0;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            soma = soma + num;
            cont++;

            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
            if(num % 2 == 0){
                somaPares = somaPares + num;
                contPares++;
            }
        }
        while(num != 0);

        double media = soma / (cont - 1);
        double mediaPares = somaPares / (contPares - 1);

        System.out.println("1 - Soma dos números: " + soma);
        System.out.println("2 - Quantidade de números digitados: " +  (cont - 1));
        System.out.println("3 - Média dos números digitados: " + media);
        System.out.println("4 - Maior valor digitado: " + maior);
        System.out.println("5 - Menor valor digitado: " + menor); //Como descobrir menor valor?
        System.out.println("6 - Média dos valores pares: " + mediaPares);
    }
}
