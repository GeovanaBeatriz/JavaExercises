import java.util.Random;

public class NovaTeste{
    public static void main(String [] args){
        Fila f = new Fila();
        Random r = new Random();
        do{
        if(r.nextBoolean()){
            f.enfileira(r.nextInt(100));
        }
        else if(!f.estaVazia()){
            f.desenfileira();
        }
        System.out.println(f);
    } while(!f.estaVazia());
    } 
}