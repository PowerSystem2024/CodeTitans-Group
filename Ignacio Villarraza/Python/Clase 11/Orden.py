from Producto import Producto #Importamos la clase Producto

#Creamos la clase Orden
class Orden:
    contador_ordenes = 0 #Variable de clase

    #Constructor de la clase
    def __init__(self, productos):
        Orden.contador_ordenes += 1 #Incremento del contador de ordenes
        self.id_orden = Orden.contador_ordenes #Asignación del id de la orden
        self._productos = list(productos) #Asignación de la lista de productos
        
        
    #Método para agregar productos a la orden
    def agregar_producto(self, producto):
        self._productos.append(producto) #Agregamos el producto a la lista de productos
        
    #Método para calcular el total de la orden
    def calcular_total(self):
        total = 0 #Variable temporal para almacenar el total de la orden
        for producto in self._productos: #Iteración sobre la lista de productos
            total += producto.precio #Suma del precio de los productos
        return total

    #Método para sobreescribir el método str
    def __str__(self):
        productos_str = '' #Variable temporal para almacenar los productos en formato string
        for producto in self._productos: #Iteramos sobre la lista de productos
            productos_str += producto.__str__() + ' | ' #Concatenamos los productos en formato string
        return f'Orden: {self.id_orden}, \nProductos: {productos_str}' #Retornamos la orden en formato string
    
#Método main solo es visible en este archivo
if __name__ == "__main__":
    producto1 = Producto("Camisa", 100.00)
    producto2 = Producto("Pantalon", 150.00)
    productos1 = [producto1, producto2] #Creamos una lista de productos
    orden1 = Orden(productos1) #Creamos una orden
    print(orden1) #Imprimimos la orden
    
    #Creamos una nueva orden con nuevos productos
    producto3 = Producto("Zapato", 200.00)
    producto4 = Producto("Gorra", 50.00)
    productos2 = [producto3, producto4] #Creamos una nueva lista de productos
    orden2 = Orden(productos2) #Creamos otra orden
    print(orden2) #Imprimimos la orden



