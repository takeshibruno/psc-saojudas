package com.company;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) throws SQLException {
        try {
            conectarBD();
            System.out.println("conectou");
        } catch (Exception e) {
            System.out.println("nao conectou a base de dados" + e.getMessage());
        }

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
        alterarCliente.addActionListener(e -> {
            int codigo = identificarCliente();
            String campo = JOptionPane.showInputDialog("Insira o campo que voce quer alterar deste cliente: ");
            String valor = JOptionPane.showInputDialog("Insira o valor novo que voce quer assimilar a este campo: ");

            alter(codigo, valor, campo);
        });

        JLabel label3 = new JLabel();
        JButton remover_cliente = new JButton("Remover Cliente");
        remover_cliente.addActionListener(e -> {
            int codigo = identificarCliente();
            remove(codigo);
        });


        JLabel label4 = new JLabel();
        JButton consultar_cliente = new JButton("Consultar Dados de um Cliente");
        consultar_cliente.addActionListener(e -> {
            int codigoCliente = identificarCliente();

            if (codigoCliente < clientes.size()) {
                JOptionPane.showMessageDialog(null, "Cliente nao existe na base de dados!");
            } else {
                String dados = read(codigoCliente);
                JOptionPane.showMessageDialog(null, "Dados do cliente: " + dados);
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

            create(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

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

    public static Connection conectarBD() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/teste";
        String user = "bruno";
        String senha = "admin";

        return DriverManager.getConnection(url, user, senha);
    }

    public static void create(Cliente cliente) {
        String sql = "INSERT INTO clientes (codigoCliente, nome, senha, email, telefone) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = conectarBD(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, cliente.getCodigoCliente()); //
            pstmt.setString(2, cliente.getNome());
            pstmt.setString(3, cliente.getSenha());
            pstmt.setString(4, cliente.getEmail());
            pstmt.setString(5, cliente.getTelefone());

            pstmt.executeUpdate();
            System.out.println("Cliente salvo com sucesso!");
        } catch (SQLException e) {
            System.out.println("nao foi pra bd");
            e.getMessage();
        }
    }

    public static String read(int codigo) {
        String sql = "SELECT * FROM clientes WHERE codigoCliente = ?";

        try (Connection conn = conectarBD(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, codigo);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String senha = rs.getString("senha");
                    String email = rs.getString("email");
                    String telefone = rs.getString("telefone");

                    return "Cliente{codigoCliente=" + codigo + ", nome='" + nome + "', email='" + email + "', telefone='" + telefone + "', senha='" + senha +"'}";
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return "";
    }

    public static void remove (int codigo) {
        String sql = "DELETE FROM clientes WHERE codigoCliente = ?";

        try (Connection conn = conectarBD(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, codigo);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public static void alter (int codigo, String dado, String campo) {
        String sql = "UPDATE clientes SET " + campo + " = ? WHERE codigoCliente = ?";

        try (Connection conn = conectarBD(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, dado);
            pstmt.setInt(2, codigo);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Campo alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao alterar o campo");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

