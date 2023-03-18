package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class MetrosCubicosEmLitros {
    
    public static void main (String [] args){

        double m3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um volume em metros cubicos: "));

        double litros = 1000 * m3;

        JOptionPane.showMessageDialog(null, m3 + " metros cubicos correspondem a " + litros + " litros");
    }
}