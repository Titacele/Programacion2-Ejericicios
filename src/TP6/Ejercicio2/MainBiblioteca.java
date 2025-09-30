/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6.Ejercicio2;

/**
 *
 * @author celeste
 */
public class MainBiblioteca {
    public static void main(String[] args) {
        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor a1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A2", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A3", "Isabel Allende", "Chilena");

        // 3. Agregar 5 libros
        biblioteca.agregarLibro("ISBN1", "Cien Años de Soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN2", "El Amor en los Tiempos del Cólera", 1985, a1);
        biblioteca.agregarLibro("ISBN3", "Ficciones", 1944, a2);
        biblioteca.agregarLibro("ISBN4", "El Aleph", 1949, a2);
        biblioteca.agregarLibro("ISBN5", "La Casa de los Espíritus", 1982, a3);

        // 4. Listar libros
        System.out.println("\n--- LISTA DE LIBROS ---");
        biblioteca.listarLibros();

        // 5. Buscar libro por ISBN
        System.out.println("\n--- BUSCAR LIBRO ISBN3 ---");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN3");
        if (buscado != null) buscado.mostrarInfo();

        // 6. Filtrar libros por año
        System.out.println("\n--- LIBROS PUBLICADOS EN 1949 ---");
        biblioteca.filtrarLibrosPorAnio(1949);

        // 7. Eliminar un libro
        System.out.println("\n--- ELIMINAR LIBRO ISBN2 ---");
        biblioteca.eliminarLibro("ISBN2");
        biblioteca.listarLibros();

        // 8. Cantidad de libros
        System.out.println("\n--- CANTIDAD DE LIBROS ---");
        System.out.println("Total: " + biblioteca.obtenerCantidadLibros());

        // 9. Mostrar autores
        System.out.println("\n--- AUTORES DISPONIBLES ---");
        biblioteca.mostrarAutoresDisponibles();
    }
}
