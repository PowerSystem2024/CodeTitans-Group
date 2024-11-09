package codesystem.ventas;

public class Producto {
    // Atributos de la clase
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    // Constructor vacio privado
    private Producto() {
        // Incrementa el contador de productos y asigna el valor al idProducto
        this.idProducto = ++Producto.contadorProductos;
    }

    // Constructor con parametros
    public Producto(String nombre, double precio) {
        this(); // Llamada al constructor vacio para asignar el idProducto
        this.nombre = nombre;
        this.precio = precio;
    }

    // Metodos get y set
    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
}
