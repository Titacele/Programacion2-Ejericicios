/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author celeste
 */
public class Ejercicio13 {
    
    public static void imprimirArray(double[] arr, int indice) {
        if (indice < arr.length) {
            System.out.println("Precio: $" + arr[indice]);
            imprimirArray(arr, indice + 1);
        }
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirArray(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirArray(precios, 0);
    }
}
