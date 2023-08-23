import javax.swing.JOptionPane; 

public class Ex28Lista03{ 

    public static void main(String[] args){ 

        int n; 

        do { 
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: ")); 
        } 
        while(n<0); 

        double soma = 0; 
        for(int i = 0; i <=n; i++){ 

            int cont = 2; 
            double fat = 1; 

            while(cont <= i){ 

                fat = fat * cont; 
                cont++; 
            } 
                soma = soma + 1/fat; 
        } 

        JOptionPane.showMessageDialog(null, "O valor é: " + soma);

    } 

} 
