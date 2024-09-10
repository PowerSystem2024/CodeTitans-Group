#Agregar personajes a una lista
#Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos

#Nombre: Aragon
#Clase: Guerrero
#Raza: Dunadan del norte

#Nombre: Gandalf
#Clase: Mago
#Raza: Istar

#Nombre: Legolas
#Clase: Arquero
#Raza: Elfo Sindar

#Lista vacia donde se van a guardar los personjes
personajes = []

# Agregamos los personajes a la lista como diccionarios
personajes.append({"Nombre": "Aragorn", "Clase": "Guerrero", "Raza": "Dunadan del norte"})
personajes.append({"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"})
personajes.append({"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo Sindar"})
personajes.append({"Nombre": "Frodo", "Clase": "Portador del Anillo", "Raza": "Hobbit"})
personajes.append({"Nombre": "Sam", "Clase": "Jardinero", "Raza": "Hobbit"})
personajes.append({"Nombre": "Gimli", "Clase": "Guerrero", "Raza": "Enano"})

# Mostramos la lista de personajes
for personaje in personajes:
    print(f"Nombre: {personaje['Nombre']}, Clase: {personaje['Clase']}, Raza: {personaje['Raza']}")

