#Creamos la clase Empleado
class Empleado: #No hereda de ninguna otra clase, solo de la clase Object
    def __init__(self, nombre, sueldo):
        self.nombre = nombre
        self.sueldo = sueldo
        
    def __str__(self):
        return f"Empleado: {self.nombre}, Sueldo: {self.sueldo}"
    
    def mostrar_detalles(self): #Metodo para mostrar el detalle del empleado
        return self.__str__()

