package pe.edu.isil.inventario;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // ========================================
        // CREAR COLECCION DE PRODUCTOS
        // ========================================

        ArrayList<Producto> productos = new ArrayList<>();

        // Registrar productos iniciales
        productos.add(new Producto(1, "Laptop Lenovo", "Tecnologia", 2500.00, 10));
        productos.add(new Producto(2, "Mouse Logitech", "Accesorios", 85.50, 25));
        productos.add(new Producto(3, "Teclado Mecanico", "Accesorios", 150.00, 15));
        productos.add(new Producto(4, "Monitor Samsung", "Tecnologia", 750.00, 8));
        productos.add(new Producto(5, "Audifonos Sony", "Audio", 220.00, 12));


        // ========================================
        // MOSTRAR ENCABEZADO
        // ========================================

        System.out.println("========================================");
        System.out.println("       SISTEMA DE GESTION DE INVENTARIO");
        System.out.println("========================================");


        // ========================================
        // LISTAR PRODUCTOS
        // ========================================

        System.out.println("\nLISTADO DE PRODUCTOS:");

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("\nTotal de productos: " + productos.size());


        // ========================================
        // RECUPERAR PRODUCTO POR POSICION
        // ========================================

        System.out.println("\nRECUPERAR PRODUCTO:");

        Producto productoRecuperado = productos.get(0);

        System.out.println(productoRecuperado);


        // ========================================
        // BUSCAR PRODUCTO POR ID
        // ========================================

        System.out.println("\nBUSCAR PRODUCTO POR ID:");

        int idBuscar = 3;
        boolean encontrado = false;

        for (Producto producto : productos) {

            if (producto.getId() == idBuscar) {

                System.out.println("Producto encontrado:");
                System.out.println(producto);

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }


        // ========================================
        // ELIMINAR PRODUCTO POR ID
        // ========================================

        System.out.println("\nELIMINAR PRODUCTO:");

        int idEliminar = 5;

        boolean eliminado = productos.removeIf(
                producto -> producto.getId() == idEliminar
        );

        if (eliminado) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("No se encontro el producto.");
        }


        // ========================================
        // MOSTRAR LISTADO ACTUALIZADO
        // ========================================

        System.out.println("\nLISTADO ACTUALIZADO:");

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("\nTotal actualizado: " + productos.size());


        // ========================================
        // ORDENAR PRODUCTOS POR PRECIO
        // ========================================

        System.out.println("\nPRODUCTOS ORDENADOS POR PRECIO:");

        Collections.sort(productos, (p1, p2) ->
                Double.compare(p1.getPrecio(), p2.getPrecio())
        );

        for (Producto producto : productos) {
            System.out.println(producto);
        }


        // ========================================
        // ORDENAR PRODUCTOS POR NOMBRE
        // ========================================

        System.out.println("\nPRODUCTOS ORDENADOS POR NOMBRE:");

        Collections.sort(productos, (p1, p2) ->
                p1.getNombre().compareToIgnoreCase(p2.getNombre())
        );

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        OperacionesArrayList.ejecutarPruebas(productos);
        OperacionesCollections.ejecutarOperaciones(productos);


        // ========================================
        // FINALIZAR PROGRAMA
        // ========================================

        System.out.println("\n========================================");
        System.out.println("       FIN DEL SISTEMA DE INVENTARIO");
        System.out.println("========================================");

    }
}
