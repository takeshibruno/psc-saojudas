package pratica2;

/*Entre com uma data em uma variável do tipo inteiro no formato ddmmaa e
imprimir dia, mês e ano separados;
 */

import javax.swing.*;

public class exericico11 {
    public static void main(String[] args) {
        int dia = Integer.valueOf(JOptionPane.showInputDialog("Escreva um numero para o dia: "));
        int mes = Integer.valueOf(JOptionPane.showInputDialog("Escreva um numero para o mes: "));
        int ano = Integer.valueOf(JOptionPane.showInputDialog("Escreva um numero para o ano: "));

        imprimeData(dia,mes,ano);
    }

    static void imprimeData (int dia, int mes, int ano){
        JOptionPane.showMessageDialog(null,"Data: " + dia + "/" + mes + "/" + ano);
    }
}
