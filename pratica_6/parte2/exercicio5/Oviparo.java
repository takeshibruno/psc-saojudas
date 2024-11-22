package pratica_6.parte2.exercicio5;

public class Oviparo {
    private String tipoDeOvo; 
    private int periodoDeIncubacao; 

    public Oviparo(String tipoDeOvo, int periodoDeIncubacao) {
        this.tipoDeOvo = tipoDeOvo;
        this.periodoDeIncubacao = periodoDeIncubacao;
    }

    public String getTipoDeOvo() {
        return tipoDeOvo;
    }

    public int getPeriodoDeIncubacao() {
        return periodoDeIncubacao;
    }

    public void exibirInformacoes() {
        System.out.println("Tipo de Ovo: " + tipoDeOvo);
        System.out.println("Período de Incubação: " + periodoDeIncubacao + " dias");
    }
}
