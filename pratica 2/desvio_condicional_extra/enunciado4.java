package pratica02.desvio_condicional_extra;
import javax.swing.JOptionPane;

public class enunciado4 {
    public static void main(String[] args) {
        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
        char primeiraLetra = nomeAluno.charAt(0);
        String divisao;

        if (primeiraLetra >= 'A' && primeiraLetra <= 'K') {
            divisao = "D1";
        } else if (primeiraLetra >= 'L' && primeiraLetra <= 'N') {
            divisao = "D2";
        } else {
            divisao = "D3";
        }

        JOptionPane.showMessageDialog(null, "O aluno está na divisão " + divisao + ".");
    }
}

