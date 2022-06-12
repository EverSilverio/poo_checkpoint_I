package com.loja_capa_fina;

public class Cliente {
    private String cpf;
    private String nomeCompleto;
    private String endereco;
    private String telefone;
    private Pedido[] pedidos;

    public Cliente(String cpf, String nomeCompleto, String endereco, String telefone) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void realizarPedido() {
        System.out.println("Cliente " + this.nomeCompleto + " está realizando um pedido!");
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
}
