import javax.swing.JOptionPane;

public class Exercise1to5{

    public static void main (String[] args){

        // Exercicio 1

        int numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: ")); 

        //Exercicio 2

        double numeroQuebrado = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real: "));

        //Soma de valores - Exercicio 3

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));

        int soma = num1 + num2 + num3;

        //Exercicio 4
        double quadradoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero para ver o seu quadrado: "));

        double quadrado = quadradoNumero * quadradoNumero;

        //Exercicio 5
        double quintaParte = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero para ver a sua quinta parte: "));

        double divisaoQuintaParte = quintaParte / 5;

        JOptionPane.showMessageDialog(null, "Numero Inteiro: " + numeroInteiro + "; Numero real: " + numeroQuebrado + "; Soma dos tres valores inteiros: " + soma + "; Quadrado de " + quadradoNumero + " e igual a " + quadrado + "; A quinta parte de " + quintaParte + " e igual a " + divisaoQuintaParte);
    }
}