package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class AcresParaM2 {
    
    public static void main (String [] args){

        double acres = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de area em acres: "));
    
        double metros = acres *  4048.58;
    
        JOptionPane.showMessageDialog(null, acres + " acres correspondem a " + metros + " metros quadrados");
    
    }
}
