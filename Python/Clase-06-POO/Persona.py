class Persona: #Creacion de una clase
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):
        print(f'Persona: {self.nombre} {self.apellido}, {self.edad} años')
#Atributos = Caracteristicas
#Metodos = Acciones
persona1 = Persona("Juan", "Perez", 30) # Instancia de clase, se necesitan argumentos.
# print(f'Nombre: {persona1.nombre} {persona1.apellido}, Edad: {persona1.edad}')
persona1.mostrar_detalle()

persona2 = Persona("Juana", "Garcia", 25)
# print(f'Nombre: {persona2.nombre} {persona2.apellido}, Edad: {persona2.edad}')
persona2.mostrar_detalle()
persona1.nombre = "Juan Carlos"
persona1.apellido = "Gonzalez"
persona1.edad = 45

#print(f'Nombre (Modificado de la Persona 1): {persona1.nombre} {persona1.apellido}, Edad: {persona1.edad}')
persona1.mostrar_detalle()
