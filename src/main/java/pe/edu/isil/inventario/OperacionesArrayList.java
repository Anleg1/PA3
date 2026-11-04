package pe.edu.isil.inventario;
import java.util.ArrayList;

public class OperacionesArrayList {

    public static void ejecutarPruebas() {
        GestorProductos gestor = new GestorProductos();
        gestor.cargarDatosIniciales();

        System.out.println("========================================");
        System.out.println("   OPERACIONES CON ARRAYLIST");
        System.out.println("========================================");

        // Recuperar registros mediante posiciones
        System.out.println("\n1. RECUPERAR REGISTRO POR POSICIÓN:");
        if (!gestor.getProductos().isEmpty()) {
            System.out.println("Elemento en la ubicacion 0: " + gestor.getProductos().get(0));
            System.out.println("Elemento en la ubicacion 2: " + gestor.getProductos().get(2));
        }

        // Buscar productos
        System.out.println("\n2. BUSCAR PRODUCTO:");
        String busqueda = "Teclado";
        boolean encontrado = false;
        for (Producto p : gestor.getProductos()) {
            if (p.getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
                System.out.println("Encontrado: " + p);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontró el producto.");


        // Eliminar registros
        System.out.println("\n3. ELIMINAR REGISTRO:");
        if (gestor.getProductos().size() > 1) {
            Producto eliminado = gestor.getProductos().remove(1); // Elimina el segundo elemento
            System.out.println("Producto eliminado: " + eliminado.getNombre());
        }

        // Ver listado de pruebas
        System.out.println("\n4. LISTADO TRAS OPERACIONES:");
        gestor.listarProductos();
        System.out.println("========================================");

        System.out.println("\n5. ACTUALIZAR PRODUCTO CON .set():");
        if (!gestor.getProductos().isEmpty()) {
            // Modificaremos el producto que está en la primera posición (índice 0)
            Producto productoAntiguo = gestor.getProductos().get(0);

            // Creamos un producto actualizado manteniendo su ID original
            Producto productoModificado = new Producto(
                    productoAntiguo.getId(),
                    "Laptop Gamer ASUS",
                    "Tecnologia",
                    3200.00,
                    8
            );

            // Reemplazamos el elemento en el índice 0
            gestor.getProductos().set(0, productoModificado);

            System.out.println("¡Registro actualizado");
            System.out.println("Nuevo valor: " + gestor.getProductos().get(0));
        }

        // Filtrar elementos creando una sub-lista de ArrayList
        System.out.println("\n6. FILTRAR PRODUCTOS POR CATEGORÍA:");
        ArrayList<Producto> listaTecnologia = new ArrayList<>();

        for (Producto p : gestor.getProductos()) {
            if (p.getCategoria().equalsIgnoreCase("Tecnologia")) {
                listaTecnologia.add(p); // Agregamos a la nueva lista filtrada
            }
        }

        System.out.println("Se encontraron " + listaTecnologia.size() + " productos en la categoría 'Tecnologia':");
        for (Producto p : listaTecnologia) {
            System.out.println(" -> " + p.getNombre() + " (S/ " + p.getPrecio() + ")");
        }

        // Encontrar el índice de un elemento con .indexOf()
        System.out.println("\n7. ENCONTRAR POSICIÓN EXACTA:");

        String nombreBuscado = "Monitor Samsung";
        Producto productoEncontrado = null;

        // Buscamos el objeto por su nombre
        for (Producto p : gestor.getProductos()) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                productoEncontrado = p;
                break;
            }
        }

        if (productoEncontrado != null) {
            // Usamos .indexOf para obtener la posición exacta del objeto encontrado
            int indiceExacto = gestor.getProductos().indexOf(productoEncontrado);
            System.out.println("El producto \"" + productoEncontrado.getNombre() + "\" está ubicado exactamente en el índice: " + indiceExacto);
        } else {
            System.out.println("Producto no encontrado.");
        }

        // Ver listado de pruebas
        System.out.println("\n8. LISTADO TRAS OPERACIONES FINALES:");
        gestor.listarProductos();
        System.out.println("========================================");
    }



    public static void main(String[] args) {
        ejecutarPruebas();
    }
}