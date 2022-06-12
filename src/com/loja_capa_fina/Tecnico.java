package com.loja_capa_fina;

import java.time.LocalDate;

public class Tecnico extends Funcionario {
    private Double porcentagemAdicional;

    public Tecnico(String tipoDocumento, String nroDocumento, String nomeCompleto, LocalDate dataNascimento, String endereco, Double salarioBase) {
        super(tipoDocumento, nroDocumento, nomeCompleto, dataNascimento, endereco, salarioBase);
        this.porcentagemAdicional = 25D;
    }

    @Override
    public void calcularSalario() {
        System.out.println(getNomeCompleto() + " é Técnico da loja e o seu salario base é de " + getSalarioBase() + " com um adicional de " + this.porcentagemAdicional + "% do valor por cada aparelho consertado");
    }
    public void avaliarAparelho() {
        System.out.println("Nosso técnico " + getNomeCompleto() + " realizará a avaliação do defeito no seu aparelho celular");
    }
    public void consertarAparelho() {
        System.out.println("O técnico " + getNomeCompleto() + " está consertando seu aparelho");
    }
    public void calcularConserto() {
        System.out.println("O valor do conserto de seu aparelho é de 1000 reais, melhor comprar um novo ;)");
    }
}
