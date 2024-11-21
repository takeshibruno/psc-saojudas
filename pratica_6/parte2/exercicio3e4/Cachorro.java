package pratica_6.parte2.exercicio3e4;

public class Cachorro extends Mamifero {

    public Cachorro(String nome) {
        super(nome, 4);
    }

    public void latir() {
        System.out.println(getNome() + " está latindo!");
    }
}

