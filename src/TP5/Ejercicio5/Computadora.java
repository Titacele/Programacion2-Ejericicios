/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio5;

/**
 *
 * @author celeste
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // composición
    private Propietario propietario; // asociación bidireccional

    public Computadora(String marca, String numeroSerie, Propietario propietario, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    @Override
    public String toString() {
        return "Computadora [marca=" + marca + ", numeroSerie=" + numeroSerie +
               ", placaMadre=" + placaMadre + ", propietario=" + propietario + "]";
    }
}