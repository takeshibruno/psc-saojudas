package pratica03.estruturas_de_repeticao15ao26;
import javax.swing.JOptionPane;

public class exercicio19 {
    public static void main(String[] args) {
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
    long fatorial = 1;

    for (int i = 1; i <= numero; i++) {
        fatorial *= i;
    }

    JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);
}
}


