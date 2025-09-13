/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio7;

/**
 *
 * @author celeste
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;       // agregación
    private Conductor conductor; // asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        conductor.setVehiculo(this); // establece la relación bidireccional
    }

    @Override
    public String toString() {
        return "Vehiculo [patente=" + patente + ", modelo=" + modelo +
               ", motor=" + motor + ", conductor=" + conductor + "]";
    }
}
