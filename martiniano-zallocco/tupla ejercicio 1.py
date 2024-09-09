#dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8) #definimos la tupla
#crear una lista que solo incluya los numeros  menores a 5
#e imprimir por consola [1, 3, 2]

lista = [] #definimos la lista
#filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)

#repaso de tuplas
tupla = (4, "hola", 6.78, [1 , 2, 78], 4, "hola") #puede tener diferentes tipos de datos
print(tupla)

print(4 in tupla) #accion booleana, su respuesta es de tipo booleana 
# lo que podemos usar adentro de tuplas son: index, count, len
# en tuplas se puede convertir de tupla a lista y de lista a tupla

#repaso de set o conjunto
#para definir un conjunto
conjunto = set()
conjunto1 = {"bye"}
conjunto.add(7)
conjunto.add("hola")
print(conjunto)
conjunto1.add("hola")
print(conjunto1)
print(3 not in conjunto1) #preguntamos si el numero 3 no esta en el conjunto1

#como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto) #nos devuelve como respuesta un booleano


#operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2 #la linea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 #que elemento tienen en comun
print(conjunto3)
conjunto3 = conjunto1 - conjunto2
print(conjunto3)
conjunto3 - conjunto2 - conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2 #son los elementos que estan en los 2 conjuntos y no estan compartidos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3)) #aqui preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issuperset(conjunto1))
print(conjunto3.issuperset(conjunto2))
print(conjunto2.issuperset(conjunto3))

print(conjunto1.isdisjoint(conjunto2))

conjunto1 = frozenset