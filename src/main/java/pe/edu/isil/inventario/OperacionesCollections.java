package pe.edu.isil.inventario;

import java.util.ArrayList;
import java.util.Collections;

public class OperacionesCollections {

    // Recibe la lista de productos del Main y trabaja sobre una copia
    // para no cambiar el orden de la lista original
    public static void ejecutarOperaciones(ArrayList<Producto> productos) {

        System.out.println("\n========================================");
        System.out.println("   OPERACIONES CON COLLECTIONS");
        System.out.println("========================================");

        if (productos.isEmpty()) {
            System.out.println("No hay productos para procesar.");
            return;
        }

        ArrayList<Producto> lista = new ArrayList<>(productos);

        // 1. Ordenar por stock de menor a mayor con Collections.sort()
        System.out.println("\n1. ORDENAR POR STOCK (MENOR A MAYOR):");
        Collections.sort(lista, (p1, p2) ->
                Integer.compare(p1.getStock(), p2.getStock())
        );
        mostrar(lista);
        boolean pruebaSort = estaOrdenadoPorStock(lista, true);

        // 2. Invertir el orden con Collections.reverse()
        System.out.println("\n2. INVERTIR ORDEN (MAYOR A MENOR STOCK):");
        Collections.reverse(lista);
        mostrar(lista);
        boolean pruebaReverse = estaOrdenadoPorStock(lista, false);

        // 3. Producto mas caro y mas barato con Collections.max() y Collections.min()
        System.out.println("\n3. PRODUCTO MAS CARO Y MAS BARATO:");
        Producto masCaro = Collections.max(lista, (p1, p2) ->
                Double.compare(p1.getPrecio(), p2.getPrecio())
        );
        Producto masBarato = Collections.min(lista, (p1, p2) ->
                Double.compare(p1.getPrecio(), p2.getPrecio())
        );
        System.out.println("Mas caro: " + masCaro);
        System.out.println("Mas barato: " + masBarato);

        boolean pruebaMaxMin = true;
        for (Producto p : lista) {
            if (p.getPrecio() > masCaro.getPrecio() || p.getPrecio() < masBarato.getPrecio()) {
                pruebaMaxMin = false;
            }
        }

        // 4. Comprobar que cada operacion dio el resultado esperado
        System.out.println("\n4. PRUEBA DE LAS OPERACIONES:");
        System.out.println("Collections.sort()    -> " + (pruebaSort ? "correcto" : "error"));
        System.out.println("Collections.reverse() -> " + (pruebaReverse ? "correcto" : "error"));
        System.out.println("Collections.max/min() -> " + (pruebaMaxMin ? "correcto" : "error"));

        System.out.println("========================================");
    }

    private static void mostrar(ArrayList<Producto> lista) {
        for (Producto p : lista) {
            System.out.println(p);
        }
    }

    // Revisa el stock elemento por elemento
    private static boolean estaOrdenadoPorStock(ArrayList<Producto> lista, boolean menorAMayor) {
        for (int i = 0; i < lista.size() - 1; i++) {
            int actual = lista.get(i).getStock();
            int siguiente = lista.get(i + 1).getStock();
            if (menorAMayor && actual > siguiente) {
                return false;
            }
            if (!menorAMayor && actual < siguiente) {
                return false;
            }
        }
        return true;
    }
}