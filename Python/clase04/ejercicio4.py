# Ejercicio 4: Llenar una lista
# Llenar una lista con los números del 1 al 50, luego muestra
# la lista con el bucle for, los elementos deben mostrarse
# de la siguiente forma:
# 1-2-3-4-5...-50

lista = []
for i in range(1, 51):
    lista.append(i)
print(lista)

lista2 = []
suma = 0
while suma <= 51:
    lista2.append(suma)
    suma += 1

# imprimir los numeros del 1 al 50 con un guion

for i in range(len(lista)):
    if i < len(lista) - 1:  # Evita el guion después del último número
        print(lista[i], end=' - ')
    else:
        print(lista[i])

# Otra forma de hacerlo

print(' - '.join(map(str, lista2)))

