package pratica5;

public class Disciplina {
    private String nome;
    private boolean pratica;

    public Disciplina (String nome, boolean pratica){
        this.nome = nome;
        this.pratica = pratica;
    }

    public void getDados () {
        System.out.println("Nome: " + this.nome + "\nPratica: " + this.pratica);
    }

    public String getNome() {
        return nome;
    }

    public boolean getPratica() {
        return pratica;
    }   

}
