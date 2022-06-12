package com.loja_capa_fina;

import java.time.LocalDate;

public class PedidoConserto extends Pedido {
    private String modeloAparelho;
    private String tipoDefeito;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public PedidoConserto(int codigo, String modeloAparelho, String tipoDefeito, LocalDate dataEntrada, LocalDate dataSaida) {
        super(codigo);
        this.modeloAparelho = modeloAparelho;
        this.tipoDefeito = tipoDefeito;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public void retirarPedido() {

    }

    public String getModeloAparelho() {
        return modeloAparelho;
    }

    public void setModeloAparelho(String modeloAparelho) {
        this.modeloAparelho = modeloAparelho;
    }

    public String getTipoDefeito() {
        return tipoDefeito;
    }

    public void setTipoDefeito(String tipoDefeito) {
        this.tipoDefeito = tipoDefeito;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }
}
