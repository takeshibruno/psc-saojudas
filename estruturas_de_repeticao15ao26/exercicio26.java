package pratica03.estruturas_de_repeticao15ao26;
import javax.swing.JOptionPane;

public class exercicio26 {
    public static void main(String[] args) {
        while (true) {
            double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            String menu = "Operações Disponíveis:\n" +
                    "1. Adição\n" +
                    "2. Subtração\n" +
                    "3. Multiplicação\n" +
                    "4. Divisão\n" +
                    "9. Sair do Programa\n" +
                    "Digite o número de ordem da opção desejada:";

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    double soma = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da adição: " + soma);
                    break;
                case 2:
                    double subtracao = numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da subtração: " + subtracao);
                    break;
                case 3:
                    double multiplicacao = numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " + multiplicacao);
                    break;
                case 4:
                    if (numero2 != 0) {
                        double divisao = numero1 / numero2;
                        JOptionPane.showMessageDialog(null, "Resultado da divisão: " + divisao);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
                    }
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa. Até mais!");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }
}

