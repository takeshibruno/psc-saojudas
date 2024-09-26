package pratica1;
import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args) {
         int peso = Integer.valueOf(JOptionPane.showInputDialog("Escreva um seu peso no formato real:"));
        JOptionPane.showMessageDialog(null,"O peso informado foi " + peso + " kg");
    }
    
}
