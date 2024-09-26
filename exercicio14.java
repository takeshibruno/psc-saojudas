package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio14 {
    public static void main(String[] args) {
        int contadorPrimos = 0;

        while (true) {
            String input = JOptionPane.showInputDialog("Digite um número inteiro positivo (ou um número não positivo para sair):");
            int numero = Integer.parseInt(input);

            if (numero <= 0) {
                break;
            }

            boolean ehPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                contadorPrimos++;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de números primos digitados: " + contadorPrimos);
    }
}
