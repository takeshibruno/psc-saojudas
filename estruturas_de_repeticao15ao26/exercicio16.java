package pratica03.estruturas_de_repeticao15ao26;
import javax.swing.JOptionPane;

public class exercicio16 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        int primeiro = 0;
        int segundo = 1;

        JOptionPane.showMessageDialog(null, "Sequência de Fibonacci até " + numero + ":");
        JOptionPane.showMessageDialog(null, primeiro); //

        while (segundo <= numero) {
            JOptionPane.showMessageDialog(null, segundo);
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}


