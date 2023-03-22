package com.company;
import java.util.UUID;


public class Main {

    public static void main(String[] args) {
        Cliente cliente=new Cliente("Manuel","Esposito",15.0);
        System.out.println(cliente);
        Factura factura=new Factura(2760.0,cliente);
        System.out.println(factura);
        System.out.println(factura.montoFinal());


    }
}
