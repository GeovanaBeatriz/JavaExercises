import java.util.Scanner; 

public class ValoresMatrizTridimensional{ 

    public static void main(String [] args){ 


    Scanner sc = new Scanner(System.in); 

    int [][][] matriz = new int[3][3][3]; 

 
        System.out.println("Digite os valores da matriz: "); 

        for(int i=0;i<matriz.length;++i){ 

            for(int j=0;j<matriz.length;++j){ 

                for(int k=0;k<matriz.length;++k){ 

                    matriz[i][j][k] = sc.nextInt(); 

                } 

            } 

        } 

 
        System.out.println("Os valores digitados nas matrizes foram: "); 

        for(int i=0;i<matriz.length;i++){ 

            for(int j=0;j<matriz.length;j++){ 

                for(int k=0;k<matriz.length;k++){ 

                    System.out.print("[" + i + "]" + "[" + j + "]" + "[" + k + "]=" + matriz[i][j][k] + " | "); 

                } 

                System.out.println(" "); 
            } 
            System.out.println(" "); 
        } 
        System.out.println(" "); 

        sc.close(); 

    } 

} 