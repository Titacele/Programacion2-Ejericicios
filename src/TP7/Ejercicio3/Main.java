/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7.Ejercicio3;

/**
 *
 * @author celeste
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 50000));
        empleados.add(new EmpleadoTemporal("Juan", 2000, 20));

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " - Sueldo: " + e.calcularSueldo());
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
        }
    }
}