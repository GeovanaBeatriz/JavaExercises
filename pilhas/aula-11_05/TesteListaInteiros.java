public class TesteListaInteiros {
    public static void main(String[] args) {
        ListaDupla<Integer> ld = new ListaDupla<>();
        for (int i = 1; i<= 6; i++) {
            ld.insereFim(i);
            ld.insereInicio(i+2);
        }
        System.out.println(ld);
        if (ld.removePrimeiraOcorrencia(4)) 
            System.out.println(ld);
        else 
            System.out.println("elemento nao encontrado");
        if (ld.removePrimeiraOcorrencia(23))
            System.out.println(ld);
        else
            System.out.println("elemento nao encontrado");
    }
}
