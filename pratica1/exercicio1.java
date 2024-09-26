package pratica1;
import javax.swing.JOptionPane;

public class exercicio1 {
    public static void main(String[] args) {
    
        //lendo os dados
        String palavra_um = JOptionPane.showInputDialog("Escreva uma palavra:");
        String palavra_dois = JOptionPane.showInputDialog("Escreva outra palavra:");
        String palavra_tres = JOptionPane.showInputDialog("Escreva outra palavra:");

        mostraPalavraInvertida(palavra_um);
        mostraPalavraInvertida(palavra_dois);
        mostraPalavraInvertida(palavra_tres);
    }

    public static void mostraPalavraInvertida (String palavra){
        int tamanho_palavra = (palavra.length() - 1);

        for (int i = tamanho_palavra; i >= 0; i--){
            JOptionPane.showMessageDialog(null,palavra.charAt(i) + " ");
        }
    }
}