package pratica03.estruturas_de_repeticao15ao26;
import javax.swing.JOptionPane;

public class exercicio23 {
    public static void main(String[] args) {
        int quantidadePares = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números pares desejada:"));

        for (int i = 1; i <= quantidadePares; i++) {
            System.out.print(2 * i + " ");
        }
    }
}


