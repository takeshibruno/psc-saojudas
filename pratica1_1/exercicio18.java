package pratica2;

/*Criar um algoritmo que calcule e imprime a área de um losango.
 */

import javax.swing.*;

public class exercicio18 {
    public static void main(String[] args) {
        int diagonalMaior = Integer.parseInt(JOptionPane.showInputDialog("Escreva a diagonal maior: "));
        int diagonalMenor = Integer.parseInt(JOptionPane.showInputDialog("Escreva a diagonal menor: "));

        double area = (diagonalMaior * diagonalMenor) / 2;

        JOptionPane.showMessageDialog(null,"A área do losango é: " + area);
    }
}
