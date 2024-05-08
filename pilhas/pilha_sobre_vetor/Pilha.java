package pilha_sobre_vetor;

public class Pilha {
    private int[] dados;
    private int topo;

    public static final int CAPACIDADE_MINIMA = 10;

    public Pilha(int capacidade){
        dados = new int[capacidade];
        topo = -1;
    }

    public Pilha(){
        this(CAPACIDADE_MINIMA);
    }

    public boolean estaVazia(){
        return topo == -1;
    }

    public boolean estaCheia(){
        return topo == dados.length-1;
    }

    public boolean empilha(int i){
        if(estaCheia()) return false;
        dados[++topo] = i;
        return true;
    }

    public int desempilha(){
        if(estaVazia()) return -1;
        int temp = dados[topo--];
        return temp;
    }
    int tamanho(){
        return topo + 1;
    }

    @Override
    public String toString(){
        if (estaVazia()) {
            return "Pilha vazia";
        }
        String s = "";
        for(int i = topo; i >= 0; i--){
            s = s + dados[i] + "\n";
        }
        s+= "--------------------";
        return s;
    }
}
