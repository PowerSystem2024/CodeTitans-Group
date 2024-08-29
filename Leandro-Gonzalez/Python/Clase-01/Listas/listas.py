#Clase 1 practica con "listas"
#Las listas se conocen como arrays o vectores en otros lenguajes
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
nombres.append([1, 2, 3]) #tipo lista de elementos
nombres.append(True) #tipo bolleano
nombres.append(10.45) #tipo float
nombres.append(8) #tipo entero
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

###Repaso de listas####

#Concatenar listas
lista1 = [1, 2, 3]
lista2 = [4, 5, 6]
lista3 = lista1 + lista2
print(lista3)

#Agregar elementos a una lista "concatenada"
lista3.extend([7, 8, 9]) #con el metodo ".extend()" agregamos elementos
print(lista3)

#Ver en que indice esta un elemento
print(lista3.index(5)) #con el metodo ".index()" vemos en que lugar esta el elemento de la lista
#print(lista3.index(0)) Da error por no ser un elemento de la lista

#Como saber cuantos valores repetidos hay en una lista
print(lista3.count(1)) #Con ".count()" nos dice cuantos elementos repetidos hay dentro de una lista

#Cambiar el sentido de una lista
lista3.reverse() #Con ".reverse()" cponemos la lista al reves
print(lista3)

#Multiplicar una lista repitiendo sus elementos
lista = [1, 2, 3] * 2
print(lista)

lista = lista * 2
print(lista)

#Metodos de ordenamient0
lista3.sort() #Ordena los elementos ascendentemente con ".sort()"
print(lista3)
lista3.sort(reverse=True) #Ordena de manera descendente
print(lista3)
