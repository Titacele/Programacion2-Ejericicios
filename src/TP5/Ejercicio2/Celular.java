/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio2;

/**
 *
 * @author celeste
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;   // agregación
    private Usuario usuario;   // asociación bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        usuario.setCelular(this); // establece relación bidireccional
    }

    @Override
    public String toString() {
        return "Celular [imei=" + imei + ", marca=" + marca + ", modelo=" + modelo +
               ", bateria=" + bateria + ", usuario=" + usuario + "]";
    }
}