class Persona: # Definición de la clase
    
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): # Método constructor se lo llama init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni #atributo priv (encapsulamiento) no se puede acceder desde afuera de la clase
        self.edad = edad
        self.args = args #recibe una tupla
        self.kwargs = kwargs #recibe un diccionario
        
        
        #self es igual a this en otros lenguajes de programación
    def mostrar_detalle(self): #creamos otro metodo dentro de la clase Persona para mostrar los detalles
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad}, la direccion es: {self.args} los datos importantes son: {self.kwargs}')    


persona1 = Persona("Leandro", "Gonzalez", 26588941, 30) # Instancia de la clase Persona
#print(persona1.nombre)
#print(persona1.apellido)
#print(persona1.edad)
print(f'El objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

persona2 = Persona("Juan", "Perez", 14588478, 40) # Instancia de la clase Persona
print(f'El objeto 2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')


#modificamos el objeto persona1
persona1.nombre = "Carlos"
persona1.apellido = "Lopez"
persona1.edad = 50
print(f'El objeto 1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

#los atributos son: caracteristicas de los objetos
#los metodos son: acciones que pueden realizar los objetos

#llamamos al metodo mostrar_detalle
persona1.mostrar_detalle() #la referencia en este caso se pasa automaticamente
persona2.mostrar_detalle()

#llamamos a la clase Persona y le pasamos por parametro el metodo que queremos mostrar
#Persona.mostrar_detalle(persona1) #debemos pasarle una referencia para el self o dara error

#Agregar atributos sin que esten en la clase
persona1.telefono = "123456789" #agregamos un atributo al objeto persona1
print(f"Este es el telefono de : {persona1.nombre} {persona1.telefono}") #mostramos el atributo agregado

#print(persona2.telefono) #no podemos acceder a este atributo porque no esta en la clase (da error)

persona3 = Persona("Pedro", "Gomez", 35659107,  60, "Telefono", "3814564214", "Calle Santiago", 602, "Manzana", 12, "Casa", 22, Altura=1.80, Peso=100, CFavorito= "Negro", Auto="Citroen", Modelo=2024 )
persona3.mostrar_detalle()
#print(persona3._dni) esto no se debe utilizar en py, esto no es una buena practica (da a entender que desconocemos el lenguaje py)
# persona3.__nombre Esta totalmente encapsulado con los 2 guiones