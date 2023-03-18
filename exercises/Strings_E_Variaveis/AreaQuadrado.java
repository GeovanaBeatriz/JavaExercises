package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class AreaQuadrado {
    
    public static void main (String [] args){

        double ladoQuadrado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado: "));

        double area = ladoQuadrado * ladoQuadrado;

        JOptionPane.showMessageDialog(null, "A area do quadrado de lado " + ladoQuadrado + " e igual a " + area);
    }
}
