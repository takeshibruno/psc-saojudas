package pratica1;
import javax.swing.JOptionPane;

public class exercicio6 {
    public static void main(String[] args) {
        String numero_completo = "";
        
        for (int i = 0; i < 4; i++){
            char numeral = JOptionPane.showInputDialog("Escreva UM numeral:").charAt(0);
            numero_completo += numeral;
        }

        JOptionPane.showMessageDialog(null,numero_completo);
        
    }
    
}
