class MiClase:
    # Variable de clase, se comparte entre todas las instancias
    variable_clase = "Variable de clase"
    
    def __init__(self, variable_instancia): # La variable de instancia, da diferentes valores
        self.variable_instancia = variable_instancia
        

print(MiClase.variable_clase) # Variable de clase   

#creamos un objeto
miClase = MiClase("Variable de instancia")     
print(miClase.variable_instancia) # Variable de instancia
print(miClase.variable_clase) # Variable de clase
#Creamos otro objeto
miClase2 = MiClase("Otra variable de instancia")
print(miClase2.variable_instancia) # Otra variable de instancia
print(miClase2.variable_clase) # Variable de clase

