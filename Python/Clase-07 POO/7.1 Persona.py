class Persona: #Creacion de una clase
    def __init__(self, nombre, apellido, edad, dni, *args, **kwargs):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self._dni = dni
        self.args = args
        self.kwargs = kwargs
    def mostrar_detalle(self):
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido}, dni: {self._dni}, {self.edad} años, la direccion es: {self.args}, los datos importantes son: {self.kwargs}')

persona1 = Persona("Juan", "Perez", 30, 40897654)
persona2 = Persona("Juana", "Garcia", 25, 45998877)

#Persona.mostrar_detalle(persona1) #Debemos pasarle una referencia sino nos dara error
persona1.telefono = '123456789'
print(f'El numero de telefono de {persona1.nombre} es: {persona1.telefono}')
#(f'El numero de telefono de {persona2.nombre} es: {persona2.telefono}') #Esto nos dara error porque persona2 no tiene un atributo telefono
persona3 = Persona( "Fernando", "Fernandez", "24", 33445566 , "Telefono", "4444555777", "Calle Sin Nombre", "Numero 10", 834, "Manzana 2", altura= 185, peso= 79, color_fav="Azul", auto_fav="Ferrari")
persona3.mostrar_detalle()
print(persona3._dni) # No tira error, pero no es una accion sugerida, se considera una mala practica.
# Para que un atributo este completamente encapsulado se necesita colocar __ (doble guion bajo)
