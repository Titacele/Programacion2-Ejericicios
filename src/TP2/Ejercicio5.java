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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, suma = 0;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = scan.nextInt();
            if (num % 2 == 0 && num != 0) {
                suma += num;
            }
        } while (num != 0);

        System.out.println("La suma de los números pares es: " + suma);
    }
}
