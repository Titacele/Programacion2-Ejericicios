/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6.Ejercicio1;

/**
 *
 * @author celeste
 */
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos
        Producto p1 = new Producto("P1", "Pan", 500, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P2", "Celular", 2500, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P3", "Camisa", 1500, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P4", "Silla", 3000, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P5", "Laptop", 4500, 7, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        inventario.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("\n--- BUSCAR PRODUCTO POR ID (P3) ---");
        Producto buscado = inventario.buscarProductoPorId("P3");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por categoría
        System.out.println("\n--- FILTRAR POR CATEGORÍA ELECTRONICA ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar un producto
        System.out.println("\n--- ELIMINAR PRODUCTO P2 ---");
        inventario.eliminarProducto("P2");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n--- ACTUALIZAR STOCK DE P1 ---");
        inventario.actualizarStock("P1", 50);
        inventario.buscarProductoPorId("P1").mostrarInfo();

        // 7. Mostrar total de stock
        System.out.println("\n--- TOTAL DE STOCK ---");
        System.out.println("Total: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\n--- PRODUCTO CON MAYOR STOCK ---");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // 9. Filtrar por rango de precio
        System.out.println("\n--- FILTRAR PRODUCTOS ENTRE $1000 Y $3000 ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías disponibles
        System.out.println("\n--- CATEGORÍAS DISPONIBLES ---");
        inventario.mostrarCategoriasDisponibles();
    }
}

