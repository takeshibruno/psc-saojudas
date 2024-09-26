package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio10 {
    public static void main(String[] args) {
        int numero;
        do {
            String input = JOptionPane.showInputDialog("Digite um número (ou -999 para sair):");
            numero = Integer.parseInt(input);
            if (numero != -999) {
                System.out.print("Divisores de " + numero + ": ");
                for (int i = 1; i <= numero; i++) {
                    if (numero % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        } while (numero != -999);
    }
}


