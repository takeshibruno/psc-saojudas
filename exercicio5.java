package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio5 {
    public static void main(String[] args) {
        String nome;

        while (true) {
            nome = JOptionPane.showInputDialog("Digite um nome (ou 'FIM' para sair):");

            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
        }
    }
}
