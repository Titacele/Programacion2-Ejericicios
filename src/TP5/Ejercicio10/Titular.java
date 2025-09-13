/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio10;

/**
 *
 * @author celeste
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
}