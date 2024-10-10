package pratica2;

/*Crie um algoritmo que embaralhe mensagens fazendo o seguinte: leia três
frases, separe cada uma delas ao meio. Então junte nesta ordem: primeira metade
da segunda, segunda metade da terceira, segunda metade da segunda, primeira
metade da primeira, primeira metade da terceira, segunda metade da primeira.
Concatene então as três frases originais e imprima o resultado. Na linha de baixo,
escreva a frase embaralhada e compare o resultado;
 */

import javax.swing.*;

public class exercicio10 {
    public static void main(String[] args) {
        String frase1 = JOptionPane.showInputDialog("Digite a primeira frase:");
        String frase2 = JOptionPane.showInputDialog("Digite a segunda frase:");
        String frase3 = JOptionPane.showInputDialog("Digite a terceira frase:");

        String fraseEmbaralhada = separaFrase(frase1, frase2, frase3);
        JOptionPane.showMessageDialog(null,"Frase embaralhada: " + fraseEmbaralhada);
    }

    static String separaFrase (String frase1, String frase2, String frase3) {
        int meio1 = frase1.length() / 2;
        int meio2 = frase2.length() / 2;
        int meio3 = frase3.length() / 2;

        String fraseEmbaralhada = frase2.substring(0, meio2) +
                frase3.substring(meio3) +
                frase2.substring(meio2) +
                frase1.substring(0, meio1) +
                frase1.substring(meio1) +
                frase3.substring(0, meio3);

        return fraseEmbaralhada;
    }
}
