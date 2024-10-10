package carro;

import javax.swing.JOptionPane;

public class executar {
    public static void main(String[] args) {
        Carro carro1 = new Carro ("ABCD123", "Vermelho");
        Carro carro2 = new Carro ("EFGHIJ", "Preto");

        String cor = JOptionPane.showInputDialog("Insira uma cor nova pro seu carro: ");
        carro1.setCor(cor);

        String cor2 = JOptionPane.showInputDialog("Insira uma cor nova pro seu carro: ");
        carro2.setCor(cor2);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getPlaca());

        System.out.println(carro2.getCor());
        System.out.println(carro2.getPlaca());
    }
}
