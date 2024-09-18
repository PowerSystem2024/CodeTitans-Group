#Tipo "set" (conjunto)
planetas = {"Marte", "Jupiter", "Venus"}
print(planetas)
print(len(planetas)) #"len" nos muestra el largo de nuestro set
print("Marte" in planetas) #Revisar si un elemento existe dentro del set (Devuelve un booleano)

#Agregar un elemento a nuestro set
planetas.add("Tierra") # add es una funcion (No se pueden agregar elementos duplicados). Se podria utilizar para guardar num de "DNI"
print(planetas)

#Eliminar elementos (Da error si el elemento no existe)
planetas.remove("Jupiter") #No da error
#planetas.remove("jupiter") #Da error por que no "existe"
print(planetas)

planetas.discard("Tierra") #No da error si el elemento esta mal ingresado, pero no borra 
print(planetas)

#Limpiar set
planetas.clear() #Borra el contenido de nuestro set
print(planetas)

#Eliminar set por completo
del planetas
print(planetas) #Da error por que nuestro set ya no existe