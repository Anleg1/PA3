package pe.edu.isil.inventario;

/**
 * Integrante 2: prueba de creación y almacenamiento de datos.
 * Ejecutar esta clase para demostrar el trabajo de la parte 2.
 */
public class PruebaAlmacenamiento {

    public static void main(String[] args) {

        GestorProductos gestor = new GestorProductos();

        System.out.println("========================================");
        System.out.println("   CREACION Y ALMACENAMIENTO DE DATOS");
        System.out.println("========================================");

        // 1. Carga inicial
        System.out.println("\n1. CARGA INICIAL DE DATOS:");
        gestor.cargarDatosIniciales();
        gestor.listarProductos();

        // 2. Registrar nuevos productos
        System.out.println("\n2. REGISTRO DE NUEVOS PRODUCTOS:");
        gestor.registrarProducto(6, "Webcam Logitech", "Accesorios", 180.00, 20);
        gestor.registrarProducto(7, "Parlante JBL", "Audio", 320.00, 9);

        // 3. Probar validaciones
        System.out.println("\n3. PRUEBA DE VALIDACIONES:");
        gestor.registrarProducto(1, "Producto Repetido", "Varios", 10.00, 1);
        gestor.registrarProducto(8, "Producto Invalido", "Varios", -5.00, 3);

        // 4. Listado final
        System.out.println("\n4. LISTADO ACTUALIZADO:");
        gestor.listarProductos();

        // 5. Verificar almacenamiento (5 iniciales + 2 nuevos = 7)
        System.out.println("\n5. VERIFICACION DE ALMACENAMIENTO:");
        gestor.verificarAlmacenamiento(7);

        System.out.println("\n========================================");
        System.out.println("             FIN DE LA PRUEBA");
        System.out.println("========================================");
    }
}
