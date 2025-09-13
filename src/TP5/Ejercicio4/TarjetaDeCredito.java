/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio4;

/**
 *
 * @author celeste
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // asociación bidireccional
    private Banco banco;     // agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this); // establece bidireccionalidad
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito [numero=" + numero + ", fechaVencimiento=" + fechaVencimiento +
               ", cliente=" + cliente + ", banco=" + banco + "]";
    }
}