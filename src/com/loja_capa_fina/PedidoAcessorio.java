package com.loja_capa_fina;

public class PedidoAcessorio extends Pedido {
    private int codAcessorio[];
    private int quantidade;

    public PedidoAcessorio(int codigo, int[] codAcessorio, int quantidade) {
        super(codigo);
        this.codAcessorio = codAcessorio;
        this.quantidade = quantidade;
    }

    public int[] getCodAcessorio() {
        return codAcessorio;
    }

    public void setCodAcessorio(int[] codAcessorio) {
        this.codAcessorio = codAcessorio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
