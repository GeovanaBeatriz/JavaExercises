import javax.swing.JOptionPane;

public class CmParaPolegadas {
    
    public static void main (String [] args) {
    
        double centimetros = Double.parseDouble(JOptionPane.showInputDialog("Digite um comprimento em centimetros: "));
    
        double polegadas = centimetros / 2.54;
    
        JOptionPane.showMessageDialog(null, centimetros + " centimetros correspondem a " + polegadas + " polegadas");
    
    }
}
