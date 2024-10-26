# Escriba un programa que tenga 2 listas y que a continuación cree las siguientes listas
# (en las que no deben haber repetición):

# Lista de palabras que aparecen en las listas.
# Lista de palabras que aparecen en la primera lista, pero no en la segunda.
# Lista de palabras que aparecen en la segunda lista, pero no en la primera.
# Lista de palabras que aparecen en ambas listas.

lista1 = {'hola', 8, 10, 'Tren', 'roca', 30.50}
lista2 = {8, 'Tren', 52, 30.50}

lista3 = lista1 | lista2
print(f'Lista de palabras que aparecen en las listas {lista3}')
lista3 = lista1 - lista2
print(f'Lista de palabras que aparecen en la primera lista, pero no en la segunda {lista3}')
lista3 = lista2 - lista1
print(f'Lista de palabras que aparecen en la segunda lista, pero no en la primera {lista3}')
lista3 = lista1 & lista2
print(f'Lista de palabras que aparecen en ambas listas {lista3}')