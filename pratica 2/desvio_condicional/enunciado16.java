package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado16 {
    public static void main(String[] args) {
        String inputNumero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double numero1 = Double.parseDouble(inputNumero1);

        String inputNumero2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double numero2 = Double.parseDouble(inputNumero2);

        String mensagem;
        if (numero1 == numero2) {
            mensagem = "Os números são iguais.";
        } else {
            mensagem = "Os números são diferentes.";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}


