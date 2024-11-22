package pratica_6.parte2.exercicio5;

public class Ave extends Oviparo {
    private String tipoDePena;

    public Ave(String tipoDeOvo, int periodoDeIncubacao, String tipoDePena) {
        super(tipoDeOvo, periodoDeIncubacao);
        this.tipoDePena = tipoDePena;
    }

    public String getTipoDePena() {
        return tipoDePena;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Pena: " + tipoDePena);
    }
}


