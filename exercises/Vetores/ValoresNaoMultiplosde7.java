package Vetores;

public class ValoresNaoMultiplosde7 {
    public static void main(String[] args) { 

        int[] valores = new int[100]; 
        int cont = 0; //Vai contar os cem valores 
        int runner = 1; //Valor que vai percorrer a sequencia dos naturais 

       while(cont < 100){ 

            if(runner % 7 != 0 || runner % 10 == 7){ 

                valores[cont] = runner; 
                cont++; 
            } 

            runner++; 
        }   

            System.out.println("O vetor: "); 

            for(cont = 0; cont < 100; cont++){ 

                System.out.print(valores[cont] + " "); 

            } 

    } 

} 


