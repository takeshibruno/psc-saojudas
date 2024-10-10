package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args) {
        int numero;
        int contador = 0;

        while (true) {
            String input = JOptionPane.showInputDialog("Digite um número (ou 0 para sair):");
            numero = Integer.parseInt(input);

            if (numero == 0) {
                break;
            }

            if (numero >= 100 && numero <= 200) {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "Foram digitados " + contador + " números entre 100 e 200.");
    }
}

