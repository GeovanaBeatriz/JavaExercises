import javax.swing.JOptionPane;

//Ler nome e sobrenome e exibir nome completo
public class TesteEntrada {
    public static void main(String[] args){
       
       String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
       String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome: ");
       JOptionPane.showMessageDialog(null, "Nome completo: " + nome + " " + sobrenome);
    }
}
