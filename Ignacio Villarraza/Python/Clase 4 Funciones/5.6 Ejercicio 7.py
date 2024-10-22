#5.6 Ejercicio 7 - Adivina el numero
from random import *

num_aleatorio = randint(1, 100)

while True:
    contador = 1
    num_usuario = int(input("Ingrese un numero entre 1 y 100: "))
    while num_usuario > 0 and num_usuario != num_aleatorio:
        contador += 1
        if num_usuario > num_aleatorio:
            print(f"El numero {num_usuario} es mayor al numero aleatorio")
            num_usuario = int(input("Ingrese un numero entre 1 y 100: "))
        elif num_usuario < num_aleatorio:
            print(f"El numero {num_usuario} es menor al numero aleatorio")
            num_usuario = int(input("Ingrese un numero entre 1 y 100: "))
    else:
        print(f"Correcto!!! El numero elegido '{num_usuario}' es igual al numero aleatorio, lo lograste en {contador} intentos.")
        break
