package TP3;

/**
 *
 * @author celeste
 * 
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado!");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2; // ejemplo: 2 unidades por cada km
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
        } else {
            combustible += cantidad;
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }
}

