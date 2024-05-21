public class TesteEquals {
    public static void main(String[] args) {
        Carro c1 = new Carro("abc", 123);
        Carro c2 = new Carro("xyz", 456);
        Carro c3 = new Carro("abc", 789);
        System.out.println("teste c1 com c1");
        if (c1.equals(c1)) {          
        }
        System.out.println("teste c1 com c2");
        if (c1.equals(c2)) {
        }
        System.out.println("teste c1 com c3");
        if (c1.equals(c3)) {
        }
        System.out.println("teste carros com pessoas");
        if (c1.equals(new Pessoa(2000, "abc"))) {
            
        }
    }
}
