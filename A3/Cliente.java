package com.company;

public class Cliente {
    private static int contador = 1;
    private int codigoCliente;
    private String nome;
    private String senha;
    private String email;
    private String telefone;

    public Cliente (String nomeCliente, String senhaCliente, String emailCliente, String telefoneCliente){
        this.codigoCliente = contador++;
        this.nome = nomeCliente;
        this.senha = senhaCliente;
        this.email = emailCliente;
        this.telefone = telefoneCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigoCliente=" + codigoCliente +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
