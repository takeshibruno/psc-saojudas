package produto;

public class Produto {
    private String nome;
    private double preço;
    private int quantidade;

    public Produto (String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nPreço: " + this.preço + "\nQuantidade: " + this.quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }   

    public double getPreço() {
        return preço;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
