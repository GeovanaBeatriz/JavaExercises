import java.util.Random;

public class Treinando{
    private int ultPos;
    private double[] dados;

    public Treinando(int capacidade){
        ultPos = -1;
        dados = new double[capacidade];
    }

    public double[] getDados(){
        return dados;
    }

    public int getUltPos(){
        return ultPos;
    }

    public boolean estaVazio(){
        if(ultPos == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean estaCheio(){
        if(ultPos == dados.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    public void redimensiona(int novaCapaciade){
        double[] novo = new double[novaCapaciade];
        for(int i = 0; i <= ultPos; i++){
            novo[i] = dados[i];
        }
        dados = novo;
    }

    public void adiciona(int e){
        if(estaCheio()){
            redimensiona(dados.length*2);
        }

        dados[++ultPos] = e;
    }

    public void preencheVetor(){
        Random r = new Random();
        for(int i = 0; i < dados.length; i++){
            adiciona(r.nextInt(dados.length*10)+1);
        }
    }

    public int remove(){
        if(estaVazio()){
            return -1;
        }
        else{
            int aux = (int) dados[ultPos--];
            if(dados.length >= 10 && ultPos <= dados.length/4){
                redimensiona(dados.length/2);
            }
            return aux;
        }
    }


}