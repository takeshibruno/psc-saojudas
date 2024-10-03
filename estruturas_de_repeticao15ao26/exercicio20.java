package pratica03.estruturas_de_repeticao15ao26;
import javax.swing.JOptionPane;

public class exercicio20 {
    public static void main(String[] args) {
        int limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior:"));
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o incremento:"));

        for (int i = 0; i <= limiteSuperior; i += incremento) {
            System.out.print(i + " ");
        }
    }

}


