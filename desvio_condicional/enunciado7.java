package pratica02.desvio_condicional;
import javax.swing.JOptionPane;

public class enunciado7 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
        String sexo = JOptionPane.showInputDialog("Digite o sexo (F ou M):");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));

        if (sexo.equalsIgnoreCase("F") && idade < 25) {
            JOptionPane.showMessageDialog(null, nome + " ACEITA.");
        } else {
            JOptionPane.showMessageDialog(null, nome + " NÃO ACEITA.");
        }
    }
}
