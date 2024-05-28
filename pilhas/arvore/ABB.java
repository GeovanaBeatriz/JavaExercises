public class ABB {
    private No raiz;

    public boolean estaVazia(){
        return raiz == null;
    }

    public void insere(int x){
        No novo = new No(x);
        if(estaVazia()){
            raiz = novo;
        }
        else{
            insereRec (novo, raiz);
        }
    }

    void insereRec (No novo, No atual){
        if (novo.getInfo() <= atual.getInfo()){ //vai para esquerda
            if(atual.getEsquerdo() == null){
                atual.setEsquerdo(novo);
            }
            else{
                insereRec(novo, atual.getEsquerdo());
            }
        }
        else{ //vai para a direita
            if(atual.getDireito() == null){
                atual.setDireito(novo);
            }
            else{
                insereRec(novo, atual.getDireito());
            }
        }        
    }

    public String toStringEmOrdem (){
        if(estaVazia())
            return "arvore vazia";
        return toStringEmOrdemRec(raiz);
    }

    String toStringEmOrdemRec(No atual) {
        if(atual == null)
            return "";
        return toStringEmOrdemRec(atual.getEsquerdo()) + atual + " " + toStringEmOrdemRec(atual.getDireito());
    }

    public int menor(){
        if(estaVazia()) return -1;
        No aux = raiz;
        while(aux.getEsquerdo() != null){
            aux = aux.getEsquerdo();
        }
        return aux.getInfo();
    }

    public int numNos(){
        if(estaVazia()) return 0;
        return numNosRec(raiz);
    }

    int numNosRec(No atual){
        if(atual == null) return 0;
        return numNosRec(atual.getEsquerdo()) + 1 + numNosRec(atual.getDireito());
    }
}
