package pratica03.estruturas_de_repeticao1ao15;
import javax.swing.JOptionPane;

public class exercicio7 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0) {
                resultado.append(i).append(", ");
            }
        }

        String resultadoFinal = resultado.toString().trim();
        if (!resultadoFinal.isEmpty()) {
            resultadoFinal = resultadoFinal.substring(0, resultadoFinal.length() - 1);
        }

        JOptionPane.showMessageDialog(null, "Múltiplos de 5 no intervalo de 1 a 500:\n" + resultadoFinal);
    }
}

