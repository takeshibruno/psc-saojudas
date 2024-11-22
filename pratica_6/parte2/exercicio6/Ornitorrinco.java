package pratica_6.parte2.exercicio6;
import pratica_6.parte2.exercicio3e4.Mamifero;;

public class Ornitorrinco extends Mamifero implements Oviparo {
    private String tipoDeOvo;
    private int periodoDeIncubacao;

    public Ornitorrinco(String nome, String tipoDeOvo, int periodoDeIncubacao) {
        super(nome, 4);
        this.tipoDeOvo = tipoDeOvo;
        this.periodoDeIncubacao = periodoDeIncubacao;
    }

    @Override
    public String getTipoDeOvo() {
        return tipoDeOvo;
    }

    @Override
    public int getPeriodoDeIncubacao() {
        return periodoDeIncubacao;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Ovo: " + tipoDeOvo);
        System.out.println("Período de Incubação: " + periodoDeIncubacao + " dias");
    }

    public void produzirLeite() {
        System.out.println(getNome() + " está produzindo leite!");
    }
}
