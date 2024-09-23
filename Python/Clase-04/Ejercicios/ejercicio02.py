#Operaciones de conjuntos con listas
#Escriba un programa que tenga 2 listas y que a continuacion
#Cree las siguientes listas (en las que no deben haber repetidos)
#1 Lista de palabras que aparecen en las listas 
#2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
#3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
#4 lista de palabras que aparecen en ambas listas

#Creamos las listas
lista1 = ["apple", "banana", "orange", "grape", "apple", "banana", "orange", "grape"]
lista2 = ["orange", "kiwi", "grape", "pineapple", "orange", "kiwi", "grape", "pineapple"]

#Eliminamos elementos duplicados y concatenamos ambas listas
palabras_total = list(set(lista1 + lista2)) #Palabras que aparecen en ambas listas (sin repetidos)

# Usamos la diferencia de conjuntos (set(lista1) - set(lista2)) para encontrar los elementos 
solo_lista1 = list(set(lista1) - set(lista2)) #Palabras que aparecen solo en la primera lista


solo_lista2 = list(set(lista2) - set(lista1)) #Palabras que aparecen solo en la segunda lista

# Para encontrar los elementos comunes en ambas listas usamos la intersección de conjuntos
interseccion = list(set(lista1) & set(lista2)) #Palabras que aparecen en ambas listas

print(f"Lista de palabras que aparecen en las listas: {palabras_total}") 
print(f"Lista de palabras que aparecen en la primera lista, pero no en la segunda: {solo_lista1}") 
print(f"Lista de palabras que aparecen en la segunda lista, pero no en la primera: {solo_lista2}") 
print(f"lista de palabras que aparecen en ambas listas: {interseccion}") 

