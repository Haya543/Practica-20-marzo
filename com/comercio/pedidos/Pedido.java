package com.comercio.pedidos;

import java.util.Objects;

public class Pedido {
    private int idPedido;
    private String cliente;
    private double total;
    private EstadoPedido estado;


    public Pedido(int idPedido, String cliente, double total) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.total = total;
        this.estado = EstadoPedido.PENDIENTES;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void actualizarEstado(EstadoPedido nuevoEstado){
        this.estado = nuevoEstado;
    }

    @Override
    public String toString() {
        return "Pedido #" + idPedido + " - Cliente: " + cliente + " - Total $" + total + " - Estado: " + estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return idPedido == pedido.idPedido;
    }

}
