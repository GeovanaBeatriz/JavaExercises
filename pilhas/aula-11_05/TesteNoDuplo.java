public class TesteNoDuplo {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(2000, "Feliz da Silva");
        NoDuplo<Pessoa> no1 = new NoDuplo<>(p);
        System.out.println(no1);
        Carro c = new Carro("ABC1234", 2012);
        NoDuplo<Carro> no2 = new NoDuplo<Carro>(c);
        System.out.println(no2);

        NoDuplo<Pessoa> no3 = new NoDuplo<>(new Pessoa(1999, "Alegre Souza"));
        System.out.println(no3);
    }
}
