#Funcion con "*args" para multiplicar
#Crear una funcion para multiplicar los valores recibidos
#De tipo numericos, utilizando argumentos variables *args
#Como parametro de la funcion y regresar como resultado la multiplicacion de todos los valores 
#Pasados por argumento

# Definimos una función que acepta un número variable de argumentos utilizando *args.
def multiplicar_valores(*args):
    producto = 1
    # Recorremos cada valor en args.
    for valor in args:
        producto *= valor
    return producto

print(multiplicar_valores(2, 3, 5, 1, 5, 20))  #Llamamos a la funcion y le pasamos los valores
