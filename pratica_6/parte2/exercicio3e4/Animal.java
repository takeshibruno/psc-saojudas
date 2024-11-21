package pratica_6.parte2.exercicio3e4;

public class Animal {
    private String nome;
    private int numeroDePatas;

    public Animal() {
        this.nome = "Animal Desconhecido";
        this.numeroDePatas = 0;
    }

    public Animal(String nome) {
        this.nome = nome;
        this.numeroDePatas = 0;
    }

    public Animal(String nome, int numeroDePatas) {
        this.nome = nome;
        this.numeroDePatas = numeroDePatas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Número de patas: " + numeroDePatas);
    }
}

