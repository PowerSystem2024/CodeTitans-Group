
# para inicializar los objetos usamos el metodo init Dunder ya predefinido para inicializar un objeto

class Persona:  #Creamos una clase


    # usamos atributos dentro de un metodo

    def __init__(self, nombre, apellido, edad):  # self referencia al objeto que se va a crear
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    # para acceder a los atributos dentro de un metodo para acceder a otro metodo dentro de la misma clase usamos self
    def mostrar_detalle(self):  # self es igual a this, se le puede cambiar el nombre
        print(f'Persona: {self.nombre} {self.apellido} {self.edad} ')


persona1 = Persona("Ariel", "Betancud", 40)  #constructor que apunta indirectamente al metodo init

print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona("Osvaldo", "Giodanini", 45)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es:{persona2.edad}')
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es:{persona1.edad}')

persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40

print(f'El objeto1 de la clase persona: {persona1.nombre}{persona1.apellido} Su edad es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los metodos son: el comportamiento que van a tener los objetos (acciones)

persona1.mostrar_detalle()
persona2.mostrar_detalle()

Persona.mostrar_detalle(persona1)  # Debemos pasarle una referencia para el self o dara un error

# En Python se le pueden agregar atributos al objeto sin tener cargado los atributos en el metodo de la clasa pero no
# se puede hacer uso en otro objeto
persona1.telefono = '523443256'
print(f'Este es el telefono: {persona1.nombre} {persona1.telefono}') #hemos creado un atributo de una objeto

# print(persona2.telefono) aqui no se puede acceder al atributo creado en otro objeto
