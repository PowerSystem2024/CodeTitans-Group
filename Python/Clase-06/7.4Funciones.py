#Funciones Recursivas

def factorial(numero):
    if numero > 1:
        return numero * factorial(numero -1)
    else:
        return 1

numero = int(input("Ingrese el numero del cual desea calcular el factorial: "))
resultado_factorial = factorial(numero)
print(f"El Factorial del numero '{numero}' es: {resultado_factorial}")