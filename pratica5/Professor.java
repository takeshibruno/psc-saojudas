public class Professor {
    private String nome;
    private int idade;

    public Professor (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void getDados () {
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade);
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nIdade: " + this.idade;
    }
    
}