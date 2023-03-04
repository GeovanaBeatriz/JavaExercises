import javax.swing.JOptionPane;

public class RadianosParaGraus {
    
    public static void main (String [] args){

        double radianos = Double.parseDouble(JOptionPane.showInputDialog("Digite um angulo em radianos: "));

        double graus = radianos * 180 / 3.14;

        JOptionPane.showMessageDialog(null, radianos + " radianos correspondem a " + graus + " graus");
    }
}
