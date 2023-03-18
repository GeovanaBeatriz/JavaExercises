package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class PolegadasParaCm {

    public static void main (String [] args) {
    
    double polegadas = Double.parseDouble(JOptionPane.showInputDialog("Digite um comprimento em polegadas: "));

    double centimetros = polegadas * 2.54;

    JOptionPane.showMessageDialog(null, polegadas + " polegadas correspondem a " + centimetros + " centimetros");

    }
}