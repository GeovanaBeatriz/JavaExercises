import java.util.Random;
import javax.swing.JOptionPane;
public class TestePilha {
    public static void main(String[] args) {
        Random random = new Random();
        Pilha pilha = new Pilha();
        do {
            if (random.nextBoolean()) 
                pilha.empilha(random.nextInt(10));
            else{
                if (!pilha.estaVazia()) {
                    JOptionPane.showMessageDialog(null, pilha.desempilha(), "Elemento desempilhado", 1);
                }
            }
            JOptionPane.showMessageDialog(null, pilha, "Minha pilha", 1);
        } while (!pilha.estaVazia());
    }
}
