public class Carro {
    private String placa;
    private int anoFab;
    public Carro(String placa, int anoFab) {
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
        return "placa=" + placa + ", anoFab=" + anoFab;
    }
    @Override
    public boolean equals (Object object) {
        if (this == object) {
            System.out.println("o mesmo objeto");
            return true;
        }
        if (object instanceof Carro) {
            System.out.println("comparando carro com carro");
            Carro carro = (Carro) object;
            if (this.placa == carro.placa) {
                System.out.println("placas iguais");
                return true;
            }
            else 
                System.out.println("placas diferentes");
        }
        System.out.println("objeto comparado nao e carro ou a placa era diferente");
        return false;
    }
}





