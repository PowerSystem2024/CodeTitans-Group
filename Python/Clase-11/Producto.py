class producto:
    contador_productos = 0

    def __init__(self, nombre, precio):
        producto.contador_productos += 1
        self._id_producto = producto.contador_productos
        self._nombre = nombre
        self._precio = precio

@property
def nombre(self):
    return self._nombre

@nombre.setter
def nombre(self, nombre):
    self._nombre = nombre

@property
def precio(self):
    return self._precio

@precio.setter
def precio(self, precio):

    def __str__(self):
        return f"id producto: {self._id_producto}, nombre: {self._nombre}, precio: {self._precio}"
    
if __name__ == "__main__": #solo sera visible si la prueba se ejecuta desde aqui
    producto1 = producto("camiseta", 100.00)
    producto2 = producto("pantalon", 150.00)