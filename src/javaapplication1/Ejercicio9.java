/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author celeste
 */

import java.util.Scanner;

public class Ejercicio9 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // CORREGIDO: Usar nextLine() para leer texto

        System.out.println("Hola,\n" + nombre);

        scanner.close();
    }
    
}
