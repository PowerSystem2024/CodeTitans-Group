

nombres = ["Nacho", "Diani", "Morena", "Victoria"]

# print(nombres[0])
# print(nombres[1])
# print(nombres[2])
# print(nombres[-1])
# print(nombres[0:2])
# print(nombres[ : -1])
#
# nombres[0] = "Ignacio"
# nombres[1] = "Diana"
# print(nombres)
#
# for nombre in nombres:
#     print(nombre)

#Cantidad de elementos en una lista
print(len(nombres))

#Agregar Elementos en la lista
nombres.append("Keita")
print(nombres)

#Agregar Elemento en un indice especifico
nombres.insert(0, "Keita")
print(nombres)

#Eliminar Elemento de la lista
nombres.remove("Keita")
print(nombres)

#Eliminar Elemento en un idice especifico de la lista
del nombres[2]
print(nombres)

#Eliminar Datos de la lista
nombres.clear()
print(nombres)

#Contatenar listas
lista1 = [1,2,3]
lista2 = [4,5,6]
lista3 = lista1 + lista2
print(lista3)

lista3.extend([7,8,9])
print(lista3)

#Muestra los valores repetidos de la lista
print(lista3.count(1))

# Poner la lista al reves
lista3.reverse()
print(lista3)

# multiplicar las listas repitiendo sus elementos
lista4 = lista2 * 2
print(lista4)

lista3.sort()
print(lista3)