package com.loja_capa_fina;

import java.sql.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Criando três instâncias de cada uma das classes
        //Começamos com a classe LOJAS
        Loja loja1 = new Loja("Rua XV de novembro,200","4197896545","66615246000186","8:00", "17:00");
        Loja loja2 = new Loja("Rua Mariano Torres,150","4197896546","17273696000122","8:00", "17:00");
        Loja loja3 = new Loja("Avenida Candido de Abreu, 127 Loja 52","4198858589","01108219000171","11:00", "22:00");

        //Agora vamos a criar tres funcionarios, um de cada tipo
        Gerente gerente = new Gerente("RG","125478", "Eduardo", LocalDate.of(1981,6,18),"Rua di Narnia,9-3/4",3500.00);
        Tecnico tecnico = new Tecnico("RG","157852","Marianela", LocalDate.of(1990,1,11), "Bairro Cabral, casa 57",1800.00);
        Vendedor vendedor = new Vendedor("RG","147523","Hugo", LocalDate.of(2001,1,1), "Rua Menezes, 21",2300.00);

        gerente.contatarFornecedor();
        gerente.calcularSalario();
        gerente.organizarEquipe();
        gerente.realizarContabilidade();

        System.out.println("----------------------");

        tecnico.avaliarAparelho();
        tecnico.calcularConserto();

        //Agora vamos a criar tres clientes
        Cliente cliente1 = new Cliente("74647895041", "Carlos da Silva", "R. Mal. Floriano Peixoto, 3006", "4135353535");
        Cliente cliente2 = new Cliente("69802925012", "Caio Albuquerque", "R. Mal. Deodoro da Fonseca, 18", "4135353535");
        Cliente cliente3 = new Cliente("10571148042", "Maria Castro Pereira", "R. da Flores, 100", "4135353535");

        System.out.println("Cliente numero 1 é " + cliente1.getNomeCompleto());
        cliente1.realizarPedido();

        //Agora vamos a criar tres novos acessorios
        Acessorio acess1 = new Acessorio("Selfie Ring",50,"acessorio celular", "Acessorio para Vlogger's");
        Acessorio acess2 = new Acessorio("Selfie Stick", 20, "acessorio celular", "Estende até 50cm com controle bluetooth");
        Acessorio acess3 = new Acessorio("Capa iPad 10", 10, "acessorio tablet", "Capa de couro sintetico cor marrom");

        // adicionado acessorio à loja1
        Acessorio[] a = {acess1, acess2, acess3};
        loja1.setAcessorios(a);

        System.out.println("Disponível na loja: ");
        System.out.println(acess1.getQtdEstoque() + " unidades do acessorio " + acess1.getNome());
        System.out.println(acess2.getQtdEstoque() + " unidades do acessorio " + acess2.getNome());
        System.out.println(acess3.getQtdEstoque() + " unidades do acessorio " + acess3.getNome());

        //Agora vamos a criar um pedido conserto e um pedido acessorio
        PedidoConserto pedidoConserto = new PedidoConserto(1, "Moto G 22", "Tela Quebrada", LocalDate.of(2022,3,22), LocalDate.of(2022,4, 2));

        PedidoAcessorio pedidoAcessorio = new PedidoAcessorio(2, 10, 20);

        System.out.println("Aparelho " + pedidoConserto.getModeloAparelho() + " sendo consertado.");

        System.out.println("Pedido " + pedidoAcessorio.getCodigo() + " gerado para o acessorio " + pedidoAcessorio.getCodAcessorio());

    }
}
