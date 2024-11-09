# 6.9.1 Ejercicio Funciones 01
#Crear una funcion para sumar los valores recibidos de tipo numericos, utilizando argumentos variables *args
#Como parametro de la funcion y agregar como resultado la suma de todos los valores pasados como argumentos.
def suma_numeros(*args):
    suma = 0
    for num in args:
        suma += num
    return suma

resultado = suma_numeros(1,2,3,4,5,6,7,8,9)
print(f"El resultado de la suma de los numeros ingresados es de: {resultado}")