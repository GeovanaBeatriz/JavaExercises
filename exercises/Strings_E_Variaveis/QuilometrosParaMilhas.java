package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class QuilometrosParaMilhas {
    
    public static void main (String [] args){

        double quilometros = Double.parseDouble(JOptionPane.showInputDialog("Digite uma distancia em quilometros: "));

        double milhas = quilometros / 1.61;

        JOptionPane.showMessageDialog(null, quilometros + " quilometros correspondem a " + milhas + " milhas");
    }
}
