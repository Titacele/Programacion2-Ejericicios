/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7.Ejercicio2;

/**
 *
 * @author celeste
 */
public class Rectangulo extends Figura { //Extender de clase padre
    //Atributos
    private double ancho, alto;
    
    // Constructor
    public Rectangulo(String nombre, double ancho, double alto) {
        super(nombre);
        this.ancho = ancho;
        this.alto = alto;
    }
    
    //Metodo sobreescrito
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
