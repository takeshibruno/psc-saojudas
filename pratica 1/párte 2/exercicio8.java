package pratica2;

import javax.swing.JOptionPane;

/*Entrar com um número e imprimir o logaritmo desse número na base 10;
*/

public class exercicio8 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Escreva um numero: ");

        mostraLog(Integer.parseInt(input));
    }

    static void mostraLog (int numero) {
        JOptionPane.showMessageDialog(null,"O valor do log na base 10 desse número é: " + Math.log10(numero));
    }
}
