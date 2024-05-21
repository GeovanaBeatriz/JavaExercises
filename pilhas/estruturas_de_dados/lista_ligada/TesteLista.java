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

        System.out.println("Antes de remover: \n" +lista);
        lista.removePrimeiraOcorrencia(20);
        System.out.println("Depois de remover o número 20: \n" + lista); // Exibe a lista após a remoção

        No maior = lista.maiorElemento();
        if (maior != null) {
            System.out.println("Maior elemento: " + maior.getInfo());
        } else {
            System.out.println("A lista está vazia.");
        }

        System.out.println("posição do maior elemento: " + lista.maiorElementoPosicao());
    }
}
