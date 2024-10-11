package produto;

import javax.swing.JOptionPane;

public class testeProduto {
    public static void main(String[] args) {
        String nomeProduto = JOptionPane.showInputDialog("Insira o nome do produto: ");
        double preçoProduto = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto: "));

        Produto produto = new Produto(nomeProduto, preçoProduto, quantidade);
        System.out.println(produto);
    }
}
