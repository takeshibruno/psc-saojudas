package pratica03.estruturas_de_repeticao15ao26;
import javax.swing.JOptionPane;

public class exercicio18 {
    public static void main(String[] args) {
        double limiteInferior = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite inferior (em Celsius):"));
        double limiteSuperior = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite superior (em Celsius):"));
        double incremento = Double.parseDouble(JOptionPane.showInputDialog("Digite o incremento (em Celsius):"));

        JOptionPane.showMessageDialog(null, "Tabela de conversão de graus Celsius para Fahrenheit:");

        for (double celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (celsius * 9 / 5) + 32;
            JOptionPane.showMessageDialog(null, celsius + "°C = " + fahrenheit + "°F");
        }
    }
}

