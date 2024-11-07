package pratica_6.parte1;

public class Cheque extends Pagamento {
    private String numeroDoCheque;

    public Cheque (String nome, String cpf, double valorPagar, String numeroCheque){ 
        super(nome, cpf, valorPagar);
        this.numeroDoCheque = numeroCheque;
    }

    public String getNumeroDoCheque() {
        return numeroDoCheque;
    }

    public void setNumeroDoCheque(String numeroDoCheque) {
        this.numeroDoCheque = numeroDoCheque;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero do Cheque: " + this.numeroDoCheque;
    }
}
