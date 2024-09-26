package pratica2;

/*Criar um algoritmo que calcule e imprime a área de um triângulo;
 */

import javax.swing.*;

public class exercicio17 {
    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Escreva a base do triangulo: "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Escreva a altura do triangulo: "));

        int resultado = (base * altura) / 2;
        JOptionPane.showMessageDialog(null,"Area do triangulo: " + resultado);
    }
}
