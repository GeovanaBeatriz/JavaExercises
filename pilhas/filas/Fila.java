public class Fila{
    private Pessoa[] dados;
    private int primeiro;
    private int ultimo;
    private int tamanho;

    public static final int CAP_MIN = 4;

    public Fila(){
        dados = new Pessoa[CAP_MIN];
        primeiro = 0;
        ultimo = -1;
        tamanho = 0;
    }

    public Fila(int capacidade){
        dados = new Pessoa[capacidade];
        primeiro = 0;
        ultimo = -1;
        tamanho = 0;
    }

    public Pessoa [] getDados(){
        return dados;
    }

    int proximaPosicao(int posicao){
        return (posicao + 1) % dados.length; //fila circular, ao chegar no fim da fila, volta ao inicio por causa do operador de módulo
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public boolean estaCheia(){
        return tamanho == dados.length;
    }

    public boolean enfileira(Pessoa p){
        if(!estaCheia()){
            ultimo = proximaPosicao(ultimo); //atualiza a ultima posição chamando o metodo para ir para a ultima posição da fila
            dados[ultimo] = p; // atribui a pessoa a ultima posição no vetor
            tamanho++; //incrementa a variavel tamanho para depois usar ela para testar se o vetor está cheio ou vazio.
            return true;
        }
        return false;
    }

    public Pessoa desenfileira(){
        if(estaVazia()) return null;
        Pessoa p = dados[primeiro]; // não precisa colocar, é só para retornar depois qual foi o valor apagado
        dados[primeiro] = null;
        primeiro = proximaPosicao(primeiro);
        tamanho--;
        return p; //retorna a referencia da Pessoa
    }

    @Override
    public String toString(){
        String s = "";
        if(estaVazia()){
            return "fila vazia";
        }
        int i = primeiro;
        do{
            s = s + dados[i] + " - ";
            i = proximaPosicao(i);
        } while(i != proximaPosicao(ultimo));
        return s;
    }

    public String toStringVetor(){
        String s = "";
        for(int i = 0; i < dados.length; i++){
            if(dados[i] ==  null){
                s+= " ____ ";
            }
            else{
                s += " " + dados[i].getAnoNascimento() + " ";
            }
        }
        return s;
    }

}