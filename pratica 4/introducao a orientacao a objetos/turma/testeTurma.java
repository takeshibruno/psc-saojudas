package turma;

import javax.swing.JOptionPane;

public class testeTurma {
    public static void main(String[] args) {
        String nomeTurma = JOptionPane.showInputDialog("Insira o nome da Turma: ");
        String curso = JOptionPane.showInputDialog("Insira o curso da Turma: ");
        int quantidadeAlunos  = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alunos da Turma: "));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Insira a serie da Turma: "));

        Turma turma = new Turma(nomeTurma, curso, quantidadeAlunos, serie);

        serie = Integer.parseInt(JOptionPane.showInputDialog("Insira uma nova serie da Turma: "));
    }
}
