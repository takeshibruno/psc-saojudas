package pratica02.desvio_condicional_extra;
import javax.swing.JOptionPane;

public class enunciado2 {
    public static void main(String[] args) {
        double lado1, lado2, lado3;

        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado do triângulo:"));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado do triângulo:"));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado do triângulo:"));

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "Triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "Triângulo isósceles.");
            } else {
                JOptionPane.showMessageDialog(null, "Triângulo escaleno.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os lados não formam um triângulo.");
        }
    }
}


