package pe.edu.isil.inventario;

import java.util.ArrayList;

/**
 * Integrante Jorge: creación y almacenamiento de datos.
 *
 * Esta clase encapsula la colección principal (ArrayList<Producto>)
 * donde se guardan todos los productos en memoria. Se encarga de:
 *  - crear la colección,
 *  - cargar los datos iniciales,
 *  - registrar nuevos productos,
 *  - listar los registros,
 *  - verificar que los datos se almacenaron correctamente.
 */
public class GestorProductos {

    // Colección principal donde se almacenan los productos
    private ArrayList<Producto> productos;

    public GestorProductos() {
        this.productos = new ArrayList<>();
    }

    // ========================================
    // CARGA INICIAL DE DATOS
    // ========================================

    public void cargarDatosIniciales() {
        productos.add(new Producto(1, "Laptop Lenovo", "Tecnologia", 2500.00, 10));
        productos.add(new Producto(2, "Mouse Logitech", "Accesorios", 85.50, 25));
        productos.add(new Producto(3, "Teclado Mecanico", "Accesorios", 150.00, 15));
        productos.add(new Producto(4, "Monitor Samsung", "Tecnologia", 750.00, 8));
        productos.add(new Producto(5, "Audifonos Sony", "Audio", 220.00, 12));
    }

    // ========================================
    // REGISTRAR NUEVOS PRODUCTOS
    // ========================================

    /**
     * Registra un producto nuevo en la colección.
     * No permite ID repetidos ni precio/stock negativos.
     *
     * @return true si se registró, false si no cumplió las validaciones
     */
    public boolean registrarProducto(int id, String nombre, String categoria,
                                     double precio, int stock) {

        if (existeId(id)) {
            System.out.println("No se registro: ya existe un producto con ID " + id + ".");
            return false;
        }

        if (precio < 0 || stock < 0) {
            System.out.println("No se registro: el precio y el stock no pueden ser negativos.");
            return false;
        }

        productos.add(new Producto(id, nombre, categoria, precio, stock));
        System.out.println("Producto registrado correctamente: " + nombre);
        return true;
    }

    // Revisa si ya hay un producto con ese ID en la colección
    private boolean existeId(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // ========================================
    // LISTAR REGISTROS
    // ========================================

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("Total de productos: " + productos.size());
    }

    // ========================================
    // VERIFICAR ALMACENAMIENTO
    // ========================================

    /**
     * Comprueba que la cantidad de productos guardados en la colección
     * coincide con la cantidad esperada.
     */
    public boolean verificarAlmacenamiento(int cantidadEsperada) {
        int cantidadReal = productos.size();
        boolean correcto = (cantidadReal == cantidadEsperada);

        System.out.println("Productos esperados: " + cantidadEsperada);
        System.out.println("Productos almacenados: " + cantidadReal);
        System.out.println(correcto
                ? "Verificacion correcta: los datos se almacenaron bien."
                : "Verificacion fallida: la cantidad no coincide.");

        return correcto;
    }

    // ========================================
    // ACCESO A LA COLECCION
    // ========================================

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
