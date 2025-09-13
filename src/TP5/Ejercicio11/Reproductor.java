/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio11;

/**
 *
 * @author celeste
 */
public class Reproductor {
    public void reproducir(Cancion cancion) { // dependencia de uso
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " de " + cancion.getArtista().toString());
    }
}