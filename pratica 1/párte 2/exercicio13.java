package pratica2;

/*Escrever um algoritmo que leia três números reais (a, b e c), calcule e escreva o
resultado da expressão x = 2 * ( ( a – c ) / 8 ) – b * 5;
 */

import javax.swing.*;

public class exercicio13 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva outro numero: "));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Escreva outr numero: "));

        int resultado = 2 * ( (numero1 - numero3) / 8) - numero2 * 5;
        System.out.println("Resultado de x = 2 * ( ( a – c ) / 8 ) – b * 5  --> " + resultado);
    }
}
