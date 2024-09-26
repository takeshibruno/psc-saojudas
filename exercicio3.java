package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[] args) {
        int quantidadeNumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantos números deseja digitar?"));
        int soma = 0;

        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1)));
            soma += numero;
        }

        double media = (double) soma / quantidadeNumeros;
        JOptionPane.showMessageDialog(null, "Média dos números digitados: " + media);
    }
}
