public class ListaDupla <T>{
    private NoDuplo <T> primeiro;
    private NoDuplo <T> ultimo;
    public boolean estaVazia(){
       return primeiro == null;
    }

    public void insereInicio(T info){
        NoDuplo<T> novo = new NoDuplo<>(info);
        if(!estaVazia()){
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        else{
            ultimo = novo;
        }
        primeiro = novo;
    }

    public void insereFim(T info){
        NoDuplo<T> novo = new NoDuplo<>(info);
        if(!estaVazia()){
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        else{
            primeiro = novo;
        }
        ultimo = novo;
    }

    public boolean removeElementoNaPosicao(int posicao){
        NoDuplo<T> aux = primeiro;
        int contador = 0;

        while (aux != null && contador < posicao) {
            aux = aux.getProximo(); //passando para o proximo elemento
            contador++; //contador auxiliar para chegar na posicao desejada
        }

        if (aux == null) {
            return false; //caso a lista esteja vazia
        }

        aux.getAnterior().setProximo(aux.getProximo());
        aux.getProximo().setAnterior(aux.getAnterior());

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoDuplo<T> aux = primeiro;
        while (aux != null) {
            sb.append(aux.getInfo()).append(" ");
            aux = aux.getProximo();
        }
        return sb.toString();
    }

}
