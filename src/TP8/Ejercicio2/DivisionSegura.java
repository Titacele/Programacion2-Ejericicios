/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.Ejercicio2;

/**
 *
 * @author celeste
 */
import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el numerador: ");
            int num1 = sc.nextInt();

            System.out.print("Ingrese el denominador: ");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
        finally {
            sc.close();
            System.out.println("Operación finalizada (bloque finally ejecutado).");
        }
    }
}
