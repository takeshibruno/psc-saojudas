package pratica2;

import javax.swing.JOptionPane;

/*Crie um algoritmo que leia um número inteiro e o eleve ao quadrado usando o
método double Math.pow(base, expoente), onde base e expoente são números
reais;
*/

public class exercicio3 {
    public static void main(String[] args) {
        String base = JOptionPane.showInputDialog("Escreva um numéro para elevar ao quadrado: ");


        JOptionPane.showMessageDialog(null,"O resultado é: " + Math.pow(Double.parseDouble(base), 2));
    }

    
    
}
