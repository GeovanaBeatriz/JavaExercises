import java.util.Scanner;

public class MatrizTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];

        // Lendo
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimindo
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }

        // Testando
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > j && matriz[i][j] == 0) {
                    System.out.println("Matriz Triangular!");
                } else {
                    System.out.println("Não é uma matriz triangular!");
                }
            }
        }
    }
}
