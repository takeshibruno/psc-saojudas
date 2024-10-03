package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio13 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro positivo:");
        int numero = Integer.parseInt(input);

        if (numero <= 1) {
            JOptionPane.showMessageDialog(null, "O número não é primo.");
        } else {
            boolean ehPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                JOptionPane.showMessageDialog(null, "O número é primo.");
            } else {
                JOptionPane.showMessageDialog(null, "O número não é primo.");
            }
        }
    }
}

