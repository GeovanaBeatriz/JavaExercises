public class SomaIndicesTridimensional { 

    public static void main(String [] args){ 

        int total = 0; 
        int pares = 0; 
        int impares = 0; 

        int [][][] matriz = new int[3][3][3]; 

            System.out.println("A soma dos seguintes indices são: "); 
            for(int i=0;i<matriz.length;++i){ 

                for(int j=0;j<matriz.length;++j){ 

                    for(int k=0;k<matriz.length;++k){ 

                        System.out.print("[" + i + "]" + "[" + j + "]" + "[" + k + "]=" + (i+j+k) + " | "); 

                        total = total + (i+j+k); 

                        if((i+j+k) % 2 == 0){ 
                            pares = pares + (i+j+k); 
                        } 
                        else{ 
                            impares = impares + (i+j+k); 
                        } 
                    } 
                    System.out.println(" "); 
                } 
                System.out.println(" "); 
            } 

            System.out.println(" "); 
            System.out.println("A soma total dos numeros é = " + total); 
            System.out.println("A soma dos pares = " + pares); 
            System.out.println("A soma dos impares = " + impares);   

        } 

} 