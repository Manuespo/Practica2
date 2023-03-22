package com.company;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;


public class Factura {
    private UUID idFactura=UUID.randomUUID();
    private double monto;
    private LocalDate fecha=LocalDate.now();
    private Cliente cliente;

    public Factura(double monto, Cliente cliente) {
        this.monto = monto;
        this.cliente = cliente;
    }
    public double montoFinal()
    {
        return (1-(cliente.getPorcentaje()/100))*monto;
    }

    public UUID getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(UUID idFactura) {
        this.idFactura = idFactura;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                '}';
    }
}
