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
}
