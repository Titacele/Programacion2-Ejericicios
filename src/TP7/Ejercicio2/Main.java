/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7.Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author celeste
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Rectangulo rect1 = new Rectangulo("Rectangulo 1", 4, 5);
        Circulo circ1 = new Circulo("Circulo 1", 3);
        
        figuras.add(rect1);
        figuras.add(circ1);


        for (Figura f : figuras) {
            System.out.println(f.nombre + " - Área: " + f.calcularArea());
        }
    }
}
