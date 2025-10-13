/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7.Ejercicio1;

/**
 *
 * @author celeste
 */
public class Auto extends Vehiculo { /* Extendemos de la clase */
    // Declaramos metodo adicional
    private int cantidadPuertas;

    //Constructor llamando a constructor del padre
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    // Sobreescribimos metodo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Modelo: " + this.modelo + ", marca: " + this.marca + ", cantidad de puertas: " + cantidadPuertas);
    }
    
}
