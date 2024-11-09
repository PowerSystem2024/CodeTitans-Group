#from mundo_pc.dispositivo_entrada import DispositivoEntrada (Esto esta mal)
from dispositivo_entrada import DispositivoEntrada #Esto esta bien

class Teclado(DispositivoEntrada):
    
    contador_teclados = 0

    def __init__(self, marca, tipo_entrada):
        Teclado.contador_teclados += 1 
        self._id_teclado = Teclado.contador_teclados
        super().__init__(marca, tipo_entrada)

    def __str__(self):
        return f"id: {self._id_teclado}, Marca: {self._marca}, Tipo entrada: {self._tipo_entrada}"
    
    #Creamos los getters y setters
    @property
    def id_teclado(self):
        return self._id_teclado
    
    @id_teclado.setter
    def id_teclado(self, id_teclado):
        self._id_teclado = id_teclado
        
    @property
    def marca(self):
        return self._marca
    
    @marca.setter
    def marca(self, marca):
        self._marca = marca
        
    @property
    def tipo_entrada(self):
        return self._tipo_entrada
    
    @tipo_entrada.setter
    def tipo_entrada(self, tipo_entrada):
        self._tipo_entrada = tipo_entrada
        
    
    #Creamos objetos de la clase teclado    
if __name__ == "__main__":
    teclado1 = Teclado("HP", "USB")
    print(teclado1)
    teclado2 = Teclado("Gamer", "Bluetooth")
    print(teclado2)
        