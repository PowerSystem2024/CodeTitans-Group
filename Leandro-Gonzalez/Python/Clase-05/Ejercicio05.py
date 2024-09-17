#Ejercicio funcion Recursiva
#Imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas
#Puede ser cualquier valor positivo, por ejemplo si pasamos el valor de 5 debe imprimir:
#5
#4
#3
#2
#1
#Si se ingresan numeros negativos de se imprime nada


def imprimir_descendente(numero):
    
    if numero < 1:
        return
    else:
        # Imprimimos el número actual
        print(numero)
        # Llamada recursiva Llamamos a la función con el número decrementado en 1
        imprimir_descendente(numero - 1)

# Solicitamos al usuario que ingrese un numero positivo
numero_usuario = int(input("Introduce un numero positivo para imprimir de forma descendente: "))

# Verificamos si el número ingresado es positivo
if numero_usuario > 0:
    # Llamamos a la función con el número proporcionado por el usuario
    imprimir_descendente(numero_usuario)
else:
    # Si el número es negativo o cero, no imprimimos nada
    print("Debe introducir un numero positivo.")
