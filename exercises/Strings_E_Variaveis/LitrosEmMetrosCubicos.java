package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class LitrosEmMetrosCubicos {
    
    public static void main (String [] args){

        double litros = Double.parseDouble(JOptionPane.showInputDialog("Digite um volume em litros: "));

        double m3 = litros / 1000;

        JOptionPane.showMessageDialog(null, litros + " litros correspondem a " + m3 + " metros cubicos");
    }
}
