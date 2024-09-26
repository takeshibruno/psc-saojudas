package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio9 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        JOptionPane.showMessageDialog(null, "Números de 1 a 100:\n" +
                "Soma total: " + soma);
    }
}

