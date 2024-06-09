public class Pilha {
    private No topo;

    public boolean estaVazia() {
        return topo == null;
    }

    public void empilha(char info) {
        No novo = new No(info);
        if (!estaVazia()) {
            novo.setProximo(topo);
        }
        topo = novo;
    }

    public char desempilha() {
        char temp = topo.getInfo();
        topo = topo.getProximo();
        return temp;
    }

    public char consultaTopo() {
        return topo.getInfo();
    }

    @Override
    public String toString() {
        String s = "";
        if (estaVazia()) {
            s += "pilha vazia";
        } else {
            No aux = topo;
            while (aux != null) {
                s += aux + "\n";
                aux = aux.getProximo();
            }
        }
        return s;
    }

    public void transfere(Pilha p2) {
        Pilha aux = new Pilha();
        while (!this.estaVazia()) {
            aux.empilha(this.desempilha());
        }
        while (!aux.estaVazia()) {
            p2.empilha(aux.desempilha());
        }
    }

    public static boolean ehPalindromo(String palavra) {
        Pilha pilha = new Pilha();

        // Empilha todos os caracteres da palavra
        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i)); // empilha caracter por caracter
        }

        // Desempilha os caracteres formando a palavra inversa
        String palavraInvertida = "";
        while (!pilha.estaVazia()) {
            palavraInvertida += pilha.desempilha();
        }

        // Verifica se a palavra original é igual à palavra invertida
        return palavra.equals(palavraInvertida);
    }
}

class No {
    private char info;
    private No proximo;

    public No(char info) {
        setInfo(info);
        setProximo(null);
    }

    public char getInfo() {
        return info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setInfo(char info) {
        this.info = info;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "|" + info + "|";
    }
}