package pe.edu.isil.inventario;

import java.util.ArrayList;

public class OperacionesArrayList {

    // Recibe directamente la lista de productos del Main
    public static void ejecutarPruebas(ArrayList<Producto> productos) {

        System.out.println("========================================");
        System.out.println("   OPERACIONES CON ARRAYLIST");
        System.out.println("========================================");

        // 2. Buscar productos
        System.out.println("\n1. BUSCAR PRODUCTO:");
        String busqueda = "Teclado";
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
                System.out.println("Encontrado: " + p);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontró el producto.");

        // 4. Actualizar producto con .set()
        System.out.println("\n2. ACTUALIZAR PRODUCTO CON:");
        if (!productos.isEmpty()) {
            Producto productoAntiguo = productos.get(0);
            Producto productoModificado = new Producto(
                    productoAntiguo.getId(),
                    "Laptop Gamer ASUS",
                    "Tecnologia",
                    3200.00,
                    8
            );
            productos.set(0, productoModificado);
            System.out.println("¡Registro actualizado!");
            System.out.println("Nuevo valor: " + productos.get(0));
        }

        // 5. Filtrar elementos creando una sub-lista
        System.out.println("\n3. FILTRAR PRODUCTOS POR CATEGORÍA:");
        ArrayList<Producto> listaTecnologia = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria().equalsIgnoreCase("Tecnologia")) {
                listaTecnologia.add(p);
            }
        }
        System.out.println("Se encontraron " + listaTecnologia.size() + " productos en la categoría 'Tecnologia':");
        for (Producto p : listaTecnologia) {
            System.out.println(" -> " + p.getNombre() + " (S/ " + p.getPrecio() + ")");
        }

        // 6. Encontrar el índice exacto con .indexOf()
        System.out.println("\n4. ENCONTRAR POSICIÓN EXACTA:");
        String nombreBuscado = "Monitor Samsung";
        Producto productoEncontrado = null;
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                productoEncontrado = p;
                break;
            }
        }
        if (productoEncontrado != null) {
            int indiceExacto = productos.indexOf(productoEncontrado);
            System.out.println("El producto \"" + productoEncontrado.getNombre() + "\" está ubicado exactamente en la posicion: " + indiceExacto);
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("\nLISTADO ACTUALIZADO:");

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("\nTotal actualizado: " + productos.size());

        System.out.println("========================================");
    }
}