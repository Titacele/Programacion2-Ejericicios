/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6.Ejercicio3;

/**
 *
 * @author celeste
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // Bidireccional

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this); // quitar del anterior
        }
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this); // sincronizar con el nuevo
        }
    }

    public void mostrarInfo() {
        String prof = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + codigo + " | " + nombre + " | Profesor: " + prof);
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre;
    }
}
