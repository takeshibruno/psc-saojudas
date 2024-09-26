package pratica02.desvio_condicional;

import javax.swing.*;

public class um {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
        int valor1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo valor:");
        int valor2 = Integer.parseInt(input2);

        int resultado = valor1 + valor2;

        if (resultado > 10) {
            JOptionPane.showMessageDialog(null, "A soma é: " + resultado);
        }
    }
}