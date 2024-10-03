package pratica03.estruturas_de_repeticao15ao26;
import javax.swing.JOptionPane;

public class exercicio22 {
    public static void main(String[] args) {
        int limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior:"));

        for (int i = 1; i < limiteSuperior; i += 2) {
            System.out.print(i + " ");
        }
    }
}


