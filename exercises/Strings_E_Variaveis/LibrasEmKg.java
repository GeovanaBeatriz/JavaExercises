package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class LibrasEmKg {
    
    public static void main (String [] args){

        double libras = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de massa em libras: "));

        double quilogramas = libras * 0.45;

        JOptionPane.showMessageDialog(null, libras + " libras correspondem a " + quilogramas + " quilogramas");
    }
}
