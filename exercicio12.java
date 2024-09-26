package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio12 {
    public static void main(String[] args) {
        int idade;
        int totalMenos21 = 0, totalMais50 = 0;

        do {
            String inputIdade = JOptionPane.showInputDialog("Digite a idade (ou um valor fora da faixa para sair):");
            idade = Integer.parseInt(inputIdade);

            if (idade >= 0 && idade <= 120) {
                if (idade < 21) {
                    totalMenos21++;
                } else if (idade > 50) {
                    totalMais50++;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Idade fora da faixa válida. Tente novamente.");
            }
        } while (idade >= 0 && idade <= 120);

        JOptionPane.showMessageDialog(null,
                "Total de pessoas com menos de 21 anos: " + totalMenos21 + "\nTotal de pessoas com mais de 50 anos: "
                        + totalMais50);
    }
}

