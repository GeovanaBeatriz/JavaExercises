import java.util.Scanner;

public class MatrizIdentidade {
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int matriz[][] = new int[3][3];
        int principal = 0;
        int demais = 0;
    
            System.out.println("Digite os valores da matriz: ");
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    matriz[i][j] = sc.nextInt();

                    while(matriz[i][j] < 0 || matriz[i][j] > 1){
                        System.out.println("Você digitou um valor que não é válido. Digite NOVAMENTE: ");
                        matriz[i][j] = sc.nextInt();
                    }
        
                }
                
            }
        
            //Imprimindo
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                  System.out.print(matriz[i][j]+" | ");
                }
                System.out.println("");
            }

            //Testando para ver se é identidade ou não
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                  if(i==j){
                    principal = principal + matriz[i][j];
                  }
                  else{
                    demais = demais + matriz[i][j];
                  }
                }
            }

            if(principal == 3 && demais == 0){
                System.out.println("Matriz IDENTIDADE!");
            }
            else{
                System.out.println("Não é matriz identidade!");
            }
    }   
}
