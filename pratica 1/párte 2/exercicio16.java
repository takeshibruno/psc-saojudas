package pratica2;

/*Entrar com um número e imprimir o número, seu quadrado e sua raiz quadrada;
 */

import javax.swing.*;

public class exercicio16 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero: "));

        double quadrado = numero * numero;

        double raizQuadrada = Math.sqrt(numero);

        JOptionPane.showMessageDialog(null,"Número: " + numero); System.out.println("Quadrado: " + quadrado);
        JOptionPane.showMessageDialog(null,"Raiz Quadrada: " + raizQuadrada);
    }
}
