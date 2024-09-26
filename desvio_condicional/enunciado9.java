package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado9 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(input);

        if (numero % 3 == 0) {
            JOptionPane.showMessageDialog(null, "O número é múltiplo de 3.");
        } else {
            JOptionPane.showMessageDialog(null, "O número não é múltiplo de 3.");
        }
    }
}

