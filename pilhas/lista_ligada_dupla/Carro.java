public class Carro{
    private String placa;
    private int anoFab;
    public Carro(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFab = anoFab;
    }
 
    public String getPlaca() {
        return placa;
    }
 
    public void setPlaca(String placa) {
        this.placa = placa;
    }
 
    public int getAnoFab() {
        return anoFab;
    }
 
    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }
 
    @Override
    public String toString() {
        return "placa=" + placa + ", anoFabricacao=" + anoFab;
    }
}