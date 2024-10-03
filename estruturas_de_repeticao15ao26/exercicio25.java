package pratica03.estruturas_de_repeticao15ao26;
import javax.swing.JOptionPane;

public class exercicio25 {
    public static void main(String[] args) {
        int[] votos = new int[5]; // Índices 1 a 4 representam os candidatos
        int totalEleitores = 0;

        while (true) {
            int voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do candidato (1 a 4, ou -1 para encerrar):"));

            if (voto == -1) {
                break;
            } else if (voto >= 1 && voto <= 4) {
                votos[voto]++;
                totalEleitores++;
            } else {
                JOptionPane.showMessageDialog(null, "Número de candidato inválido. Tente novamente.");
            }
        }

        for (int candidato = 1; candidato <= 4; candidato++) {
            double percentualVotos = (double) votos[candidato] / totalEleitores * 100;
            System.out.println("Candidato " + candidato + ": " + percentualVotos + "% dos votos");
        }

        System.out.println("Total de eleitores: " + totalEleitores);
    }
}


