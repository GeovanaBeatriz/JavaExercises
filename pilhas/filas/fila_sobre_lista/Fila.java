public class Fila{
    private No primeiro;
    private No ultimo;
    //construtor padrão
    
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void enfileira (Pessoa p1) {
        No novo = new No(p1);
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

      //19. Dado um avalor, verificar sua posição na fila
      public int posicaoDeElemento(int valor) {
        No aux = primeiro;
        int posicao = 0;
        while (aux != null) {
            if (aux.getInfo() == valor) { //valor da aux for igual ao do elemento passado
                return posicao;
            }
            aux = aux.getProximo(); //pega o proximo nó
            posicao++; //incrementa posição
        }
        return -1; // Elemento não encontrado
    }
}

class No {
    private int info;
    private No proximo;
    public No (int info) {
        setInfo(info);
        setProximo(null); //clareza
    }
    public int getInfo() {
        return info;
    }
    public No getProximo() {
        return proximo;
    }
    public void setInfo (int info) {
        this.info = info;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "|" + info + "|->";
    }
    public No getEsquerdo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEsquerdo'");
    }
    public void setEsquerdo(No novo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEsquerdo'");
    }
    public No getDireito() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDireito'");
    }
    public void setDireito(No novo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDireito'");
    }
}
