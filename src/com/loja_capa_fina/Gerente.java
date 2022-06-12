package com.loja_capa_fina;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    private Double comissaoVendas;

    public Gerente(String tipoDocumento, String nroDocumento, String nomeCompleto, LocalDate dataNascimento, String endereco, Double salarioBase) {
        super(tipoDocumento, nroDocumento, nomeCompleto, dataNascimento, endereco, salarioBase);
        this.comissaoVendas = 0.5;
    }

    @Override
    public void calcularSalario() {
        System.out.println(getNomeCompleto() + " é o gerente da loja e o seu salario base é de " + getSalarioBase() + " com um adicional de " + this.comissaoVendas + " % do valor total das vendas.");
    }

    public void organizarEquipe() {
        System.out.println("O gerente " + getNomeCompleto() + " tem o papel de organizar a equipe da sua loja.");
    }

    public void realizarContabilidade() {
        System.out.println("O gerente " + getNomeCompleto() + " deve realizar a contabilidade da loja");
    }

    public void contatarFornecedor() {
        System.out.println("Em caso de falta de algum item da loja, o gerente " +getNomeCompleto() + " deve entrar em contato com o seu fornecedor.");
    }
}
