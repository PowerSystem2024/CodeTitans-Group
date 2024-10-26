# Ejercicio 6: insertar elementos y ordenarlos
# Pedir numeros y meterlos en una lista, cuando el usuario
# introduzca un numero 0, nuestro programa dejaria de insertar
# por ultimo mostrar los numeros de menor a mayor

lista = []
num = 1

while num != 0:

    num = int(input('Ingrese un numero: '))
    lista.append(num)

lista.sort()
for i in range(len(lista)):
    if i < len(lista) - 1:  # Evita el guion después del último número
        print(lista[i], end=' - ')
    else:
        print(lista[i])


