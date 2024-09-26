package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado2 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        int soma = numero1 + numero2;

        if (soma <= 20) {
            soma -= 5;
        }

        JOptionPane.showMessageDialog(null, "Resultado da soma: " + soma);
    }
}




