#Juego adivina el numero
#Realizar un juego para adivinar un numero
#Para ello se debe generar un numero "aleatorio" entre 1 - 100
#Luego ir pidiendo numeros indicando "es mayor o es menor"
#Segun sea el numero con respecto a "N"
#El proceso termina cuando el usuario acierta el numero
#Cuando acierta de debe mostrar el numero de intentos

import random

# Generamos un número aleatorio entre 1 y 100
numero_aleatorio = random.randint(1, 100)

# Inicializamos el contador de intentos
intentos = 0

print("\tBienvenido al juego 'Adivina el Numero'!")
print("\tEstoy pensando en un numero entre 1 y 100.")

# Bucle para pedir números hasta que el usuario adivine el número
while True:
    # Pedimos un número al usuario
    intento = int(input("Adivina el numero: "))
    
    # Incrementamos el contador de intentos
    intentos += 1
    
    # Comprobamos si el número ingresado es el correcto
    if intento < numero_aleatorio:
        print("\tEs mayor.")
    elif intento > numero_aleatorio:
        print("\tEs menor.")
    else:
        # El usuario adivinó el número
        print(f"Correcto! El numero era {numero_aleatorio}.")
        print(f"\nTe tomo {intentos} intentos.")
        break #Para romper el ciclo y el bucle
