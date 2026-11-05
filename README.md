# Sistema de Gestión de Inventario

## 1. Descripción del proyecto

El presente proyecto consiste en desarrollar un sistema de gestión de inventario utilizando el lenguaje de programación Java. El sistema permite administrar información de productos mediante colecciones, facilitando el almacenamiento, consulta, modificación, eliminación y ordenamiento de los registros.

El proyecto se desarrolla como parte de la evaluación PA3 del curso Programación Orientada a Objetos, aplicando los conocimientos adquiridos sobre Java Collections Framework, especialmente el uso de ArrayList y Collections.

## 2. Objetivo del proyecto

Desarrollar una aplicación en Java que permita gestionar productos almacenados en memoria, aplicando colecciones y sus principales operaciones.

**Objetivos específicos:**

- Crear una colección para almacenar objetos de tipo Producto.
- Registrar y visualizar información de los productos.
- Recuperar registros mediante su posición.
- Buscar, modificar y eliminar productos.
- Aplicar operaciones de ordenamiento utilizando Collections.

## 3. Tecnologías utilizadas

Para el desarrollo del proyecto se utilizaron las siguientes herramientas:

- Lenguaje de programación: Java.
- Versión del JDK: 21.
- Entorno de desarrollo: IntelliJ IDEA.
- Gestión del proyecto: Maven.
- Control de versiones: Git y GitHub.

## 4. Estructura del proyecto

El proyecto se encuentra organizado de la siguiente manera:

```text
PA3/
│
├── src/
│   └── main/
│       └── java/
│           └── pe/
│               └── edu/
│                   └── isil/
│                       └── inventario/
│                           ├── Main.java
│                           ├── Producto.java
│                           └── OperacionesArrayList.java
│
├── .gitignore
├── pom.xml
└── README.md
```

## 5. Descripción de las clases

### Producto.java

Esta clase representa los productos que forman parte del inventario. Contiene los siguientes atributos:

- id: identificador del producto.
- nombre: nombre del producto.
- categoria: categoría a la que pertenece.
- precio: precio del producto.
- stock: cantidad disponible.

También contiene el constructor, los métodos getters y setters, y el método toString() para mostrar la información de cada producto.

### Main.java

Es la clase principal del proyecto. Se encarga de crear la colección de productos, cargar los datos iniciales y ejecutar las diferentes operaciones de gestión y ordenamiento.

### OperacionesArrayList.java

Contiene operaciones adicionales sobre la colección, como la búsqueda por nombre, modificación de registros, filtrado por categoría y recuperación de posiciones.

### OperacionesCollections.java

Aplica operaciones de la clase Collections sobre una copia de la lista de productos: ordena por stock, invierte el orden y obtiene el producto más caro y el más barato. Al final comprueba que cada operación haya dado el resultado esperado.

## 6. Funcionalidades implementadas

El sistema contempla las siguientes operaciones:

| Funcionalidad | Descripción |
|---|---|
| Almacenamiento | Utiliza ArrayList para guardar los productos en memoria. |
| Listado | Muestra los productos registrados. |
| Recuperación | Obtiene un producto mediante su posición dentro de la colección. |
| Búsqueda | Permite localizar productos mediante su identificador o nombre. |
| Eliminación | Elimina un producto mediante su identificador. |
| Modificación | Permite actualizar los datos de un producto. |
| Filtrado | Muestra productos según su categoría. |
| Ordenamiento | Ordena los productos por precio y nombre utilizando Collections.sort(). |
| Operaciones con Collections | Ordena por stock, invierte el orden con Collections.reverse() y obtiene el producto más caro y más barato con Collections.max() y Collections.min(). |

## 7. Datos utilizados para las pruebas

Para comprobar el funcionamiento del sistema se utilizaron los siguientes productos:

| ID | Producto | Categoría | Precio | Stock |
|---|---|---|---:|---:|
| 1 | Laptop Lenovo | Tecnología | 2500.00 | 10 |
| 2 | Mouse Logitech | Accesorios | 85.50 | 25 |
| 3 | Teclado Mecánico | Accesorios | 150.00 | 15 |
| 4 | Monitor Samsung | Tecnología | 750.00 | 8 |
| 5 | Audífonos Sony | Audio | 220.00 | 12 |

## 8. Instrucciones de ejecución

Para ejecutar el proyecto es necesario contar con Java JDK 21 e IntelliJ IDEA.

**Procedimiento:**

1. Descargar o clonar el repositorio de GitHub:

   ```bash
   git clone https://github.com/Anleg1/PA3.git
   ```

2. Abrir IntelliJ IDEA y seleccionar la opción Open.

3. Seleccionar la carpeta del proyecto PA3.

4. Esperar a que IntelliJ IDEA cargue la configuración de Maven.

5. Ubicar el archivo Main.java dentro del paquete pe.edu.isil.inventario.

6. Ejecutar el archivo seleccionando la opción Run Main.

7. Verificar los resultados de las operaciones en la consola.

## 9. Justificación del uso de colecciones

Se eligió ArrayList porque permite almacenar una cantidad variable de elementos y acceder a ellos mediante posiciones. Además, cuenta con métodos que facilitan la recuperación, modificación y eliminación de información.

También se utilizó la clase Collections para ordenar los productos según diferentes criterios, como el precio y el nombre.

El uso de estas herramientas permite organizar mejor la información y realizar operaciones de manera sencilla, sin necesidad de implementar estructuras de almacenamiento más complejas.

### Ventajas de utilizar Collections

- Trae métodos listos para ordenar, invertir y obtener el mayor o el menor, así que no hace falta programar esos algoritmos a mano.
- Con un comparador se puede ordenar la misma lista por distintos criterios (precio, nombre o stock) sin modificar la clase Producto.
- El código queda más corto y fácil de leer, y hay menos posibilidad de errores.
- Sus métodos trabajan con cualquier lista, no solo con ArrayList.

## 10. Integrantes del equipo

1. Jorge Jerson Benito Mayhua
2. Franco Andrés Diaz Carreal
3. Miguel Angel Caycho Roque
4. David Jared Damazo Valdeos

## 11. Video de exposición

En el siguiente enlace se encuentra el video de exposición grupal, donde se presenta el desarrollo del proyecto, las funcionalidades implementadas y las decisiones tomadas durante su elaboración.

**Enlace del video:** [Agregar enlace de YouTube]

## 12. Repositorio

**GitHub:** https://github.com/Anleg1/PA3

---

**Curso:** Programación Orientada a Objetos  
**Evaluación:** PA3  
**Institución:** ISIL  
**Proyecto:** Sistema de Gestión de Inventario
