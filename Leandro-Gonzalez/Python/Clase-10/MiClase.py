class MiClase:
    # Variable de clase, se comparte entre todas las instancias
    variable_clase = "Variable de clase"
    
    def __init__(self, variable_instancia): # La variable de instancia, da diferentes valores
        self.variable_instancia = variable_instancia
        
#Agregamos un metodo estatico usando el decorador @staticmethod
    @staticmethod
    def metodo_estatico():
        print("Metodo estatico")
        print(MiClase.variable_clase)
        
#Agramos un decorador de clase, sirve para acceder a la variable de clase
    @classmethod
    def metodo_clase(cls): # cls es una referencia a la clase
        print("Metodo de clase")
        print(cls.variable_clase)        

#Creamos un metodo de instancia
    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_instancia)
        print(self.variable_clase)
        

print(MiClase.variable_clase) # Variable de clase   

#creamos un objeto
miClase1 = MiClase("Variable de instancia")     
print(miClase1.variable_instancia) # Variable de instancia
print(miClase1.variable_clase) # Variable de clase
#Creamos otro objeto
miClase2 = MiClase("Otra variable de instancia")
print(miClase2.variable_instancia) # Otra variable de instancia
print(miClase2.variable_clase) # Variable de clase

MiClase.variable_clase2 = "Variable de clase 2" # Se puede agregar una variable de clase
print(MiClase.variable_clase2) # Variable de clase 2
print(miClase1.variable_clase2) # Variable de clase 2
print(miClase2.variable_clase2) # Variable de clase 2

#Llamamos al metodo estatico
MiClase.metodo_estatico() # Metodo estatico

#Llamamos al metodo de clase
MiClase.metodo_clase() # Metodo de clase

#Creamos un objeto
miObjeto1 = MiClase("Variable de instancia")
miObjeto1.metodo_clase() # Metodo de clase
miObjeto1.metodo_estatico() # Metodo estatico
miObjeto1.metodo_instancia() # Metodo de instancia