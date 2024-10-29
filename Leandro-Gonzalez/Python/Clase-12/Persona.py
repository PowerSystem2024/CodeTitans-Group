#Creamos la clase Persona
class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other): #other puede recibir otro nombre, por ejemplo "otro
        return f"{self.nombre} {other.nombre}"
    
    def __sub__(self, otro): #Sub es para restar (Sub =substraccion)
        return self.edad - otro.edad
    
persona1 = Persona("Juan", 25)
persona2 = Persona("Carlos", 5)
print(persona1 + persona2)
print(persona1 - persona2)

#pesona1.__add__(persona2) Esta seria la sintaxis interna y automatica

