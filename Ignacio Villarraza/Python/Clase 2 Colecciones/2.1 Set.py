# Una coleccion de tipo SET no tiene orden ni indice

planetas = {'Marte', 'Jupiter', 'Venus'}

print(planetas)
#largo del set
print(len(planetas))
#Corroborar si existe un elemento en el set
print('Marte' in planetas)

#Agregar un elemento
planetas.add("Tierra")
print(planetas)

#Eliminar un elemento
planetas.remove("Jupiter")
print(planetas)

conjunto = set()
conjunto1 = {}

conjunto.add(1)
conjunto.add('Hola Mundo')

print(conjunto)

#Comprobar si un elemento esta dentro del conjunto
print(1 in conjunto)

#Comprobar igualdad entre conjuntos
print(conjunto == conjunto1)