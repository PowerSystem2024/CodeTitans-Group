package codesystem.ventas.test;

import codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 20000.00);
        Producto producto2 = new Producto("Camisa", 15000.00);
        Producto producto3 = new Producto("Zapatos", 25000.00);
        Producto producto4 = new Producto("Gorra", 5000.00);
        Producto producto5 = new Producto("Medias", 10000.00);
        Producto producto6 = new Producto("Campera", 30000.00);
        Producto producto7 = new Producto("Saco", 40000.00);
        Producto producto8 = new Producto("Abrigo", 50000.00);
        Producto producto9 = new Producto("Gorro de lana", 6000.00);
        Producto producto10 = new Producto("Bufanda", 7000.00);

        // Creamos la orden de la clase orden
        Orden orden1 = new Orden();
        // Agregamos productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden(); // Mostramos la orden

        // Creamos la segunda orden
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.mostrarOrden();

        // Creamos la tercera orden
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto10);
        orden3.mostrarOrden();
    }
}
