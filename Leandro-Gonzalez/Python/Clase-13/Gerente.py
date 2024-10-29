#Importamos la clase Empleado
from Empleado import Empleado

#Creamos la clase Gerente
class Gerente(Empleado): #Hereda de la clase Empleado
    def __init__(self, nombre, sueldo, departamento):
        super().__init__(nombre, sueldo)
        self.departamento = departamento
        
    def __str__(self):
        return f"Gerente: {self.nombre}, Sueldo: {self.sueldo}, Departamento: {self.departamento}"
    

