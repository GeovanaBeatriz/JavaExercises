public class ListaDupla <T extends Number>{
    private NoDuplo <T> primeiro;
    private NoDuplo <T> ultimo;
    public boolean estaVazia() {
        return primeiro == null || ultimo == null;
    }
    public void insereInicio(T info) {
        NoDuplo<T> novo = new NoDuplo<>(info);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        else {
            ultimo = novo;
        }
        primeiro = novo;
    }
    public void insereFim (T info) {
        NoDuplo<T> novo =new NoDuplo<>(info);
        if (!estaVazia()) {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        else {
            primeiro = novo;
        }
        ultimo = novo;
    }
    public T removeInicio () {
        T temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (estaVazia()) //esvaziou a lista
            ultimo = null;
        else 
            primeiro.setAnterior(null);
        return temp;
    }
    public T removeFim () {
        T temp = ultimo.getInfo();
        ultimo = ultimo.getAnterior();
        if (estaVazia()) //esvaziou a lista
            primeiro = null;
        else 
            ultimo.setProximo(null);
        return temp;
    }
    @Override
    public String toString () {
        if (estaVazia()) return "lista vazia";
        String s = "";
        NoDuplo<T> aux = primeiro;
        while (aux != null) {
            s += aux.getInfo() + " ";   
            aux = aux.getProximo();         
        }
        return s;
    }
    //supondo que uma lista tem um número ímpar de elementos, devolver a referência do elemento do meio.
    public NoDuplo<T> doMeio () {
        NoDuplo<T> vai = primeiro;
        NoDuplo<T> volta = ultimo;
        while (vai != volta) {
            vai = vai.getProximo();
            volta = volta.getAnterior();
        }
        return vai;
    }
    //remover a primeira ocorrência de um elemento, devolver true para sucesso, ou false para fracasso

    public boolean removePrimeiraOcorrencia(T parametro) { 
        NoDuplo<T> aux = primeiro;
        while (aux != null && !aux.getInfo().equals(parametro)) {
            aux = aux.getProximo();
        }
        if (aux == null) return false;
        aux.getAnterior().setProximo(aux.getProximo());
        aux.getProximo().setAnterior(aux.getAnterior());
        return true;
    }

     // 2. Verificar quantas vezes um elemento aparece na lista.
     public int contaOcorrencias(T elemento) {
        int count = 0;
        NoDuplo<T> aux = primeiro;
        while (aux != null) {
            if (aux.getInfo().equals(elemento)) {
                count++;
            }
            aux = aux.getProximo();
        }
        return count;
    }

    //3. Devolver a posição da primeira ocorrência de um determinado elemento.
    public int posicaoDeElemento(int elemento) {
        NoDuplo<T> aux = primeiro;
        int posicao = 0;
        while (aux != null) {
            if (aux.getInfo().equals(elemento)) { //valor da aux for igual ao do elemento passado
                return posicao;
            }
            aux = aux.getProximo(); //pega o proximo nó
            posicao++; //incrementa posição
        }
        return -1; // Elemento não encontrado
    }

    //4. Remover um elemento de uma determinada posição
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

     //6. Remover todas as ocorrências de um determinado elemento.
     public void removeTodasOcorrencias(int elemento) {
        NoDuplo<T> aux = primeiro;
        NoDuplo<T> anterior = null;

        while (aux != null) {
            if (aux.getInfo().equals(elemento)) {
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

    //12. Somar os elementos da lista.
    public double somarElementos() {
        double soma = 0.0;
        NoDuplo<T> aux = primeiro;
        while (aux != null) {
            soma = soma + aux.getInfo().doubleValue(); //tive que fazer a classe T estender a classe Number pra aceitar
            aux = aux.getProximo(); //chama próximo nó
        }
        return soma;
    }

    //13. Encontrar o maior elemento armazenado na lista.
    public NoDuplo<T> maiorElemento() {
        NoDuplo<T> aux = primeiro;
        NoDuplo<T> maior = aux;
        while(aux != null) {
            if(aux.getInfo().doubleValue() > maior.getInfo().doubleValue()){ 
                maior = aux; 
            } 
            aux = aux.getProximo();
        }
        return maior;
    }
}
