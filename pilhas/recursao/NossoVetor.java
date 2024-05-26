import java.util.Random;

public class NossoVetor {
    private int ultPos;
    private double[] dados;
    public NossoVetor (int capacidade) {
        ultPos = -1;
        dados = new double[capacidade];
    }
    //métodos de acesso
    public int getUltPos() {
        return ultPos;
    }
    public double[] getDados() {
        return dados;
    }
   
    @Override
    public String toString() {
        String s="";
        if (estaVazio())
            s = s + "vetor vazio";
        else 
            for (int i=0; i<=ultPos; i++) 
                s = s + String.format("%.0f ", dados[i]);
        return s + "\n";
    }
    public boolean estaCheio () {
        return ultPos == dados.length-1;
    }
    public boolean estaVazio (){
        return ultPos == -1;
    }
    private void redimensiona (int novaCapacidade) {
        double[] temp = new double[novaCapacidade];
        for (int i=0; i<=ultPos; i++) 
            temp[i] = dados[i];
        dados = temp;
    }
    public void adiciona (int e) {
        if (estaCheio()) redimensiona(dados.length * 2);
        dados[++ultPos] = e;
    } 
    public void adiciona (double e) {
        if (estaCheio()) redimensiona(dados.length * 2);
        dados[++ultPos] = e;
    } 
    public double remove () {
        if (estaVazio()) return -1;
        double aux = dados[ultPos--];
        if (dados.length >= 10 && ultPos <= dados.length/4) 
            redimensiona(dados.length / 2);
        return aux;
    }
    //método para inserir valores randômicos no vetor
    public void preencheVetor () {
        Random r = new Random();
        for (int i=0; i<dados.length; i++) {
            //adiciona(Math.random());
            //adiciona (r.nextDouble());
            adiciona(r.nextInt(dados.length*10) + 1);
        }
    }

    public void esvaziaVetor(){
        ultPos = -1;
    }

    public void bubbleSort(){
        for(int i = 1; i < dados.length; i++){
            for(int j = i - 1; j < dados.length-i; j++){
                if(dados[j] > dados[j+1]){
                    double temp = dados[j];
                    dados[j] = dados[j+1];
                    dados[j+1] = temp; 
                }
            }
        }
    }

    int partition(int start, int end){ //index começo = p, index fim = r
        double pivot = dados[end]; // O pivô é o elemento na posição 'r', ou seja, no fim do array
        int i = start-1; //ponteiro da direita
        for(int j = start; j <= end - 1; j++){ //j = ponteiro da esquerda
            if(dados[j] < pivot){ // Se o elemento atual é menor ao pivô
                i++;
                double temp = dados[i];
                dados[i] = dados[j];
                dados[j] = temp;
            }
        }    //assim que todos os elementos menores ao pivot estiverem na esquerda e os maiores na direita
             //coloca o pivot no seu local certo
            i++;
            double temp = dados[i];
            dados[i] = pivot;
            dados[end] = temp;
            return i;
    }

    public void quickSort(int start, int end){
        if(start < end){
        int pivot = partition(start, end); //descobre onde o pivo estará
        quickSort(start, pivot-1); //partição da esquerda (usa o -1 para não incluir o pivot, pois ele já está no lugar certo)
        quickSort(pivot+1, end); //partição da direita (usa o +1 para não incluir o pivot, pois ele já está no lugar certo)
        }
    }
    public void insertionSort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertionSort'");
    }
    public void selectionSort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectionSort'");
    }
    public String getUltimaPosicao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUltimaPosicao'");
    }
    public void insereEmPosicao(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereEmPosicao'");
    }
    public int contarOcorrencias(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contarOcorrencias'");
    }
    public void removeEmPosicao(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeEmPosicao'");
    }
    public void removeTodasOcorrencias(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeTodasOcorrencias'");
    }
    public String contagemElementos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contagemElementos'");
    }
    public String tamanho() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tamanho'");
    }
    public String maiorElemento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maiorElemento'");
    }
    public String somarElementos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'somarElementos'");
    }
    public String maiorElementoPosicao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maiorElementoPosicao'");
    }
}