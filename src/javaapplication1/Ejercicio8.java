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

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // División con enteros
        System.out.print("Ingrese el primer número entero: ");
        int numInt1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numInt2 = scanner.nextInt();

        if (numInt2 != 0) {
            int resultadoInt = numInt1 / numInt2;
            System.out.println("Resultado división con int: " + resultadoInt);
        } else {
            System.out.println("No se puede dividir por cero (int).");
        }

        // División con double
        System.out.print("Ingrese el primer número decimal: ");
        double numDouble1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número decimal: ");
        double numDouble2 = scanner.nextDouble();

        if (numDouble2 != 0) {
            double resultadoDouble = numDouble1 / numDouble2;
            System.out.println("Resultado división con double: " + resultadoDouble);
        } else {
            System.out.println("No se puede dividir por cero (double).");
        }

        scanner.close();
    }
    
}
