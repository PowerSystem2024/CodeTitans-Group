class Persona: #Esta clase hereda de la clase object
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        
    @property
    def nombre(self):
     return self.__nombre
 
    @nombre.setter
    def nombre(self, nombre):
     self.__nombre = nombre 
     
    @property
    def edad(self):
     return self.__edad
 
    @edad.setter
    def edad(self, edad):
     self.__edad = edad
     
     def __str__(self): #Override del metodo __str__ de la clase object (sobreescribir)
        return f"Persona: [Nombre: {self.nombre}, Edad: {self.edad}]"
        

class Empleado(Persona): #Esta clase hereda de la clase Persona
    def __init__(self, nombre, edad, sueldo):
     super().__init__(nombre, edad)
     self.sueldo = sueldo
                
    @property
    def sueldo(self):
     return self.__sueldo
            
    @sueldo.setter
    def sueldo(self, sueldo):
     self.__sueldo = sueldo
     
     def __str__(self):
        return f"Empleado: [ Sueldo: {self.sueldo}] {super().__str__()}"


empleado1 = Empleado("Juan", 30, 50000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

empleado2 = Empleado("Ana", 35, 60000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
empleado2.nombre = "Ana Maria"
empleado2.edad = 36
empleado2.sueldo = 70000
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
