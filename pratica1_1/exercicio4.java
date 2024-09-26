package pratica2;

import javax.swing.JOptionPane;

/*Crie um algoritmo que leia três Strings por meio do JOptionPane e escreva a soma
do comprimento destas Strings;
*/

public class exercicio4 {
    public static void main(String[] args) {
        String input_um = JOptionPane.showInputDialog("Escreva um texto: ");
        String input_dois = JOptionPane.showInputDialog("Escreva outro texto: ");
        String input_tres = JOptionPane.showInputDialog("Escreva outro texto: ");

        int resultado = input_um.length() + input_dois.length() + input_tres.length();

        JOptionPane.showMessageDialog(null,"A soma do comprimento dos três textos é: " + resultado);
    }
}
