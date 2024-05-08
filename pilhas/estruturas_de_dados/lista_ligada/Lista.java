public class Lista {
    private No primeiro; //controle da lista

    //construtor padrão -> zera tudo -> local storage
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

    @Override
    public String toString(){
        String s = "lista: ";
        if(estaVazia()){
            s = s + " esta vazia";
        }
        else{
            No aux = primeiro;
            while(aux != null){ //percorre até o final da lista
                s = s + aux;
                aux = aux.getProximo();
            }

            s = s + "\\\\";
        }

        return s;
    }

    public void insereFim(int i){
        No novo = new No(i);
        if(estaVazia()){
            primeiro = novo;
        }
        else{
            No aux = primeiro;
            while(aux.getProximo() != null){//percorre ate o ultimo
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

}
