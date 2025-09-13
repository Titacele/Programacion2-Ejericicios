/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio6;

/**
 *
 * @author celeste
 */
public class ClienteReserva {
    private String nombre;
    private String telefono;

    public ClienteReserva(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ClienteReserva [nombre=" + nombre + ", telefono=" + telefono + "]";
    }
}
