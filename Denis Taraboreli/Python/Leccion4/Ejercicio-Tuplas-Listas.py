# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8)  # Definimos la tupla
# Crear una lista que solo incluya los numeros menores a 5
# e imprima por consola [1, 2, 3]

lista = []
for num in tupla:
    if num < 5:
        lista.append(num)
print(lista)
