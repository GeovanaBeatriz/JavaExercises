import javax.swing.JOptionPane;
public class ListaPerfeitos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite um inteiro"));
        String saida = "";
        for (int i=1; i<=n; i++) {
            int metade = i / 2;
            int soma = 0;
            for(int j=1; j<=metade; j++) {
                if (i % j == 0) {
                    soma = soma + j;
                }
            }
            if (i == soma) {
                saida = saida + i + " ";
            }
        }
        JOptionPane.showMessageDialog(null, saida, "Numeros perfeitos de " + 1 + " a " + n, JOptionPane.INFORMATION_MESSAGE);
    }
}
