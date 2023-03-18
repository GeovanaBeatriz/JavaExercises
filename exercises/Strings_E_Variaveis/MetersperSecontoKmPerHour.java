package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class MetersperSecontoKmPerHour {
    
    public static void main (String[] args){

        double meters = Double.parseDouble(JOptionPane.showInputDialog("Digite uma velocidade em m/s: "));

        double kilometers = meters * 3.6;

        JOptionPane.showMessageDialog(null, meters + " m/s correspondem a " + kilometers + " km/h");
    }

}
