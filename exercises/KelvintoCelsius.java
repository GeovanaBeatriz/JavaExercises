import javax.swing.JOptionPane;

public class KelvintoCelsius {
    
    public static void main (String [] args){

        //Entrada
        double kelvin = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em Kelvin: "));

        //Processamento
        double celsius = kelvin - 273.5;

        //Saída
        JOptionPane.showMessageDialog(null, kelvin + " graus Kelvin correspondem a " + celsius + " graus Celsius.");
    }
}
