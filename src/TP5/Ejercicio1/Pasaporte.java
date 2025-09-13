/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio1;

/**
 *
 * @author celeste
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;        // composición
    private Titular titular;  // asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, Titular titular, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        titular.setPasaporte(this); // establece la relación bidireccional
    }

    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", fechaEmision=" + fechaEmision +
               ", foto=" + foto + ", titular=" + titular + "]";
    }
}