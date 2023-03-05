import javax.swing.JOptionPane;

public class SucessorEAntecessor {
    
    public static void main (String [] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        if (numero < 0){
            int sucessor = numero - 1;
            int antecessor = numero + 1;

            JOptionPane.showMessageDialog(null, "O sucessor de " + numero + " e " + sucessor + " e seu antecessor e " + antecessor);
        }
        else{

            int sucessor = numero + 1;
            int antecessor = numero - 1;

            JOptionPane.showMessageDialog(null, "O sucessor de " + numero + " e " + sucessor + " e seu antecessor e " + antecessor);
        }
    }
}
