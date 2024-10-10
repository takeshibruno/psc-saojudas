package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado4 {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        double menor, meio, maior;
        if (numero1 < numero2) {
            if (numero1 < numero3) {
                menor = numero1;
                if (numero2 < numero3) {
                    meio = numero2;
                    maior = numero3;
                } else {
                    meio = numero3;
                    maior = numero2;
                }
            } else {
                menor = numero3;
                meio = numero1;
                maior = numero2;
            }
        } else {
            if (numero2 < numero3) {
                menor = numero2;
                if (numero1 < numero3) {
                    meio = numero1;
                    maior = numero3;
                } else {
                    meio = numero3;
                    maior = numero1;
                }
            } else {
                menor = numero3;
                meio = numero2;
                maior = numero1;
            }
        }

        String resultado = "Números em ordem crescente: " + menor + ", " + meio + ", " + maior;
        JOptionPane.showMessageDialog(null, resultado);
    }
}





