/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio14;

/**
 *
 * @author celeste
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) { // dependencia de creación
        Render render = new Render(formato, proyecto);
        System.out.println("Exportado: " + render);
    }
}