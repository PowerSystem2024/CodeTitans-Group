# Ejercicio 5: Modificar los elementos de una lista
# Llenar una lista con los números del 1 al 10, luego modificar los
# elementos de la lista multiplicándolos por un valor ingresado por el usuario

lista = []
for i in range(1, 10):
    lista.append(i)

num = int(input('Ingrese un numero: '))

for j in range(len(lista)):
    lista[j] *= num

for i in range(len(lista)):
    if i < len(lista) - 1:  # Evita el guion después del último número
        print(lista[i], end=' - ')
    else:
        print(lista[i])

# se puede hacer usando list(range(1,11)) y enumerate
# Indices y Valores Simultáneamente: enumerate permite iterar sobre una lista y
# obtener tanto el índice como el valor de cada elemento en una sola línea.
# Esto es útil porque no necesitas usar range(len(lista)) para obtener el índice, lo que hace el código más limpio y legible.

lista2 = list(range(1, 10))

print('lista original: ')

for i in range(len(lista2)):
    if i < len(lista2) - 1:
        print(lista2[i], end=' - ')
    else:
        print(lista2[i])

valor = int(input('Ingrese un numero: '))

for indice, i in enumerate(lista2):
    lista2[indice] *= valor

for indice, i in enumerate(lista2):
    if indice < len(lista2) - 1:  # Evita el guion después del último número
        print(lista2[indice], end=' - ')
    else:
        print(lista2[indice])


