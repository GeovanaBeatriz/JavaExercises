import javax.swing.JOptionPane;

public class FahrenheitoCelsius {
    
    public static void main (String [] args){

        //Entrada
        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em Fahrenheit: "));

        //Processamento
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        //Saída
        JOptionPane.showMessageDialog(null, fahrenheit + " graus Fahrenheit correspondem a " + celsius + " graus Celsius.");
    }
}
