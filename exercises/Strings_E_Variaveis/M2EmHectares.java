package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class M2EmHectares {
    
    public static void main (String [] args){

        double metros = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de area metros quadrados: "));
    
        double hectares = metros * 0.0001;
    
        JOptionPane.showMessageDialog(null, metros + " metros quadrados correspondem a " + hectares + " hectares");
    
    }
}
