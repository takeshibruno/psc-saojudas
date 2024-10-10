package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado24 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));
        double num4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número:"));
        double num5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quinto número:"));

        double maior = Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5);
        double menor = Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5);

        JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\nMenor número: " + menor);
    }
}

