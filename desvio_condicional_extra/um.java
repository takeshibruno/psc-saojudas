package pratica02.desvio_condicional_extra;
import javax.swing.JOptionPane;

public class um {
    public static void main(String[] args) {
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado:"));
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado:"));
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado:"));

        boolean condicao1 = (lado1 + lado2) > lado3;
        boolean condicao2 = (lado1 + lado3) > lado2;
        boolean condicao3 = (lado2 + lado3) > lado1;

        if (condicao1 && condicao2 && condicao3) {
            JOptionPane.showMessageDialog(null, "Esses lados podem formar um triângulo!");
        } else {
            JOptionPane.showMessageDialog(null, "Esses lados não podem formar um triângulo.");
        }
    }
}




