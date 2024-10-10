package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado6 {
    public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Digite um número:");
    double numero = Double.parseDouble(input);

    if (numero > 20) {
        JOptionPane.showMessageDialog(null, "O número é maior do que 20.");
    } else if (numero == 20) {
        JOptionPane.showMessageDialog(null, "O número é igual a 20.");
    } else {
        JOptionPane.showMessageDialog(null, "O número é menor do que 20.");
    }
}
}



