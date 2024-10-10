package pratica03.estruturas_de_repeticao15ao26;
import javax.swing.JOptionPane;

public class exercicio21 {
    public static void main(String[] args) {
        int quantidadePessoas = 20;

        for (int i = 0; i < quantidadePessoas; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nome + ":"));
            char sexo = JOptionPane.showInputDialog("Digite o sexo de " + nome + " (M/F):").charAt(0);

            if (sexo == 'M' && idade > 21) {
                System.out.println("Nome: " + nome);
            }
        }
    }

}

