package pratica_6.parte2.exercicio3e4;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        cachorro.exibirInformacoes();
        cachorro.latir();

        System.out.println();

        Gato gato = new Gato("Mimi");
        gato.exibirInformacoes();
        gato.miar();

        System.out.println();

        Animal animal = new Animal("Peixe", 0);
        animal.exibirInformacoes();
    }
}

