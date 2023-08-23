import javax.swing.JOptionPane; 

public class Fatorial0AN{ 

    public static void main(String[] args){ 

        int n; 
        do { 
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: ")); 
        } 
        while(n<0); 

        String s = ""; 
        for(int i = 0; i <=n; i++){ 

            int cont = 2; 
            int fat = 1; //Altera o tipo aqui 
            while(cont <= i){ 

                fat = fat * cont; 
                cont++; 
            } 
            s = s + "Fatorial de " + i + " = " + fat + "\n"; 
        } 

        JOptionPane.showMessageDialog(null, s); 
    } 

} 
