package pratica_6.parte1;

public class CartaoDeCredito extends Pagamento {
    private String numeroDoCartao;

    public CartaoDeCredito (String nome, String cpf, double valorASerPago, String numeroCartao) {
        super(nome, cpf, valorASerPago);
        this.numeroDoCartao = numeroCartao;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero do Cartão: " + this.numeroDoCartao;
    }
}
