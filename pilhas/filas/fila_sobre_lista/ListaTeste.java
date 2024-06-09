package fila_sobre_lista;

public class ListaTeste{
    public static void main(String [] args){

            Fila fila = new Fila();
            fila.enfileira(3);
            fila.enfileira(6);
            fila.enfileira(87);
            fila.enfileira(5);
            fila.enfileira(17);


            System.out.println(fila);

            System.out.println("Posição do elemento: " + fila.posicaoDeElemento(3));

    } 
}