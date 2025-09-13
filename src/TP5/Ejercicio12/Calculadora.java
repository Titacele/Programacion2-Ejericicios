/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio12;

/**
 *
 * @author celeste
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) { // dependencia de uso
        System.out.println("Calculando impuesto de " + impuesto.getContribuyente() +
                           " por monto: $" + impuesto.getMonto());
    }
}
