#Repaso de set/conjunto
#Para definir un conjunto...

conjunto1 = set()# Se puede inicializar vacio
conjunto2 = {}# No se puede inicializar vacio
conjunto1.add(7)
conjunto1.add("Hola")
print(conjunto1)

#conjunto1.add(7, 8, 9)#No se pueden agregar varios elementos con el el ".add" (esto da error)

print(3 not in conjunto1)#Preguntamos si el numero 3 no esta en el set (devuelve un booleano, en este caso True)

#Como hacer la igualdad de 2 conjuntos
print(conjunto1 == conjunto2) #Devuelve un booleano como respuesta

#Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2 #la Linea une los 2 conjuntos (el conjunto 1 y 2 se guardan en el conjunto 3)
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 #Que elementos tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2 #Asigna el valor que esta en el conjunto1 y no en el conjunto2
print(conjunto3)

conjunto3 = conjunto2 - conjunto1 #Asigna el valor que esta en el conjunto2 y no en el conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2 #Elementos que no comparten o que son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2 
print(conjunto1.issubset(conjunto3)) #Preguntamos si un conjunto es un subconjunto dentro de otro

print(conjunto3.issuperset(conjunto1)) #Preguntamos si los elementos del conjunto1 entran dentro del 3
print(conjunto3.issuperset(conjunto2)) #Si es true quiere decir que el conjunto 3 es un "superconjunto"
print(conjunto2.issuperset(conjunto3)) #Devuelve false

#Como saber si ambos conjuntos son "disconexos", eso es si no comparten elementos en comun
print(conjunto1.isdisjoint(conjunto2)) #Devuelve un booleano

#Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset #Esto hace que el conjunto sea totalmente inmutable
#No se puede agregar, modificar ni eliminar elementos dentro del conjunto