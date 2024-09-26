package pratica02.desvio_condicional_extra;
import javax.swing.JOptionPane;

public class enunciado3 {
    public static void main(String[] args) {
        String verbo = JOptionPane.showInputDialog("Digite um verbo no infinitivo:");

        if (verbo.endsWith("ar")) {
            JOptionPane.showMessageDialog(null, "Verbo da 1ª conjugação.");
        } else if (verbo.endsWith("er")) {
            JOptionPane.showMessageDialog(null, "Verbo da 2ª conjugação.");
        } else if (verbo.endsWith("ir")) {
            JOptionPane.showMessageDialog(null, "Verbo da 3ª conjugação.");
        } else if (!verbo.endsWith("r")) {
            JOptionPane.showMessageDialog(null, "Não está no infinitivo.");
        } else {
            JOptionPane.showMessageDialog(null, "Provavelmente não é um verbo no infinitivo.");
        }
    }
}

