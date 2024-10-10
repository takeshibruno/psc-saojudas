package pratica2;

import javax.swing.JOptionPane;

/*Entrar com um ângulo em graus e imprimir: seno, cosseno, tangente, secante,
cossecante e cotangente;
*/

public class exercicio7 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Escreva um ângulo: ");
        Double numero = Double.parseDouble(input);

        mostraSeno(numero);
        mostraCosseno(numero);
        mostraTangente(numero);
        sec(numero);
        cosec(numero);
        cotan(numero);
    }

    static void mostraSeno (double angulo) {
        JOptionPane.showMessageDialog(null,"O seno é: " + Math.sin(angulo));
    }
    
    static void mostraCosseno (double angulo) {
        JOptionPane.showMessageDialog(null,"O cosseno é: " + Math.cos(angulo));
        
    }

    static void mostraTangente (double angulo) {
        JOptionPane.showMessageDialog(null,"A tangente é: " + Math.tan(angulo));
    }

    static void sec(double angulo) {
        double resultado = 1.0 / Math.sin(angulo);
        JOptionPane.showMessageDialog(null,"A secante é: " + resultado);
    }
    
    static void cosec(double angulo) {
        double resultado = 1.0 / Math.cos(angulo);
        JOptionPane.showMessageDialog(null,"A cossecante é: " + resultado);
    }

    static void cotan(double angulo) {
        double resultado = 1.0 / Math.tan(angulo);
        JOptionPane.showMessageDialog(null,"A cotangente é: " + resultado);
    }
}
