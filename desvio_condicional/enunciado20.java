package pratica02.desvio_condicional;

import javax.swing.JOptionPane;
public class enunciado20 {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        double menor = Math.min(numero1, numero2);
        double maior = Math.max(numero1, numero2);

        double quadradoMenor = menor * menor;
        double raizMaior = Math.sqrt(maior);

        JOptionPane.showMessageDialog(null, "Quadrado do menor número: " + quadradoMenor +
                "\nRaiz quadrada do maior número: " + raizMaior);
    }
}
