# Repaso de set o conjunto
# para definir un conjunto
conjunto2 = set()
conjunto1 = {'bye', }  # debe tener un elemento adentro para comenzar un conjunto
conjunto2.add(7, )
conjunto2.add('hola')
print(conjunto2)
conjunto1.add('hola')
print(conjunto1)
print(3 not in conjunto1) # preguntamos si el numero  3nno esta en el conjunto

# Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2)  # nos devuelve como respuesta un booleano

conjunto3 = conjunto1 | conjunto2  # la linea une a los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2  # que elemento tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2 #asigna el valor que esta en el conjunto 1 y no en el conjunto 2
print(conjunto3)
conjunto3 = conjunto2 - conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2  # elementos que no comparten o son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3))  # Comprobacion booleana si un conjunto es un subconjunto dentro de otro
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issuperset(conjunto1)) # preguntamos si conjunto 3 es un superconjunto
print(conjunto3.issuperset(conjunto2))
print(conjunto2.issuperset(conjunto3))

# como saber si ambos son disconexos, es decir, no comparten cosas en comun
print(conjunto1.isdisjoint(conjunto2))

# convertir un conjunto totalmente en inmutable
conjunto1 = frozenset  # esto ahce que el conjunto sea inmutable






