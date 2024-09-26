package pratica2;

/*Crie um algoritmo para calcular a área de um círculo, com base no seu raio
(Área = PI * raio * raio, onde PI = 3.14159). Use variáveis reais;
 */

import javax.swing.*;

public class exercicio14 {
    public static void main(String[] args) {
        int raio = Integer.parseInt(JOptionPane.showInputDialog("Escreva um o raio do seu circulo: "));
        final double PI = 3.14159;

        double area = PI * raio * raio;

        JOptionPane.showMessageDialog(null,"A área do círculo com raio " + raio + " é igual a " + area);
    }
}
