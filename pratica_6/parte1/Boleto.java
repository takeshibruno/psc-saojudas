package pratica_6.parte1;

public class Boleto extends Pagamento {
    private String numeroDoBoleto;
    private int dia;
    private int mes;
    private int ano;

    public Boleto (String nome, String cpf, double valorPagar, String numeroBoleto, int dia, int mes, int ano){
        super(nome, cpf, valorPagar);
        this.numeroDoBoleto = numeroBoleto;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getNumeroDoBoleto() {
        return numeroDoBoleto;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setNumeroDoBoleto(String numeroDoBoleto) {
        this.numeroDoBoleto = numeroDoBoleto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero do Boleto: " + this.numeroDoBoleto + "\nData de Vencimento: " + this.dia + "/" + this.mes + "/" + this.ano;
    }
}
