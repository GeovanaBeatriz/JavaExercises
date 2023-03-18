package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class KmperHourtoMetersperSecond{

    public static void main (String [] args){

        double kilometers = Double.parseDouble(JOptionPane.showInputDialog("Digite uma velocidade em Km/h: "));

        double meters = kilometers / 3.6;

        JOptionPane.showMessageDialog(null, kilometers + " km/h correspondem a " + meters + " m/s");
    }
}