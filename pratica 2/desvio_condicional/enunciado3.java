package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado3 {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        if (numero >= 0) {
            double raizQuadrada = Math.sqrt(numero);
            JOptionPane.showMessageDialog(null, "Raiz quadrada: " + raizQuadrada);
        } else {
            double quadrado = numero * numero;
            JOptionPane.showMessageDialog(null, "Quadrado: " + quadrado);
        }
    }
}



