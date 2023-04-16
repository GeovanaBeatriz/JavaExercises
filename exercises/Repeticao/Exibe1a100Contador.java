package Repeticao;

public class Exibe1a100Contador {
        public static void main( String[] args) throws InterruptedException{ 
            int cont = 1; //inicio 
    
            while(cont <= 10){ //fim 
    
                System.out.print(cont + " "); 
    
                cont++; //passo 
    
                Thread.sleep(1000); 
    
            } 
    
        } 
}
