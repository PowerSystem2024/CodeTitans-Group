#Tarea que el usuario ingrese el numero para calcular el factorial
# Función recursiva para calcular el factorial
def factorial(numero):
    
    if numero == 1:
        return 1
    else:
        
        return numero * factorial(numero - 1)

# Solicitamos al usuario que ingrese un número
numero_usuario = int(input("Ingrese un numero para calcular su factorial: "))

# Verificamos que el número sea positivo
if numero_usuario < 1:
    print("El numero debe ser un entero positivo mayor o igual a 1.")
else:
    # Calculamos el factorial usando la función recursiva
    resultado = factorial(numero_usuario)
    # Mostramos el resultado
    print(f"El factorial del número {numero_usuario} es: {resultado}")
