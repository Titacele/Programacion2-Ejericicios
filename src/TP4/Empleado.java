package TP4;

/**
 *
 * @author celeste
 * 
 */
public class Empleado {

    // Atributos de instancia
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático para contar empleados
    private static int totalEmpleados = 0;
    private static int idAuto = 1; // Para asignar id automático

    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = idAuto++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000; // Salario por defecto
        totalEmpleados++;
    }

    // Métodos sobrecargados para actualizar salario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }

    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // toString para representar al empleado
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
