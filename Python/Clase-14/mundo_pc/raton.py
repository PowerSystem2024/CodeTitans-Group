#from mundo_pc.dispositivo_entrada import DispositivoEntrada (Esto esta mal)
from dispositivo_entrada import DispositivoEntrada #Esto esta bien

class Raton(DispositivoEntrada):

    contador_ratones = 0
    
    def __init__(self, marca, tipo_entrada):
        Raton.contador_ratones += 1
        self._id_raton = Raton.contador_ratones
        super().__init__(marca, tipo_entrada)
        

    def __str__(self):
        return f"id: {self._id_raton}, Marca: {self._marca}, Tipo Entrada: {self._tipo_entrada}"
        
        
    #Creamos los getters y setters
    @property
    def id_raton(self):
        return self._id_raton
    
    @id_raton.setter
    def id_raton(self, id_raton):
        self._id_raton = id_raton
        
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

#hacemos pruebas
if __name__ == "__main__":
    raton1 = Raton("HP", "USB")
    print(raton1)
    raton2 = Raton("Acer", "Bluetooth")
    print(raton2)