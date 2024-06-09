public class TesteFila{
    public static void main(String[] args){
        Fila f = new Fila();
        System.out.println(f);

        Pessoa p2 = new Pessoa("Gil");
        Pessoa p3 = new Pessoa("Bia");
        Pessoa p4 = new Pessoa("Leo");
        
        f.enfileira(p2);
        System.out.println(f);

        System.out.println("\n" + f.desenfileira() + " saiu da fila.");
        System.out.println(f);
        f.enfileira(p3);
        f.enfileira(p4);
        System.out.println(f);

        f.enfileira(new Pessoa("Caio"));
        System.out.println(f);


    }
}