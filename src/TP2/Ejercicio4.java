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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char cat = scan.next().toUpperCase().charAt(0);

        double descuento = 0;
        if (cat == 'A') descuento = 0.10;
        else if (cat == 'B') descuento = 0.15;
        else if (cat == 'C') descuento = 0.20;

        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
