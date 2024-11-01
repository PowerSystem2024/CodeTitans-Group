#Creamos la clase producto
class Producto:
    contador_productos = 0 #Variable de clase

    #Constructor de la clase
    def __init__(self, nombre, precio):
        Producto.contador_productos += 1 #Incremento del contador de productos
        self._id_producto = Producto.contador_productos #Asignación del id del producto
        self._nombre = nombre #Asignación del nombre del producto
        self._precio = precio #Asignación del precio del producto

    #Métodos getters y setters
    
    #Método para obtener el nombre del producto
    @property
    def nombre(self):
        return self._nombre
    
    #Método para establecer el nombre del producto
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    #Método para obtener el precio del producto
    @property
    def precio(self):
        return self._precio
    
    #Método para establecer el precio del producto
    @precio.setter
    def precio(self, precio):
        self._precio = precio

    #Método para sobreescribir el método str
    def __str__(self):
        return f"Producto [Id: {self._id_producto}, Nombre: {self._nombre}, Precio: {self._precio}]"
    
    
#Método main solo es visible en este archivo
if __name__ == "__main__":
    producto1 = Producto("Camisa", 100.00)
    print(producto1)

    producto2 = Producto("Pantalon", 150.00)
    print(producto2)
