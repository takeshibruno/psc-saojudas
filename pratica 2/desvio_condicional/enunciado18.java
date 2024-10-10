package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado18 {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        double menor = Math.min(numero1, numero2);
        double maior = Math.max(numero1, numero2);

        JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + menor + ", " + maior);
    }
}



