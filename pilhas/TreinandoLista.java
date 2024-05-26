public class TreinandoLista {
    private int info;
    private No proximo;

    public TreinandoLista(int info){
        setInfo(info);
        setProximo(null);
    }

    public int getInfo(){
        return info;
    }

    public void setInfo(int info){
        this.info = info;
    }

    public No getProximo(){
        return proximo;
    }

    public void setProximo(No proximo){
        this.proximo = proximo;
    }

    @Override
    public String toString(){
        return "|" + info + "|";
    }
}

class Lista{
    private No primeiro;

    public No getPrimeiro(){
        return primeiro;
    }

    public void setPrimeiro(No primeiro){
        this.primeiro = primeiro;
    }

    public boolean estaVazia(){
        return primeiro == null;
    }

    public void insereInicio(int i){
        No novo = new No(i);
        if(!estaVazia()){
            novo.setProximo(primeiro);
        }
         primeiro = novo;
    }

    public void insereFim(int i){
        No novo = new No(i);
        if(estaVazia()){
            primeiro = novo;
        }
        else{
            No aux = primeiro;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }

    }

    public int removeInicio(){
        int info = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return info;
    }

    public int removeFim(){
        int temp;
        if(primeiro.getProximo() == null){
            temp = primeiro.getInfo();
            primeiro = null;
        }
        else{
            No aux = primeiro;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            temp = primeiro.getProximo().getInfo();
            aux.setProximo(null);
        }

        return temp;
    }

    public void removePrimeiraOcorrencia(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePrimeiraOcorrencia'");
    }

    public No maiorElemento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maiorElemento'");
    }

    public String maiorElementoPosicao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maiorElementoPosicao'");
    }

}

class Pilha{
    private No topo;

    public No getTopo(){
        return topo;
    }

    public void setTopo(No topo){
        this.topo = topo;
    }

    public boolean estaVazia(){
        return topo == null;
    }

    public int consultaTopo(){
        return topo.getInfo();
    }

    public void insereInicio(int i){
        No novo = new No(i);
        if(!estaVazia()){
            novo.setProximo(topo);
        }
        topo = novo;
    }

    public int removeInicio(){
        int info = topo.getInfo();
        topo = topo.getProximo();
        return info;
    }

    public void empilha(int nextInt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'empilha'");
    }
}
