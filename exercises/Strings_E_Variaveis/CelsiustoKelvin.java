package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class CelsiustoKelvin {
    public static void main (String [] args){

        //Entrada
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em Celsius: "));

        //Processamento
        double kelvin = celsius + 273.5;

        //Saída
        JOptionPane.showMessageDialog(null, celsius + " graus Celsius correspondem a " + kelvin + " graus Kelvin.");
    }
}


