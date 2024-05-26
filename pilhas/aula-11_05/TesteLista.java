import java.util.Random;

public class TesteLista {
    public static void main(String[] args) {
        //ListaDupla<Integer> ld = new ListaDupla<>();
       // Random random = new Random();
        //do {
           // if (random.nextBoolean()) {
                //int n = random.nextInt(100);
                //if (n % 2 == 0) {
                    //ld.insereInicio(n);
                //}
               // else {
                    //ld.insereFim(n);
               // }
           // }
            //else {
                //if (random.nextBoolean()) {
                    //if (!ld.estaVazia())
                        //.out.println(ld.removeFim() + " saiu do fim");
                //}
                //else {
                    //if (!ld.estaVazia())
                        //System.out.println(ld.removeInicio() + " saiu do inicio");
                //}
            //}
            //System.out.println(ld);
        //} while (!ld.estaVazia());

        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.insereInicio(5);
        lista.insereInicio(3);
        lista.insereFim(7);
        lista.insereFim(10);
        lista.insereFim(2);

        System.out.println(lista); // Exibe a lista
        int posicao = lista.posicaoDeElemento(10);
        if (posicao != -1) {
            System.out.println("O elemento 10 está na posição: " + posicao);
        } else {
            System.out.println("O elemento 10 não foi encontrado na lista.");
        }

        System.out.println(lista);
        lista.removeElementoNaPosicao(3);
        System.out.println(lista);
    }
}
