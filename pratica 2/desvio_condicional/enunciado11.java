package pratica02.desvio_condicional;

import javax.swing.JOptionPane;

public class enunciado11 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(input);

        if (numero % 3 == 0 && numero % 7 == 0) {
            JOptionPane.showMessageDialog(null, "O número é divisível por 3 e por 7.");
        } else {
            JOptionPane.showMessageDialog(null, "O número não é divisível por 3 e por 7.");
        }
    }
}
