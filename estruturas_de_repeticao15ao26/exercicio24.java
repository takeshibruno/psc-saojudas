package pratica03.estruturas_de_repeticao15ao26;
import javax.swing.JOptionPane;

public class exercicio24 {
    public static void main(String[] args) {
        double totalPago = 0;

        while (true) {
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da mercadoria (ou 0 para encerrar):"));

            if (preco == 0) {
                break;
            } else if (preco < 0) {
                JOptionPane.showMessageDialog(null, "Preço inválido. Digite novamente.");
                continue;
            }

            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada:"));
            totalPago += preco * quantidade;
        }

        JOptionPane.showMessageDialog(null, "Total a ser pago: R$" + totalPago);
    }
}

