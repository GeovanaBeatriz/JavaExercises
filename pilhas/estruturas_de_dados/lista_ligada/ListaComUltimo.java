public class ListaComUltimo extends Lista {
    private No ultimo;
    //construtor padrao

    @Override
    public void insereInicio(int i){
        No novo = new No(i);
        if(estaVazia()){
            ultimo = novo;
        }
        else{
            novo.setProximo(super.getPrimeiro());
        }
        super.setPrimeiro(novo);
    }
}
