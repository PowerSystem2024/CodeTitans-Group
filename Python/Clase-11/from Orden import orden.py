from Orden import orden
from Producto import producto

producto1 = producto("camiseta", 100.00)
producto2 = producto("pantalon", 150.00)
producto3 = producto("medias", 45.00)
producto4 = producto("campera", 250.00)
producto5 = producto("sweter", 95.00)
producto6 = producto("blusa", 75.00)

productos1 = [producto1, producto2] #lista de productos
orden1 = orden(productos1) #primer objeto orden pasando la lista de productos
orden1.agregar_producto(producto5)
orden1.agregar_producto(producto3)
print(orden1)
print(f"total de la orden1: {orden1.calcular_total()} ")
orden2 =orden(producto2)
orden2.agregar_producto(producto6)
orden2.agregar_producto(producto2)
print(orden2)
print(f"total de la orden2: {orden2.calcular_total()} ")