package pratica2;

import javax.swing.*;

/*Entre com uma data em uma variável do tipo String no formato dd/mm/aa e
imprimir dia, mês e ano separados.
 */

public class exercicio12 {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Escreva um numero para o dia: ");
        String mes = JOptionPane.showInputDialog("Escreva um numero para o mes: ");
        String ano = JOptionPane.showInputDialog("Escreva um numero para o ano: ");

        imprimeData(dia,mes,ano);
    }

    static void imprimeData (String dia, String mes, String ano){
        JOptionPane.showMessageDialog(null,"Data: " + dia + "/" + mes + "/" + ano);
    }
}
