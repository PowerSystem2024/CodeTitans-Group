# Dada la siguien te tupla
tupla = (13, 1, 8, 3, 2, 5, 8) # Definimos la tupla

# Crear una lista que solo incluya los numero menores a 5 e imprima por consola [1, 2, 3]

# Definimos la lista
lista = []

for elemento in tupla:
    if elemento < 5: # Filtramos los numeros menos a 5
        lista.append(elemento)
        print(lista)