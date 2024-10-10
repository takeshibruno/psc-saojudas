package pratica02.desvio_condicional;

import javax.swing.JOptionPane;

public class enunciado15 {
    public static void main(String[] args) {
        String inputAnoNascimento = JOptionPane.showInputDialog("Digite o ano de nascimento:");
        int anoNascimento = Integer.parseInt(inputAnoNascimento);

        String inputAnoAtual = JOptionPane.showInputDialog("Digite o ano atual:");
        int anoAtual = Integer.parseInt(inputAnoAtual);

        if (anoNascimento <= 0 || anoNascimento > anoAtual) {
            JOptionPane.showMessageDialog(null, "Ano de nascimento inválido.");
        } else {
            int idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "A idade da pessoa é: " + idade + " anos.");
        }
    }
}


