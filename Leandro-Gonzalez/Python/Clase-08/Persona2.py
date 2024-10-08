class Persona2:
    def __init__(self, nombre, apellido, edad): #Esta encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
            
    #Metodo mostrar detalles
    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}") 
        
    
    @property #decorador   
    def nombre (self): #Creamos el metodo getter (es para obtener el valor de la variable)
        print("Estamos usando el metodo get")
        return self._nombre
    
    @nombre.setter #Creamos el metodo setter (es para modificar el valor de la variable)
    def nombre(self, nombre):
        print("Estamos usando el metodo set")
        self._nombre = nombre
        
    @property #decorador
    def apellido(self): #Creamos el metodo getter
        return self._apellido
    
    @apellido.setter #Creamos el metodo setter
    def apellido(self, apellido):
        self._apellido = apellido
        
    @property #decorador
    def edad(self): #Creamos el metodo getter
        return self._edad
    
    @edad.setter #Creamos el metodo setter
    def edad(self, edad):
        self._edad = edad    
        
        

#Creamos el metodo destructor
    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")
            

if __name__ == "__main__": #Solo se ejecuta si se ejecuta este
    persona1 = Persona2("Juan", "Perez", 30)  #creamos un objeto de la clase Persona2
    print(persona1.nombre) #Llamamos al metodo getter   
    print(persona1.apellido) #Llamamos al metodo getter
    print(persona1.edad) #Llamamos al metodo getter
    persona1.nombre = "Pedro" #Llamamos al metodo setter
    print(persona1.nombre) #Llamamos al metodo getter
    print(persona1.mostrar_detalles()) #Llamamos al metodo mostrar detalles   

    #Tarea: crear 3 objetos mas, utilizando los metodos getter y setter
    #Modificar y mostrar los cambios con el metodo mostrar detalles
    persona2 = Persona2("Maria", "Gomez", 25) #objeto 1 de la tarea
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = "Ana"
    persona2.apellido = "Martinez"
    persona2.edad = 20
    print(persona2.mostrar_detalles())

    persona3 = Persona2("Carlos", "Lopez", 35) #objeto 2 de la tarea
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona3.nombre = "Roberto"
    persona3.apellido = "Sanchez"
    persona3.edad = 30
    print(persona3.mostrar_detalles())

    persona4 = Persona2("Laura", "Rodriguez", 40) #objeto 3 de la tarea
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona4.nombre = "Sofia"
    persona4.apellido = "Fernandez"
    persona4.edad = 35
    print(persona4.mostrar_detalles()) 
    
    print(__name__) #Imprime el nombre del modulo