# Ejercicio9
# Hacer un programa que pida un número al usuario y guarde
# en una lista su tabla de multiplicar hasta el 10. Por ejemplo:
#
# Si el número ingresado es 5, la lista será:
# [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
lista = []
num = int(input('Ingrese un numero: '))

for i in range(1, 11):
    operacion = num * i
    lista.append(operacion)

for i in range(len(lista)):
    if i < len(lista) - 1:
        print(lista[i], end= ' - ')
    else:
        print(lista[i])


