public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println(lista);

        for(int i=1; i<10; i++){
            lista.insereInicio(i*10);
            System.out.println(lista);
        }

        for(int i=5; i<6; i++){
            lista.insereFim(i*10 + 5);
            System.out.println(lista);
        }

        System.out.println("posicao do maior elemento: " + lista.maiorElementoPosicao());
    }
}
