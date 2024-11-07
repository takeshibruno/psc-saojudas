package pratica_6.parte1;

public class Pagamento {
    private String nomeDoPagador;
    private String cpf;
    private double valorASerPago;

    public Pagamento (String nome, String cpf, double valorPagar) {
        this.nomeDoPagador = nome;
        this.cpf = cpf;
        this.valorASerPago = valorPagar;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeDoPagador() {
        return nomeDoPagador;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNomeDoPagador(String nomeDoPagador) {
        this.nomeDoPagador = nomeDoPagador;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nomeDoPagador + "\nCpf: " + this.cpf + "\nValor a ser Pago: " + this.valorASerPago;
    }
}
