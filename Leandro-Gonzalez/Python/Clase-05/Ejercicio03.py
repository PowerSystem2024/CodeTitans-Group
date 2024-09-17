#Crear una funcion para sumar los valores recibidos de tipo numericos
#Utilizando argumentos variables *args como parametros de la funcion
#Agregar como resultado la suma de todos los valores pasados como argumentos

# Definimos una función que acepta un número variable de argumentos utilizando *args.
def sumar_valores(*args):
    # Inicializamos una variable para almacenar la suma de los valores.
    suma = 0
    
    # Recorremos cada valor en args.
    for valor in args:
        suma += valor
    return suma # Devolvemos la suma total de los valores numéricos.

#LLamamos a la funcion y le pasamos los valores
print(sumar_valores(10, 3, 2, 1, 5, 3))
