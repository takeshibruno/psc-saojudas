package pratica02.desvio_condicional_extra;
import javax.swing.JOptionPane;

public class enunciado6 {
    public static void main(String[] args) {
        double maiorNumero = Double.NEGATIVE_INFINITY;
        double menorNumero = Double.POSITIVE_INFINITY;

        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Digite um número:");
            double numero = Double.parseDouble(input);

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        String mensagem = "O maior número é: " + maiorNumero + "\nO menor número é: " + menorNumero;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}