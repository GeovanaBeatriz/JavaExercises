import javax.swing.JOptionPane;

public class SomaDosQuadrados {
    
    public static void main (String[] args){

        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));

        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));

        double valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));

        double somaDosQuadrados = (valor1 * valor1) + (valor2 * valor2) + (valor3 * valor3);

        JOptionPane.showMessageDialog(null, "A soma dos quadrados dos valores inseridos é " + somaDosQuadrados);
    }
}
