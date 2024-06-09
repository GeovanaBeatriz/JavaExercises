public class TesteNoDuplo{
    public static void main(String []args){
        
        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.insereInicio(1);
        lista.insereInicio(2);
        lista.insereFim(3);
        lista.insereFim(4);
        lista.insereFim(5);

        System.out.println("Lista antes da remocao: " + lista);
        lista.removeElementoNaPosicao(2);
        System.out.println("Lista apos remocao na posicao 2: " + lista);
        
    }
}