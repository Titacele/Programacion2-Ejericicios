package TP4;

/**
 *
 * @author celeste
 * 
 */
public class Main {
    public static void main(String[] args) {

        // Crear empleados usando ambos constructores
        Empleado emp1 = new Empleado(101, "Juan Pérez", "Analista", 50000);
        Empleado emp2 = new Empleado("María López", "Programadora");
        Empleado emp3 = new Empleado("Carlos Gómez", "Diseñador");

        // Aplicar métodos sobrecargados actualizarSalario
        emp1.actualizarSalario(10);    // aumento del 10%
        emp2.actualizarSalario(5000);  // aumento fijo de 5000
        emp3.actualizarSalario(15);    // aumento del 15%

        // Imprimir información de los empleados
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
