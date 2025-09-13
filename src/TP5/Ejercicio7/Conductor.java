/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio7;

/**
 *
 * @author celeste
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // asociación bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor [nombre=" + nombre + ", licencia=" + licencia + "]";
    }
}
