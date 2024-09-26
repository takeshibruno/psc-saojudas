package pratica2;

import javax.swing.JOptionPane;

/*Crie um algoritmo para calcular a área de um retângulo, com base nas medidas de
sua base e de sua altura;
*/

public class exercicio2 {
    public static void main(String[] args) {
        String base = JOptionPane.showInputDialog("Escreva a medida da base do triângulo:");
        String altura = JOptionPane.showInputDialog("Escreva a meidade da altura do triângulo:");

        calculaAreaTriangulo(Integer.parseInt(base),Integer.parseInt(altura));
    }

    public static void calculaAreaTriangulo (int base, int altura) {
        int resultado = (base * altura) / 2;

        JOptionPane.showMessageDialog(null,"A área do triangulo é: " + resultado);
    }
}
