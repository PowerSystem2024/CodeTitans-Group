# Ejercicio 10 : Juego adivina el número

# Realizar un juego para adivinar un número. Para ello se debe
# generar un número aleatorio entre 1 - 100, y luego ir pidiendo
# números indicando "es mayor" o "es menor" según sea mayor o menor
# con respecto a N. El proceso termina cuando el usuario acierta
# y allí se debe mostrar el número de intentos.
import random

num = random.randint(1, 100)
num1 = 0
intentos = 0

while num1 != num:
    num1 = int(input('Ingrese un numero: '))
    if num1 > num:
        print(f'El numero {num1} es mayor')
    elif num1 < num:
        print(f'El numero {num1} es menor')
    intentos += 1

print(f'Felicitaciones, el numero a adivinar era {num} y lo haz conseguido en {intentos} intentos')
