import javax.swing.JOptionPane;

public class HectaresEmM2 {
    
    public static void main (String [] args){

        double hectares = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de area hectares: "));
    
        double metros = hectares * 10000;
    
        JOptionPane.showMessageDialog(null, hectares + " hectares correspondem a " + metros + " metros quadrados");
    
    }
}
