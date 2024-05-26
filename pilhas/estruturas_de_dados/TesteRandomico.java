public class TesteRandomico {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        v.preencheVetor();
        System.out.println(v);

        NossoVetor novo = new NossoVetor(7);
        novo.preencheVetor();
        System.out.println(novo);
        novo.insereEmPosicao(12, 2);
        novo.insereEmPosicao(12, 5);
        System.out.println(novo);

        int ocorrencias = novo.contarOcorrencias(12);
        System.out.println("O elemento 12 aparece " + ocorrencias + " vezes no vetor");

        //System.out.println("Antes de retirar o elemento: " +  novo);
        //novo.removeEmPosicao(2);
        //System.out.println("Após remoção do elemento: " + novo);

        System.out.println("Antes de retirar o elemento: " +  novo);
        novo.removeTodasOcorrencias(12);
        System.out.println("Após remoção do elemento: " + novo);

        System.out.println("Contagem elementos: " + novo.tamanho());

        System.out.println("Maior elemento: " + novo.maiorElemento());

        System.out.println("Posicao do maior elemento: " + novo.maiorElementoPosicao());

        System.out.println("Somar elementos: " + novo.somarElementos());

        novo.esvaziarVetor();
        System.out.println(novo);
        
    }


}
