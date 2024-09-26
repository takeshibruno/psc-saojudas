package pratica2;

/*Entrar com um número e a base em que se deseja calcular o logaritmo do
número, calcular tal logaritmo e imprimir o resultado;
 */

import javax.swing.*;

public class exercicio9 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Escreva um numero: ");
        String input_base = JOptionPane.showInputDialog("Escreva uma base para calcular o log: ");

    }

    static void mostraLog (int numero, int base) {
        double resultado = Math.log(numero) / Math.log(base);
        JOptionPane.showMessageDialog(null,"O valor do log na base 10 desse número é: " + resultado);
    }
}
