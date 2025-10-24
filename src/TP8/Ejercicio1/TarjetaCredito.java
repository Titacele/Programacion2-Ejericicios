/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.Ejercicio1;

/**
 *
 * @author celeste
 */
public class TarjetaCredito implements PagoConDescuento {
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta a nombre de " + titular + " por $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        double totalConDescuento = monto * 0.9; // 10% de descuento
        System.out.println("Se aplicó un 10% de descuento. Total: $" + totalConDescuento);
        return totalConDescuento;
    }
}
