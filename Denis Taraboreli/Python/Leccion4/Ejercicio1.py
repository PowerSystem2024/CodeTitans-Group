# Ejercicio 1: iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3

for i in range(11):
    if i % 3 == 0:
        print(i)
print()

# Ejercicio 2: Crear un rango de numeros de 2 a 6 e imprimelos

numeros = range(2,7)
for i in numeros:
    print(i)
print()
# Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1

numeros2 = range(3, 11, 2)  # Aqui utilizamos el argumento step de la funcion range que incrementa los numeros en 2
for i in numeros2:
    print(i)
print()

# Aqui creamos un rango de 3 a 11 con range, convertimos ese rango en una lista con list
numeros2 = list(range(3, 11))
for i in range(len(numeros2)):  # len calcula la longitud de la lista, range crea un rango de numeros de 0 hasta 7
    # que se utiliza para iterar sobre indices de la lista
    print(numeros2[i]) 
    numeros2[i] += 2

