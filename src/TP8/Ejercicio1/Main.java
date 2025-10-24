/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.Ejercicio1;

/**
 *
 * @author celeste
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucía Fernández");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Notebook", 1200));
        pedido.agregarProducto(new Producto("Mouse", 30));
        pedido.mostrarProductos();

        pedido.setEstado("En preparación");

        PagoConDescuento pago = new TarjetaCredito("Lucía Fernández");
        double totalConDescuento = pago.aplicarDescuento(pedido.calcularTotal());
        pago.procesarPago(totalConDescuento);
    }
}
