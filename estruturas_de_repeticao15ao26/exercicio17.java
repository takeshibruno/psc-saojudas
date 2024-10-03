package pratica03.estruturas_de_repeticao15ao26;
import javax.swing.JOptionPane;

public class exercicio17 {
    public static void main(String[] args) {
        final double POLEGADAS_PARA_CM = 2.54;

        JOptionPane.showMessageDialog(null, "Tabela de conversão de polegadas para centímetros:");

        for (int polegadas = 1; polegadas <= 20; polegadas++) {
            double centimetros = polegadas * POLEGADAS_PARA_CM;
            JOptionPane.showMessageDialog(null, polegadas + " polegada(s) = " + centimetros + " cm");
        }
    }
}


