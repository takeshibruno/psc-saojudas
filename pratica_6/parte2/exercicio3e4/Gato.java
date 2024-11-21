package pratica_6.parte2.exercicio3e4;

public class Gato extends Mamifero {

    public Gato(String nome) {
        super(nome, 4);
    }
    
    public void miar() {
        System.out.println(getNome() + " está miando!");
    }
}

