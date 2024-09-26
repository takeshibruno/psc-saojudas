package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio15 {
    public static void main(String[] args) {
        int maiorNumero = Integer.MIN_VALUE;

        while (true) {
            String input = JOptionPane.showInputDialog("Digite um número inteiro (ou -9999 para sair):");
            int numero = Integer.parseInt(input);

            if (numero == -9999) {
                break;
            }

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maiorNumero);
    }
}

