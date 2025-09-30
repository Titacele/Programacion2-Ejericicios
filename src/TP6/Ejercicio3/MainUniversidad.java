/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6.Ejercicio3;

/**
 *
 * @author celeste
 */
public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        // 1. Crear profesores
        Profesor prof1 = new Profesor("P1", "Ana López", "Matemática");
        Profesor prof2 = new Profesor("P2", "Carlos Pérez", "Programación");
        Profesor prof3 = new Profesor("P3", "María Gómez", "Bases de Datos");

        // 2. Crear cursos
        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "Programación I");
        Curso c3 = new Curso("C3", "Programación II");
        Curso c4 = new Curso("C4", "Base de Datos I");
        Curso c5 = new Curso("C5", "Sistemas Operativos");

        // 3. Agregar a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 4. Asignar profesores a cursos
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P2");
        uni.asignarProfesorACurso("C3", "P2");
        uni.asignarProfesorACurso("C4", "P3");

        // 5. Listar cursos y profesores
        System.out.println("\n--- CURSOS ---");
        uni.listarCursos();

        System.out.println("\n--- PROFESORES ---");
        uni.listarProfesores();

        // 6. Cambiar profesor de un curso
        System.out.println("\n--- CAMBIAR PROFESOR DE C3 A P3 ---");
        uni.asignarProfesorACurso("C3", "P3");
        uni.listarCursos();

        // 7. Eliminar curso
        System.out.println("\n--- ELIMINAR CURSO C2 ---");
        uni.eliminarCurso("C2");
        uni.listarCursos();
        uni.listarProfesores();

        // 8. Eliminar profesor
        System.out.println("\n--- ELIMINAR PROFESOR P1 ---");
        uni.eliminarProfesor("P1");
        uni.listarProfesores();
        uni.listarCursos();

        // 9. Reporte
        System.out.println("\n--- REPORTE CURSOS POR PROFESOR ---");
        uni.reporteCursosPorProfesor();
    }
}
