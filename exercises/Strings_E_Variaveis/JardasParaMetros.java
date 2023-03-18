package Strings_E_Variaveis;
import javax.swing.JOptionPane;


public class JardasParaMetros {
    public static void main (String [] args){

        double jardas = Double.parseDouble(JOptionPane.showInputDialog("Digite um comprimento em jardas: "));

        double metros = 0.91 * jardas;

        JOptionPane.showMessageDialog(null, jardas + " jardas correspondem a " + metros + " metros");
    }
}
