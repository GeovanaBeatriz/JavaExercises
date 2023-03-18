package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class M2EmAcres {
    
    public static void main (String [] args){

    double metros = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de area em metros quadrados: "));

    double acres = metros *  0.000247;

    JOptionPane.showMessageDialog(null, metros + " metros quadrados correspondem a " + acres + " acres");

    }
}
