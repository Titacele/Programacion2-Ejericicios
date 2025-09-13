/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5.Ejercicio8;

/**
 *
 * @author celeste
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // composición

    public Documento(String titulo, String contenido, Usuario usuario, String codigoHash, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario); // creación interna
    }

    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + ", contenido=" + contenido + ", firma=" + firma + "]";
    }
}