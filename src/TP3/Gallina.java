package TP3;

/**
 *
 * @author celeste
 * 
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina) {
        this.idGallina = idGallina;
        this.edad = 0;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina + 
                           " | Edad: " + edad + 
                           " | Huevos puestos: " + huevosPuestos);
    }
}

