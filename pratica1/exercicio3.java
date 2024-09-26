package pratica1;
import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[] args) {

        int dia = Integer.valueOf(JOptionPane.showInputDialog("Escreva um número que representa o dia:"));
        int mes = Integer.valueOf(JOptionPane.showInputDialog("Escreva um número que representa o mes:"));
        int ano = Integer.valueOf(JOptionPane.showInputDialog("Escreva um número que representa o ano:"));

        JOptionPane.showMessageDialog(null,"Data: " + dia + "/" + mes + "/" + ano);
    }
}
