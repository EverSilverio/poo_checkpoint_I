package com.loja_capa_fina;

public class Loja {

    private String endereco;
    private String telefone;
    private String cnpj;
    private String horarioAbertura;
    private String horarioFechamento;
    private Acessorio[] acessorios;
    private Funcionario[] funcionarios;

    public Loja(String endereco, String telefone, String cnpj, String horarioAbertura, String horarioFechamento) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.horarioAbertura = horarioAbertura;
        this.horarioFechamento = horarioFechamento;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getHorarioAbertura() {
        return horarioAbertura;
    }

    public void setHorarioAbertura(String horarioAbertura) {
        this.horarioAbertura = horarioAbertura;
    }

    public String getHorarioFechamento() {
        return horarioFechamento;
    }

    public void setHorarioFechamento(String horarioFechamento) {
        this.horarioFechamento = horarioFechamento;
    }

    public Acessorio[] getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(Acessorio[] acessorios) {
        this.acessorios = acessorios;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
