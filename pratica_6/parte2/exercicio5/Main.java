package pratica_6.parte2.exercicio5;

public class Main {
    public static void main(String[] args) {
        Ave galinha = new Ave("Casca dura", 21, "Curta e dura");
        Reptil tartaruga = new Reptil("Casca dura", 90, true);

        System.out.println("Informações da Galinha:");
        galinha.exibirInformacoes();

        System.out.println("\nInformações da Tartaruga:");
        tartaruga.exibirInformacoes();
    }
}

