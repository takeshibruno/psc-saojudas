package pratica1;
import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {
        //lendo os dados
        String numero_input = JOptionPane.showInputDialog("Escreva um número:");
        int numero = Integer.valueOf(numero_input);

        JOptionPane.showMessageDialog(null,"O valor do número digitado é: " + numero);
    }
}
