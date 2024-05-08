public class Pessoa{
    private int anoNasc;
    private String nome;
    public Pessoa(int anoNasc, String nome){
        this.anoNasc = anoNasc;
        this.nome = nome;
    }
    public int getAnoNasc() {
        return anoNasc;
    }
 
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    @Override
    public String toString() {
        return "Pessoa [anoNascimento=" + anoNasc + ", nome=" + nome + "]";
    }
}