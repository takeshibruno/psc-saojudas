package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado13 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro de 3 casas:");
        int numero = Integer.parseInt(input);

        int dezenas = (numero / 10) % 10;

        if (dezenas % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O algarismo das dezenas é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O algarismo das dezenas é ímpar.");
        }
    }
}

