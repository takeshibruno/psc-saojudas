package pratica2;

/*Ler dois números inteiros e imprimir dividendo, divisor, quociente e resto;
 */

import javax.swing.*;

public class exercicio15 {
    public static void main(String[] args) {
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Escreva um divisor: "));
        int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Escreva um dividendo: "));

        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;

        JOptionPane.showMessageDialog(null,"Dividendo: " + dividendo); System.out.println("Divisor: " + divisor);
        JOptionPane.showMessageDialog(null,"Quociente: " + quociente); System.out.println("Resto: " + resto);
    }
}
