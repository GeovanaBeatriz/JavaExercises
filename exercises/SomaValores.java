import javax.swing.JOptionPane;

//LER DOIS INTEIROS E SOMAR SEUS VALORES
public class SomaValores {
    
    public static void main (String[] args){

        //Leitura modo 1
        String auxiliar = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        int num1 = Integer.parseInt(auxiliar);

        //Leitura modo 2
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

        //processamento 

        int soma = num1 + num2;

        //Saída

        JOptionPane.showMessageDialog(null, "A soma dos valores é = " + soma);
        // segunda opção => JOptionPane.showMessageDialog(null, "A soma dos valores é = " + (num1 + num2));
    }
}
