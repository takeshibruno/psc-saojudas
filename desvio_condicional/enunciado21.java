package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado21 {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        double maiorNumero = Math.max(Math.max(numero1, numero2), numero3);

        JOptionPane.showMessageDialog(null, "O maior número é: " + maiorNumero);
    }
}

