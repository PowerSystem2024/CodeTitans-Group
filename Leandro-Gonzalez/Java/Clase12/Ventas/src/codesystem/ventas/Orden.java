package codesystem.ventas;

public class Orden {
    // Atributos de la clase
    private int idOrden;
    private Producto productos[]; // Arreglo de objetos declarado
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    // Constructor vacio
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes; // Incrementa el contador de ordenes y asigna el valor al idOrden
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; // Inicializa el arreglo de productos
    }

    // Metodo que combina la clase Producto con la clase Orden
    public void agregarProducto(Producto producto) {
        // Verifica si el contador de productos es menor que el maximo de productos
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            // Agrega el producto al arreglo e incrementa el contador
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

    // Metodo para calcular el total de la orden
    public double calcularTotal() {
        double total = 0; // Inicializa el total en 0
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio(); // Suma el precio de cada producto al total
        }
        return total;
    }

    // Metodo para mostrar los datos de la orden
    public void mostrarOrden() {
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Total de la orden: $" + this.calcularTotal());
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]); // Muestra los productos de la orden
        }
    }

}
