/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

import java.util.Scanner;
/**
 *
 * @author celeste
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scan.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = scan.nextInt();

        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("El mayor es: " + mayor);
    }
}
