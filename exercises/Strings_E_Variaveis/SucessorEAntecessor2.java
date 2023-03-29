package Strings_E_Variaveis;
import javax.swing.JOptionPane;

public class SucessorEAntecessor2 {
    
    public static void main (String [] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        
            int sucTriplo = numero * 3 + 1;
            int antDobro = numero * 2 - 1;

            int soma = sucTriplo + antDobro;

            JOptionPane.showMessageDialog(null, "O sucessor do triplo " + numero + " é " + sucTriplo + " e o antecessor de seu dobro é " + antDobro + ". Sua soma é " + soma);
        
    }
}
