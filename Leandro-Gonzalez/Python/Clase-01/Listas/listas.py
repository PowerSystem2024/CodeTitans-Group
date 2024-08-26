#Clase 1 practica con "listas"
#Las listas son "Mutables" se pueden modificar

#Lista con nombres
nombres = ["Juan", "Pablo", "Leandro", "Agustin", "Maria"]

#Imprimimos todos los nombres por consola
print(nombres)

#Imprimimos el primer nombre
print(nombres[0])

#Imprimimos el ultimo nombre
print(nombres[-1])

#Recuperar un rango de la lista
print(nombres[0:2]) #Solo muestra el indice 0, 1 pero no el indice 2

#Ir del inicio de la lista al indice (sin incluirlo)
print(nombres[:3]) #Indices a mostrar 0, 1, 2

#Desde el indice indicado hasta el final.
print(nombres[1:])

#Modificamos un valor
nombres[3] = "Maria"
nombres[0] = "Leandro"
print(nombres)

#Iterar una lista
for nombre in nombres: #Nombre es singular, la lista es plural
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

#Preguntarnos cuantos elementos tiene una lista
print(len(nombres)) #Le pasamos como parametro la lista

#Agregamos un elemento a nuestra lista
nombres.append("Raul") #"append" agrega un elemento al final de la lista
print(nombres)

#Insertar un elemento en un indice especifico
nombres.insert(1, "Marcelo") #"Insert" agrega un elemento al principio y corre el primer elemento a la derecha
print(nombres)
nombres.insert(3, "Paula")
print(nombres)

#Eliminar elementos
nombres.remove("Raul") #"Remove" elimina el elemento que le pasamos por parametro
print(nombres)

#Eliminar el ultimo elemento de la lista
nombres.pop() #"Pop" elimina el ultimo elemento de la lista
print(nombres)

#Eliminar un indice especifico
del nombres[2] #"Del" elimina el elemento especifico de la lista
print(nombres)

#Eliminar o limpiar todos los elementos de la lista
nombres.clear() #"Clear" elimina todo el contenido de la lista
print(nombres)

#Eliminar la lista completa
del nombres
print(nombres)