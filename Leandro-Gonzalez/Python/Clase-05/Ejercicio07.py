#Ejercicio: Convertidor de temperaturas
#Realizar dos funciones para convertir de grados celsius a fahrenheit y viseversa
#Incluir las formulas

#Funcion para convertir de grados Celsius a Fahrenheit
def celsius_a_fahrenheit(celsius):
    fahrenheit = celsius * 9 / 5 + 32
    return fahrenheit

#Función para convertir de grados Fahrenheit a Celsius
def fahrenheit_a_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * 5 / 9
    return celsius

# Solicitamos al usuario que elija una opcion
print("Convertidor de temperaturas:")
print("1. Convertir de Celsius a Fahrenheit")
print("2. Convertir de Fahrenheit a Celsius")
opcion = int(input("Elija una opción (1 o 2): "))

# Realizamos la conversion dependendiendo la opcion 
if opcion == 1:
    #De Celsius a Fahrenheit
    celsius = float(input("Ingrese la temperatura en grados Celsius: "))
    resultado = celsius_a_fahrenheit(celsius)
    print(f"{celsius} grados Celsius son {resultado:.2f} grados Fahrenheit.")
elif opcion == 2:
    #De Fahrenheit a Celsius
    fahrenheit = float(input("Ingrese la temperatura en grados Fahrenheit: "))
    resultado = fahrenheit_a_celsius(fahrenheit)
    print(f"{fahrenheit} grados Fahrenheit son {resultado:.2f} grados Celsius.")
else:
    print("Opcion no valida.") #Por si el usuario igresa otra opcion que no existe
