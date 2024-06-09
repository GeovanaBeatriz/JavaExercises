package fila_sobre_lista;

public class Pessoa{
    private String nome;
    private int anoNascimento;

    public Pessoa(){ 
       
    }

    public Pessoa(String nome){ //um construtor padrão vindo da classe Object já existe
        setNome(nome);
    }

    public Pessoa(String nome, int anoNascimento){ 
        this(nome);
        setAnoNascimento(anoNascimento);
    }

    public Pessoa(int anoNascimento){
        setAnoNascimento(anoNascimento);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        if(anoNascimento < 2024){
        this.anoNascimento = anoNascimento;}
        else{
            anoNascimento = 1970;
        }

    }

    @Override
    public String toString(){
        return "Pessoa = [" + nome + ", " + anoNascimento + "]";
    }
}