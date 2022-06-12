package com.loja_capa_fina;
import java.util.Random;

public class Acessorio {
    private int codigo;
    private String nome;
    private int qtdEstoque;
    private String categoria;
    private String descricao;
    private double preco;

    public Acessorio(String nome, int qtdEstoque, String categoria, String descricao) {
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;
        this.descricao = descricao;
        this.codigo = generateRandom();
    }

    private int generateRandom() {
        int r = new Random().nextInt(99999);
        return r;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
