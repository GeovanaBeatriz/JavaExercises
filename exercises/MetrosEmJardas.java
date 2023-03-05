import javax.swing.JOptionPane;

public class MetrosEmJardas {

    public static void main (String [] args){
    
    double metros = Double.parseDouble(JOptionPane.showInputDialog("Digite um comprimento em metros: "));

    double jardas = metros / 0.91;

    JOptionPane.showMessageDialog(null, metros + " metros correspondem a " + jardas + " jardas");
}
}