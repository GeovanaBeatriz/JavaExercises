import javax.swing.JOptionPane;

public class TransformacaoCelsiusFahrenheit {
    
    public static void main(String[] args){

        //Entrada
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em Celsius: "));

        //Processamento
        double fahrenheit = 1.8 * celsius + 32;

        //Saída
        JOptionPane.showMessageDialog(null, celsius + " graus Celsius correspondem a " + fahrenheit +
        " graus Fahrenheit.");
    }
}
