package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado10 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(input);

        if (numero % 5 == 0) {
            JOptionPane.showMessageDialog(null, "O número é divisível por 5.");
        } else {
            JOptionPane.showMessageDialog(null, "O número não é divisível por 5.");
        }
    }
}


