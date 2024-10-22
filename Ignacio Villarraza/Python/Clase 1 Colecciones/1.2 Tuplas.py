#Las tuplas son listas INMUTABLES!!!

cocina = ("Cuchara", "Cuchillo", "Tenedor")

# print(cocina)
# print(len(cocina))

#Acceder a un elemento especifico en la tupla
print(cocina[0])

#Una tupla necesita aunque sea un elemento seguido de una coma, el siguiente ejemplo es un string
verdura = ("Papas")
print(verdura)
#Este ejemplo si es una tupla
verduras = ("Papas", )
print(verduras)

#Recorremos los elementos de una tupla
print("Recorriendo tupla: ")
for i in cocina:
    print(i)

#Copiar una tupla a una lista para poder agregarle/modificarle elementos y luego volver a convertirla en tupla
print("Nueva Tupla: ", end=" ")
cocinaLista = list(cocina)
cocinaLista[0] = "Plato"
cocina = tuple(cocinaLista)
print(cocina)

#Ejercicio: dada la siguiente Tupla
print("Ejercicio Tupla ")
tupla = (13, 1, 8, 3, 2, 5, 8)
#Crear una lista que solo incluya los numeros menores a 5 e imprima por consola

lista = []
for n in tupla:
    if n < 5:
        lista.append(n)

print(lista)
#Comprobar si hay elementos dentro de la tupla
print( 3 in tupla)
print( 4 in tupla)