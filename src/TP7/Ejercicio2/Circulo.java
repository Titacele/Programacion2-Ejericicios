/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7.Ejercicio2;

/**
 *
 * @author celeste
 */
public class Circulo extends Figura { //Extendemos de clase padre
    //Atributos
    private double radio;
    
    //Constructor
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    //Clase sobreescrita
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
