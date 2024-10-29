#Importamos las clases Producto y Orden
from Producto import Producto
from Orden import Orden

#Creamos productos
producto1 = Producto("Camisa", 100.00)
producto2 = Producto("Pantalon", 150.00)
producto3 = Producto("Zapato", 200.00)
producto4 = Producto("Gorra", 50.00)
producto5 = Producto("Campera", 300.00)
producto6 = Producto("Remera", 250.00)
productos1 = [producto1, producto2]
orden1 = Orden(productos1)
orden1.agregar_producto(producto5)
orden1.agregar_producto(producto3)
print(orden1)
print(f"Total de la orden 1: {orden1.calcular_total()}")

productos2 = [producto3, producto4]
orden2 = Orden(productos2)
orden2.agregar_producto(producto6)
orden2.agregar_producto(producto2)
print(orden2)
print(f"Total de la orden 2: {orden2.calcular_total()}")
