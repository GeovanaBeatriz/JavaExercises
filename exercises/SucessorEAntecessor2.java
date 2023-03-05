import javax.swing.JOptionPane;

public class SucessorEAntecessor2 {
    
    public static void main (String [] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        if (numero < 0){
            int sucTriplo = numero * 3 - 1;
            int antDobro = numero * 2 + 1;

            int soma = sucTriplo + antDobro;

            JOptionPane.showMessageDialog(null, "O sucessor do triplo " + numero + " e " + sucTriplo + " e seu antecessor de seu dobro e " + antDobro + ". Sua soma e " + soma);
        }
        else{

            int sucTriplo = numero * 3 + 1;
            int antDobro = numero * 2 - 1;

            int soma = sucTriplo + antDobro;
            
            JOptionPane.showMessageDialog(null, "O sucessor do triplo " + numero + " e " + sucTriplo + " e seu antecessor de seu dobro e " + antDobro + ". Sua soma e " + soma);
        }
    }
}
