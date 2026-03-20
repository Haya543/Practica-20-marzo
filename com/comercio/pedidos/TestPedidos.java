package com.comercio.pedidos;

public class TestPedidos {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(101,"Ana Gomez", 1500.0);
        Pedido p2 = new Pedido(102,"Luis Torres", 350.50);

        System.out.println(p1);
        System.out.println(p2);

        p1.actualizarEstado(EstadoPedido.ENVIADO);
        p2.actualizarEstado(EstadoPedido.PROCESANDO);

        System.out.println(p1);
        System.out.println(p2);

        Pedido p3 = new Pedido(101, "Ana G", 1500.0);

        System.out.println(p1.equals(p2));
        if(p1.equals(p3)){
            System.out.println("Confirmado: p1 y p3 son el mismo número de pedidio");
        }
    }
}
