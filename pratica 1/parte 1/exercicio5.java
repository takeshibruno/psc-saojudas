package pratica1;
import javax.swing.JOptionPane;

public class exercicio5 {
    public static void main(String[] args) {
        String palavra = "";

        for (int i = 0; i < 10; i++){
            palavra += JOptionPane.showInputDialog("Escreva um caractere:");
        }

        JOptionPane.showMessageDialog(null,palavra);
    }
    
}
