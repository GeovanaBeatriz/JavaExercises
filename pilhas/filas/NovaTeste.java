import java.util.Random;

public class NovaTeste{
    public static void main(String [] args){
        Fila f = new Fila();
        Random r = new Random();
        do{
        if(r.nextBoolean()){
            f.enfileira(new Pessoa(r.nextInt(1000) + 1001, null));
        }
        else{
            f.desenfileira();
        }
        System.out.println(f);
        System.out.println(f.toStringVetor());
    } while(!f.estaVazia());
    } 
}