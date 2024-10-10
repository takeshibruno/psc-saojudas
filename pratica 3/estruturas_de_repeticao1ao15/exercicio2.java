package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 200; i += 2) {
            JOptionPane.showMessageDialog(null, "Número par: " + i);
        }
    }
}

