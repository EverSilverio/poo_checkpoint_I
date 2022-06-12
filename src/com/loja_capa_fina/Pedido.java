package com.loja_capa_fina;

import java.util.Random;

public abstract class Pedido {
    private int codigo;

    public Pedido(int codigo) {
        this.codigo = generateRandom();
    }

    private int generateRandom() {
        int r = new Random().nextInt(99999);
        return r;
    }

    public int getCodigo() {
        return codigo;
    }
}
