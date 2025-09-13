/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio10;

/**
 *
 * @author celeste
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // composición
    private Titular titular;       // asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, Titular titular, String codigoClave, String fechaMod) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.titular = titular;
        this.clave = new ClaveSeguridad(codigoClave, fechaMod); // creación interna
        titular.setCuenta(this);
    }

    @Override
    public String toString() {
        return "CuentaBancaria [cbu=" + cbu + ", saldo=" + saldo +
               ", clave=" + clave + ", titular=" + titular + "]";
    }
}
