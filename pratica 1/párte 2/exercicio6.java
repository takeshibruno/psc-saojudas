package pratica2;

import javax.swing.JOptionPane;

/*Entrar com um número inteiro de 3 casas decimais e imprimir o algarismo da casa
das dezenas;
*/

public class exercicio6 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Escreva um numero com 3 casas decimais após a virgula: ");
        
        mostraSegundo(input);
    }

    public static void mostraSegundo(String input) {
        JOptionPane.showMessageDialog(null,input.charAt(input.indexOf('.') + 2));
    }
}
