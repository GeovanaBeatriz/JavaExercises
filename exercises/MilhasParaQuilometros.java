import javax.swing.JOptionPane;

public class MilhasParaQuilometros {
    
    public static void main (String [] args){

        double milhas = Double.parseDouble(JOptionPane.showInputDialog("Digite uma distancia em milhas: "));

        double quilometros = 1.61 * milhas;

        JOptionPane.showMessageDialog(null, milhas + " milhas correspondem a " + quilometros + " quilometros");
    }
}
