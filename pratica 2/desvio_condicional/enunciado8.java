package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado8 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double num1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double num2 = Double.parseDouble(input2);

        double maior = Math.max(num1, num2);
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}
