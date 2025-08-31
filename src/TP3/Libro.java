package TP3;

/**
 *
 * @author celeste
 * 
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // usar setter para validar
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anio) {
        if (anio > 0 && anio <= 2025) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Año de publicación inválido: " + anio);
        }
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Año: " + anioPublicacion);
    }
}
