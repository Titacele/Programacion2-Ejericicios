package TP3;

/**
 *
 * @author celeste
 * 
 */
public class Main {
    public static void main(String[] args) {
        
        // 1. Estudiante
        Estudiante e1 = new Estudiante("Juan", "Pérez", "Programación II", 7.5);
        e1.mostrarInfo();
        e1.subirCalificacion(1.5);
        e1.bajarCalificacion(3);
        e1.mostrarInfo();

        System.out.println("\n---\n");

        // 2. Mascota
        Mascota m1 = new Mascota("Firulais", "Perro", 3);
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();

        System.out.println("\n---\n");

        // 3. Libro
        Libro l1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        l1.mostrarInfo();
        l1.setAnioPublicacion(3000); // inválido
        l1.setAnioPublicacion(2020); // válido
        l1.mostrarInfo();

        System.out.println("\n---\n");

        // 4. Gallinas
        Gallina g1 = new Gallina(1);
        Gallina g2 = new Gallina(2);
        g1.envejecer();
        g1.ponerHuevo();
        g1.mostrarEstado();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.mostrarEstado();

        System.out.println("\n---\n");

        // 5. Nave Espacial
        NaveEspacial nave = new NaveEspacial("Apollo", 50);
        nave.mostrarEstado();
        nave.avanzar(20); // no debería alcanzar
        nave.recargarCombustible(40);
        nave.despegar();
        nave.avanzar(20);
        nave.mostrarEstado();
    }
}
