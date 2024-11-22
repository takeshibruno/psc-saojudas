package pratica_6.parte2.exercicio5;

public class Reptil extends Oviparo {
    private boolean temEscamas;

    public Reptil(String tipoDeOvo, int periodoDeIncubacao, boolean temEscamas) {
        super(tipoDeOvo, periodoDeIncubacao);
        this.temEscamas = temEscamas;
    }

    public boolean temEscamas() {
        return temEscamas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tem Escamas: " + (temEscamas ? "Sim" : "Não"));
    }
}

