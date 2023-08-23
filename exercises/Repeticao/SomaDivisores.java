import javax.swing.JOptionPane;
public class SomaDivisores {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite um inteiro"));
        int metade = n / 2;
        int soma = 0;
        for(int i=1; i<=metade; i++) {
            if (n % i == 0) {
                soma = soma + i;
            }
        }
        JOptionPane.showMessageDialog(null, "soma dos divisores = " + soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
