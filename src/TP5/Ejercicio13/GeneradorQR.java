/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio13;

/**
 *
 * @author celeste
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) { // dependencia de creación
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("Generado QR: " + codigo);
    }
}
