package com.company;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;


public class Factura {
    private UUID idFactura=UUID.randomUUID();
    private double monto=0.0;
    private LocalDate fecha=LocalDate.now();
    private Cliente cliente;
    private ArrayList<ItemVenta> listaItems= new ArrayList<ItemVenta>();

    public Factura(Cliente cliente) {
        this.cliente = cliente;
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

    public void agregarItemsFactura(String nombreProducto, String descripcion, double precioUnitario)
    {
        listaItems.add(new ItemVenta(nombreProducto,descripcion,precioUnitario));
    }
    public double montoFinalDescuento()
    {
        for (int i=0;i< listaItems.size();i++)
        {
            this.monto+=listaItems.get(i).getPrecioUnitario();
        }
        return (1-(cliente.getPorcentaje()/100))*this.monto;
    }
    public double montoFinal()
    {
        for (int i=0;i< listaItems.size();i++)
        {
            this.monto+=listaItems.get(i).getPrecioUnitario();
        }
        return this.monto;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", monto=" + montoFinal() +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", listaItems=" + listaItems +
                '}';
    }
}
