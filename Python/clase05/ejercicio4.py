'''
ejercicio4: funcion con * args para multiplicar
crear una funcion para multiplicar los valores
recbidos de un tipo numerico, utilizando argumentos
variables * args como parametro de la funcion y regresar como resultado
la multiplicacion de todos los calores pasados como argumento
'''

def multiplicar(*args):
    resultado = 1

    for valor in args:
        resultado *= valor
    return resultado

print(multiplicar(5, 2, 4))