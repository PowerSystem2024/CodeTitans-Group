#Creamos una clase
class Persona:
    contador_personas = 0 # Variable de clase
    
    #Agregamos el decorador classmethod (contexto estatico)
    @classmethod
    def generar_siguiente_valor(cls): # cls es una referencia a la clase
        cls.contador_personas += 1 # Incrementamos el contador de personas
        return cls.contador_personas # Retornamos el contador de personas
    
    def __init__(self, nombre, edad): #Metodo init, es el constructor de la clase (contexto dinamico)
        self.id_persona = Persona.generar_siguiente_valor() # Asignamos el id de la persona a partir del contador
        self.nombre = nombre # Asignamos el nombre
        self.edad = edad # Asignamos la edad
        
        
    #Metodo para mostrar los datos de la persona
    def __str__(self):
        return f'Persona [{self.id_persona}, {self.nombre}, {self.edad}]'    
    
    
#Comenzamos con la instancia de objetos
persona1 = Persona("Juan", 28) # Creamos una persona 
print(persona1)   
persona2 = Persona("Carla", 30) # Creamos otra persona
print(persona2)
persona3 = Persona("Eduardo", 45) # Creamos otra persona
print(persona3)
Persona.generar_siguiente_valor() # Incrementamos el contador de personas
persona4 = Persona("Marta", 33) # Creamos otra persona , el id debe ser 5
print(persona4)

#Print para ver el contador de personas
print(f'Cantidad de personas: {Persona.contador_personas}')

