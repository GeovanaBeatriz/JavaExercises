import javax.swing.JOptionPane;

public class CotacaoDolar {

    public static void main (String [] args){

        double real = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em reais: "));

        double cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotacao do dolar atualmente: "));

        double conversao = real * cotacaoDolar;

        JOptionPane.showMessageDialog(null, "O valor de " + real + " correspondente em dolares e " + conversao);
    }
    
}
