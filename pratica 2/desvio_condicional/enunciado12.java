package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado12 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(input);

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "O número é divisível por 10.");
        } else if (numero % 5 == 0) {
            JOptionPane.showMessageDialog(null, "O número é divisível por 5.");
        } else if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é divisível por 2.");
        } else {
            JOptionPane.showMessageDialog(null, "O número não é divisível por 10, 5 ou 2.");
        }
    }
}


