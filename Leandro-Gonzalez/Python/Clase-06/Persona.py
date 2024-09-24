class Persona: # Definición de la clase
    
    def __init__(self, nombre, apellido, edad): # Método constructor se lo llama init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        
    def mostrar_detalle(self): #creamos otro metodo dentro de la clase Persona para mostrar los detalles
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')    


persona1 = Persona("Leandro", "Gonzalez", 30) # Instancia de la clase Persona
#print(persona1.nombre)
#print(persona1.apellido)
#print(persona1.edad)
print(f'El objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

persona2 = Persona("Juan", "Perez", 40) # Instancia de la clase Persona
print(f'El objeto 2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')


#modificamos el objeto persona1
persona1.nombre = "Carlos"
persona1.apellido = "Lopez"
persona1.edad = 50
print(f'El objeto 1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

#los atributos son: caracteristicas de los objetos
#los metodos son: acciones que pueden realizar los objetos

#llamamos al metodo mostrar_detalle
persona1.mostrar_detalle()
persona2.mostrar_detalle()
