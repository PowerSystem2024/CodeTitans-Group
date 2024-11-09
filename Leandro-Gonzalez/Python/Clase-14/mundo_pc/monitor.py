class Monitor:

    contadores_monitores = 0 
    
    def __init__(self, marca, tamaño):
        Monitor.contadores_monitores += 1
        self._id_monitor = Monitor.contadores_monitores
        self._marca = marca
        self._tamaño = tamaño

    def __str__(self):
        return f"id: {self._id_monitor}, Marca: {self._marca}, Tamaño: {self._tamaño}"
    
    
    #Creamos los getters y setters
    @property
    def id_monitor(self):
        return self._id_monitor
    
    @id_monitor.setter
    def id_monitor(self, id_monitor):
        self._id_monitor = id_monitor
        
    @property
    def marca(self):
        return self._marca
    
    @marca.setter
    def marca(self, marca):
        self._marca = marca
        
    @property
    def tamaño(self):
        return self._tamaño
    
    @tamaño.setter
    def tamaño(self, tamaño):
        self._tamaño = tamaño
        
        
#Creamos objetos de la clase monitor    
if __name__ == "__main__":
    monitor1 = Monitor("HP", "15 Pulgadas")
    print(monitor1)
    monitor2 = Monitor("Acer", "27 Pulgadas")
    print(monitor2)