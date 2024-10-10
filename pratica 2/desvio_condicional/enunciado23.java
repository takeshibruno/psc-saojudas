package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado23 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        double maior = Math.max(Math.max(num1, num2), num3);
        double menor = Math.min(Math.min(num1, num2), num3);
        double intermediario = num1 + num2 + num3 - maior - menor;

        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nIntermediário: " + intermediario + "\nMenor: " + menor);
    }
}

