package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado5 {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        if (numero >= 20 && numero <= 90) {
            JOptionPane.showMessageDialog(null, "O número está compreendido entre 20 e 90.");
        } else {
            JOptionPane.showMessageDialog(null, "O número não está compreendido entre 20 e 90.");
        }
    }
}



