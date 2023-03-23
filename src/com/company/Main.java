package com.company;
import java.util.UUID;


public class Main {

    public static void main(String[] args) {
        Cliente cliente=new Cliente("Manuel","Esposito",15.0);
        System.out.println(cliente);
        Factura factura=new Factura(cliente);
        factura.agregarItemsFactura("Papas Fritas","Lays",450.0);
        factura.agregarItemsFactura("Coca Cola","Coca",650.0);
        factura.agregarItemsFactura("Mani Salado","---",250.0);
        System.out.println(factura);


    }
}
