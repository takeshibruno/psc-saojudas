package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado22 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        double maior = Math.max(Math.max(num1, num2), num3);

        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}


