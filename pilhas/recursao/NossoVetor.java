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

    int partition(int p, int r){
        double x = dados[r];
        int i = p-1;
        for(int j = p; j < r; j++){
            if(dados[j] <= p){
                i++;
                double temp = dados[i];
                dados[i] = dados[j];
                dados[j] = temp;
            }
        }    
            i++;
            double temp = dados[i];
            dados[i] = x;
            dados[r] = temp;
            return i;
    }

    public void quickSort(int p, int r){
        if(p < r){
        int q = partition(p, r);
        quickSort(p, q-1);
        quickSort(q+1, r);
        }
    }
}