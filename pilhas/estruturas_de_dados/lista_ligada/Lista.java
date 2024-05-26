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

    public int removeInicio(){
        int info = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return info;
    }

    public int removeFim(){
        int temp = 0;
        if(primeiro.getProximo() ==  null){ //somente 1 elemento
            temp = primeiro.getInfo();
            primeiro = null;
        }
        else{
            No aux = primeiro;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
                temp = aux.getProximo().getInfo();
                aux.setProximo(null);
            }  
        }
        return temp;
    }


     // 2. Verificar quantas vezes um elemento aparece na lista.
     public int contarOcorrencias(int elemento) {
        int count = 0;
        No aux = primeiro;
        while (aux != null) {
            if (aux.getInfo() == elemento) {
                count++;
            }
            aux = aux.getProximo(); //chama próximo nó
        }
        return count;
    }

    //3. Devolver a posição da primeira ocorrência de um determinado elemento.
    public int posicaoDeElemento(int elemento) {
        No aux = primeiro;
        int posicao = 0;
        while (aux != null) {
            if (aux.getInfo() == elemento) { //valor da aux for igual ao do elemento passado
                return posicao;
            }
            aux = aux.getProximo(); //pega o proximo nó
            posicao++; //incrementa posição
        }
        return -1; // Elemento não encontrado
    }

     //5. Remover a primeira ocorrência de um determinado elemento.
     public void removePrimeiraOcorrencia(int elemento) { 
        No aux = primeiro;
        while (aux.getProximo() != null && aux.getProximo().getInfo() != elemento) {
            aux = aux.getProximo();
        }
        // Removendo o nó
        aux.setProximo(aux.getProximo().getProximo());
    }

    //6. Remover todas as ocorrências de um determinado elemento.
    public void removeTodasOcorrencias(int elemento) {
        No aux = primeiro;
        No anterior = null;

        while (aux != null) {
            if (aux.getInfo() == elemento) {
                if (anterior == null) {
                    // Se o nó a ser removido é o primeiro
                    primeiro = aux.getProximo();
                } else {
                    // Se o nó a ser removido não é o primeiro
                    anterior.setProximo(aux.getProximo());
                }
            } else {
                anterior = aux;
            }
            aux = aux.getProximo();
        }
    }

    

    //12. Somar os elementos da lista
    public int somarElementos() {
        int soma = 0;
        No aux = primeiro;
        while (aux != null) {
            soma = soma + aux.getInfo();
            aux = aux.getProximo(); //chama próximo nó
        }
        return soma;
    }

    //13. Encontrar o maior elemento armazenado na lista.
    public No maiorElemento() {
        No aux = primeiro;
        No maior = aux;
        while(aux != null) {
            if(aux.getInfo() > maior.getInfo()){ 
                maior = aux; 
            } 
            aux = aux.getProximo();
        }
        return maior;
    }

    //14. Encontrar a posição do maior elemento armazenado.
    public double maiorElementoPosicao() {
        No aux = primeiro;
        No maior = aux;
        double posicaoMaior = 0;
        int i = 0;
        while(aux != null) {
            
            if(aux.getInfo() > maior.getInfo()){ 
                maior = aux;  
                posicaoMaior = i;
            } 
            i++;
            aux = aux.getProximo();
        }
        return posicaoMaior;
    }
}


