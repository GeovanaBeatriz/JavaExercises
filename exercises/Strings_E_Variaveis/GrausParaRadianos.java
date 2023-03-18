package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class GrausParaRadianos {
    
    public static void main (String [] args){

        double graus = Double.parseDouble(JOptionPane.showInputDialog("Digite um angulo em graus: "));

        double radianos = graus * 3.14 / 180;

        JOptionPane.showMessageDialog(null, graus + " graus correspondem a " + radianos + " radianos");
    }
}
