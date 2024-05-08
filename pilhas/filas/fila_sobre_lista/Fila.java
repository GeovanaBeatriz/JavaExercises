public class Fila{
    private No primeiro;
    private No ultimo;
    //construtor padrão
    
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void enfileira (int i) {
        No novo = new No(i);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public int desenfileira() {
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (estaVazia()){ //esvaziou a lista
            ultimo = null;
        }
        return temp;
    }

    @Override
    public String toString(){
        if(estaVazia()){
            return "fila vazia";
        }
        else{
            String s = "";
            No aux = primeiro;
            while(aux != null){
                s += aux;
                aux = aux.getProximo();
            }
            return s;
        }
    }
}
