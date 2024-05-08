public class Teste1 {
    
    public static void main(String[] args){

        int n = 5;
        NossoVetor v = new NossoVetor(n);
        System.out.println("Ultima posicao depois do construtor: " + v.getUltimaPosicao());
        System.out.println("dados depois do construtor: " + v);

        // v.setUltimaPosicao(10);
        // System.out.println("ultima posicao depois do set: " + v.getUltimaPosicao());
        // v.getDados()[v.getUltimaPosicao()] = 23;

        // System.out.println("Nosso vetor depois do set: " + v);

        //if(v.adiciona(100)){
        //    System.out.println("Elemento inserido com sucesso");
        //}
        //else{
        //    System.out.println("Vetor cheio");}
        
        


    }
}
