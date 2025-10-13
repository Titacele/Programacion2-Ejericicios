/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7.Ejercicio2;

/**
 *
 * @author celeste
 */
public abstract class Figura { //Clase abstracta
    // Atributo protegido
    protected String nombre;

    //Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    //Metodo a sobreescribir
    public abstract double calcularArea();
}
