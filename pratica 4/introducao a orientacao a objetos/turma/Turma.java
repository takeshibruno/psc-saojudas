package turma;

public class Turma {
    private String nome;
    private String curso;
    private int quantidadeAlunos;
    private int serie;

    public Turma (String nome, String curso, int alunos, int serie){
        this.nome = nome;
        this.curso = curso;
        this.quantidadeAlunos = alunos;
        this.serie = serie;
    }

    public String getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public int getSerie() {
        return serie;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}
