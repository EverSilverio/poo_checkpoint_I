package com.loja_capa_fina;

import java.time.LocalDate;

public class Vendedor extends Funcionario {
    private Double comissaoLoja;

    public Vendedor(String tipoDocumento, String nroDocumento, String nomeCompleto, LocalDate dataNascimento, String endereco, Double salarioBase, Double comissaoLoja) {
        super(tipoDocumento, nroDocumento, nomeCompleto, dataNascimento, endereco, salarioBase);
        this.comissaoLoja = 1D;
    }

    @Override
    public void calcularSalario() {
        System.out.println(getNomeCompleto() + " é vendedor da loja e o seu salario base é de " + getSalarioBase() + " com um adicional de " + this.comissaoLoja + "% do valor total das vendas da loja");
    }
    public void realizarVenda() {
        System.out.println("O vendedor " + getNomeCompleto() + " pode lhe ajudar a comprar o produto ou receber seu aparelho");
    }
    public void revisarEstoque() {
        System.out.println("O vendedor " + getNomeCompleto() + " vai revisar o estoque dos produtos");
    }
}
