package pratica2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/*Crie um algoritmo para calcular o número de dias aproximado que você viveu,
com base em sua idade;
*/

public class exercicio1 {
    public static void main(String[] args) {
         String idade = JOptionPane.showInputDialog("Escreva sua idade:");  
         int dias_bissexto = (Integer.parseInt(idade) / 4);
         int dias_vividos = (Integer.parseInt(idade) * 365) + dias_bissexto;

        JOptionPane.showMessageDialog(null,"A quantidade de dias vividos aproximadamente é: " + dias_vividos);

    }

    public static void calculaDias () { 
        String data_nascimento = JOptionPane.showInputDialog("Escreva seu aniversário:");
        LocalDate aniversario = LocalDate.parse(data_nascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        long dias_vividos = ChronoUnit.DAYS.between(aniversario, LocalDate.now());

        JOptionPane.showMessageDialog(null,"A quantidade de dias vividos aproximadamente é: " + dias_vividos);
    }
}
