package com.company;
import java.util.UUID;


public class Cliente {
    private UUID id=UUID.randomUUID();
    private String nombre;
    private String email;
    private double porcentaje;

    public Cliente(String nombre, String email, double porcentaje) {
        this.nombre = nombre;
        this.email = email;
        this.porcentaje = porcentaje;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", porcentaje=" + porcentaje +
                '}';
    }
}
