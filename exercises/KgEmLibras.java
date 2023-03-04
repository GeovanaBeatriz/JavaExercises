import javax.swing.JOptionPane;

public class KgEmLibras {
    
    public static void main (String [] args){

        double quilogramas = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de massa em quilogramas: "));

        double libras = quilogramas / 0.45;

        JOptionPane.showMessageDialog(null, quilogramas + " quilogramas correspondem a " + libras + " libras");
    }
}
