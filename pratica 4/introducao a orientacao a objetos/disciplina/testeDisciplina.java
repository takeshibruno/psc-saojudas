package disciplina;

import javax.swing.JOptionPane;

public class testeDisciplina {
    public static void main(String[] args) {
        String nomeProduto = JOptionPane.showInputDialog("Insira o nome da Disciplina: ");
        String professor = JOptionPane.showInputDialog("Insira o nome do professor");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do semestre: "));
        boolean ofertada = false;

        char input = JOptionPane.showInputDialog("Essa disciplina é ofertada? Insira V ou F").charAt(0);
        if (input == 'V' || input == 'v') {
            ofertada = true;
        } else if (input == 'F'  || input == 'f'){ 
            ofertada = false;
        } 

        Disciplina disciplina = new Disciplina(nomeProduto, professor, semestre, ofertada);
        System.out.println(disciplina);


    }
    
}
