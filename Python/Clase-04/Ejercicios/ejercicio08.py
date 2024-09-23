#Factorial de un numero positivo
#Hacer un programa para calcular el factorial de un numero postivo


# Pedimos al usuario que ingrese un numero positivo
numero = int(input("Ingrese un numero positivo para calcular su factorial: "))

# Verificamos que el número sea positivo
if numero < 0:
    print("Por favor, ingrese un numero positivo.")
    # Pedimos un nuevo número positivo
    numero = int(input("Ingrese un numero positivo para calcular su factorial: "))

# Inicializamos la variable para almacenar el resultado del factorial
resultado = 1

# Calculamos el factorial utilizando un bucle for
for i in range(1, numero + 1):
    resultado *= i

# Mostramos el resultado
print(f"El factorial de {numero} es: {resultado}")
