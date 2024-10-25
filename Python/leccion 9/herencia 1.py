class persona: # esta clase hereda la clase object
    def __init__ (self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

class empleado(persona): #esta clase es hija de la clase persona
    def __init__(empleado, sueldo, nombre, edad, self):
        super(). __init__ (nombre, edad)
        self.sueldo = sueldo

empleado1 = empleado(75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)