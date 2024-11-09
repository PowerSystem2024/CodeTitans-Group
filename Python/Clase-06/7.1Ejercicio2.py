# 7.1 Ejercicio Funciones 02
#Crear una funcion para multiplicar los valores recibidos de tipo numericos, utilizando argumentos variables *args
#Como parametro de la funcion y agregar como resultado la multiplicacion de todos los valores pasados como argumentos.
def multiplicacion_numeros(*args):
    res = 1
    for num in args:
        res *= num
    return res

resultado = multiplicacion_numeros(5,6,7)
print(f"El resultado de la Multiplicacion de los numeros ingresados es de: {resultado}")