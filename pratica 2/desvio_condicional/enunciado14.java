package pratica02.desvio_condicional;
import javax.swing.JOptionPane;


public class enunciado14 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro de 4 casas:");
        int numero = Integer.parseInt(input);

        int unidadesMilhar = (numero / 1000) % 10;
        int centenas = (numero / 100) % 10;

        int numeroFormado = unidadesMilhar * 10 + centenas;
        boolean multiploDeQuatro = numeroFormado % 4 == 0;

        String mensagem = multiploDeQuatro
                ? "O número formado pelas unidades de milhar e centenas é múltiplo de quatro."
                : "O número formado pelas unidades de milhar e centenas não é múltiplo de quatro.";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

