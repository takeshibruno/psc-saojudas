package carro;

public class Carro {
    private String placa;
    private String cor;

    public Carro (String placa, String cor) {
        this.cor = cor;
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
