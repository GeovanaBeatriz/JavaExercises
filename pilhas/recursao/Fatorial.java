public class Fatorial {

    static float fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static void exibiRec1(int i, int n) {
        if (i <= n) {
            System.out.println(i);
            exibiRec1(i + 1, n);
        }
    }

    static void exibiRec2(int n) {
        if (n > 1) {
            exibiRec2(n - 1);
        }
        System.out.println(n);
    }

    static int somaRec1(int[] v, int i) {
        if (i < v.length) {
            return v[i] + somaRec1(v, i + 1);
        }
        return 0;
    }

    public static void main (String[] args){
       // for(int i = 0; i <= 13; i++){
          //  System.out.println("Fatorial de " + i + " = " + String.format("%.0f", fatorial(i)));
      //  }

        //for(int i = 0; i < 30; i++){ //limite até 45, pq se não estoura a capacidade do int
        //    System.out.println("Fibonacci em " + i + " = " + fibonacci(i));
        //}

        int n = 10;
        for(int i = 1; i <=10; i++){
            System.out.println(i);
        }

        exibiRec1(1, 10);
        exibiRec2(10);
        int[] v = {1, 2, 3, 4, 5};
        int soma = 0;
        for(int i = 0; i < 5; i++){
            soma = soma  + v[i];
        }
        System.out.println("soma = " + soma);
        System.out.println("soma rec 1 = " + somaRec1(v, 0));

    }
}