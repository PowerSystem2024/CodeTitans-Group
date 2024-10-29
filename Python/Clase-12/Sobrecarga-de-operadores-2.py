class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other): #other significa = otro
        return self.nombre + other.nombre
    

persona1 = Persona("martiniano", 40)
persona2 = Persona("zallocco", 5)

#persona1.__add__(persona) sintaxis interna y automatica

print(persona1 + persona2)
print(persona1 - persona2)