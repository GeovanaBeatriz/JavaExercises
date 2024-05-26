import java.util.Random;

public class NovaTeste{
    public static void main(String [] args){
        Fila f = new Fila();
        Random r = new Random();
        //do{
        //if(r.nextBoolean()){
            f.enfileira(3);
            f.enfileira(6);
            f.enfileira(87);
            f.enfileira(5);
            f.enfileira(17);


            System.out.println(f);

            System.out.println("Posição do elemento: " + f.posicaoDeElemento(3));
        //}
        //else if(!f.estaVazia()){
            //f.desenfileira();
       // }
        //System.out.println(f);
    //} while(!f.estaVazia());


    } 
}