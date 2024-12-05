package com.company;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {

        criandoFrame();

    }

    public static void criandoFrame() {
        JFrame frame = new JFrame("Cadastro na Barbearia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new BorderLayout());

        criandoPanels(frame);

        frame.setVisible(true);
    }

    public static void criandoPanels(JFrame frame) {
        JPanel imagePanel = new JPanel();
        imagePanel.setPreferredSize(new Dimension(300, 400)); // Define um tamanho maior para o painel da imagem
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\bruno\\OneDrive\\Imagens\\barbearia.jpg"); // Substitua pelo caminho da sua imagem
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH); // Aumentar o tamanho da imagem
        JLabel imageLabel = new JLabel(new ImageIcon(image));
        imagePanel.add(imageLabel);

        JLabel texto = new JLabel("BEM VINDO A BASE DE DADOS DA BARBEARIA:");
        imagePanel.add(texto, BorderLayout.SOUTH);
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 2, 10, 10)); // Layout em grade para os campos
        formPanel.setPreferredSize(new Dimension(500, 400)); // Ajusta o tamanho do painel do formulário

        JLabel label1 = new JLabel();
        JButton criarCliente = new JButton("Cadastrar Cliente");
        criarCliente(criarCliente);

        JLabel label2 = new JLabel();
        JButton alterarCliente = new JButton("Alterar dados Cliente");

        JLabel label3 = new JLabel();
        JButton remover_cliente = new JButton("Remover Cliente");

        JLabel label4 = new JLabel();
        JButton consultar_cliente = new JButton("Consultar Dados de um Cliente");
        consultar_cliente.addActionListener(e -> {
            int codigoCliente = identificarCliente();

            if (codigoCliente < clientes.size()) {
                JOptionPane.showMessageDialog(null, "Cliente nao existe na base de dados!");
            } else {
                JOptionPane.showMessageDialog(null, "Dados do cliente: " + clientes.get(codigoCliente - 1));
            }
        });

        formPanel.add(label1);
        formPanel.add(criarCliente);

        formPanel.add(label2);
        formPanel.add(alterarCliente);

        formPanel.add(label3);
        formPanel.add(remover_cliente);

        formPanel.add(label4);
        formPanel.add(consultar_cliente);

        formPanel.add(new JLabel());

        frame.add(imagePanel, BorderLayout.WEST);
        frame.add(formPanel, BorderLayout.CENTER);
    }

    public static void criarCliente(JButton botao) {
        JFrame frameCadastro = frameCriarCliente();
        botao.addActionListener(e -> {
            frameCadastro.setVisible(true);
        });
    }

    public static int identificarCliente() {
        String codigocliente = JOptionPane.showInputDialog("Insira o codigo do cliente que você quer alterar: ");
        return Integer.parseInt(codigocliente);
    }

    public static JFrame frameCriarCliente() {
        JFrame frame = new JFrame("Cadastrar Cliente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new BorderLayout());

        JPanel imagePanel = new JPanel();
        imagePanel.setPreferredSize(new Dimension(300, 400));
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\bruno\\OneDrive\\Imagens\\barbearia.jpg");
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(image));
        imagePanel.add(imageLabel);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 2, 10, 10));
        formPanel.setPreferredSize(new Dimension(500, 400));

        JLabel label1 = new JLabel("Nome:");
        JTextField nome = new JTextField(15);

        JLabel label2 = new JLabel("Senha:");
        JTextField senha = new JTextField(15);


        JLabel label3 = new JLabel("Email:");
        JTextField email = new JTextField(15);

        JLabel label4 = new JLabel("Telefone:");
        JTextField telefone = new JTextField(15);

        JButton submitButton = new JButton("Enviar");
        submitButton.addActionListener(e -> {
            Cliente cliente = new Cliente(nome.getText(), senha.getText(), email.getText(), telefone.getText());
            clientes.add(cliente);

            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            for (Cliente c : clientes) {
                System.out.println(c);
            }

            nome.setText("");
            senha.setText("");
            email.setText("");
            telefone.setText("");
            frame.dispose();
        });

        formPanel.add(label1);
        formPanel.add(nome);

        formPanel.add(label2);
        formPanel.add(senha);

        formPanel.add(label3);
        formPanel.add(email);

        formPanel.add(label4);
        formPanel.add(telefone);

        formPanel.add(new JLabel());
        formPanel.add(submitButton);

        frame.add(imagePanel, BorderLayout.WEST);
        frame.add(formPanel, BorderLayout.CENTER);

        return frame;
    }
}

