 #tarea: modificar la orden2, ingresando nuevos productos con sus nombre y precios
    #crear una lista de productos y agregarle a la orden2

class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

class Orden:
    contador_ordenes = 0
    
    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)
    
    def agregar_producto(self, producto):
        self._productos.append(producto)  # Agregar un nuevo producto
    
    def calcular_total(self):
        total = 0  # Variable temporal para almacenar el total
        for producto in self._productos:
            total += producto.precio
        return total
    
    def __str__(self):
        productos_str = ""
        for producto in self._productos:
            productos_str += f"{producto.nombre} (${producto.precio}) | "
        return f"Orden: {self.id_orden}, \nProductos: {productos_str.strip(' | ')}"

if __name__ == "__main__":
    producto1 = Producto("Camiseta", 100.00)
    producto2 = Producto("Pantalón", 150.00)
    productos1 = [producto1, producto2]  # Lista de productos
    orden1 = Orden(productos1)  # Primer objeto orden pasando la lista de productos
    print(orden1)
    print(f"Total: ${orden1.calcular_total()}")
    
    # Crear la segunda orden
    orden2 = Orden(productos1)
    print(orden2)
    print(f"Total: ${orden2.calcular_total()}")

    # Crear nuevos productos para la orden2
    producto3 = Producto("Zapatos", 200.00)
    producto4 = Producto("Gorra", 50.00)
    
    # Agregar los nuevos productos a la orden2
    orden2.agregar_producto(producto3)
    orden2.agregar_producto(producto4)

    # Imprimir la orden2 después de agregar los nuevos productos
    print(orden2)
    print(f"Total actualizado: ${orden2.calcular_total()}")