package disciplina;

public class Disciplina {
    private String nome;
    private String professor;
    private int semestre;
    private boolean ofertada;
    
    public Disciplina (String nome, String professor, int semestre, boolean ofertada){ 
        this.nome = nome;
        this.professor = professor;
        this.semestre = semestre;
        this.ofertada = ofertada;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nProfessor: " + this.professor + "\nSemestre: " + this.semestre + "\nOfertada? " + this.ofertada;
    }
}
