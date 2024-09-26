package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio6 {
    public static void main(String[] args) {
        double numero;

        while (true) {
            String input = JOptionPane.showInputDialog("Digite um número (ou -999 para sair):");
            numero = Double.parseDouble(input);

            if (numero == -999) {
                break;
            }

            double raizQuadrada = Math.sqrt(numero);
            double inverso = 1.0 / numero;

            JOptionPane.showMessageDialog(null, "Raiz quadrada: " + raizQuadrada + "\nInverso: " + inverso);
        }
    }
}

