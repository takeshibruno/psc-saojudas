package pratica02.desvio_condicional_extra;
import javax.swing.JOptionPane;

public class enunciado5 {
    public static void main(String[] args) {
        double num1, num2, num3;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        double maior = Math.max(Math.max(num1, num2), num3);
        double menor = Math.min(Math.min(num1, num2), num3);
        double intermediario = num1 + num2 + num3 - maior - menor;

        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nIntermediário: " + intermediario + "\nMenor: " + menor);
    }
}

