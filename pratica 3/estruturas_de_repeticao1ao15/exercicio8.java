package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio8 {
    public static void main(String[] args) {
        // Inicializa uma variável para armazenar o produto
        long produto = 1;

        // Calcula o produto dos números de 120 a 300
        for (int i = 120; i <= 300; i++) {
            produto *= i;
        }

        // Exibe o resultado do produto
        JOptionPane.showMessageDialog(null, "Produto dos números de 120 a 300: " + produto);
    }
}


