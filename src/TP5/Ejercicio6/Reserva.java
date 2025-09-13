/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio6;

/**
 *
 * @author celeste
 */
public class Reserva {
    private String fecha;
    private String hora;
    private ClienteReserva cliente; // asociación unidireccional
    private Mesa mesa;              // agregación

    public Reserva(String fecha, String hora, ClienteReserva cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva [fecha=" + fecha + ", hora=" + hora +
               ", cliente=" + cliente + ", mesa=" + mesa + "]";
    }
}