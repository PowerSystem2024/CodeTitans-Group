'''
ejercicio7 convertidor de temperaturas
realizar dos funciones para convertir de grados celsius a
fahrenheit y viseversa
investigar las formulas
'''

def convertidorTemperaturas(fahrenheit, celsius):
    if fahrenheit > 1:
        temperatura = (fahrenheit - 32) * 5/9
        return temperatura
    if celsius > 1:
        temperatura = (celsius * 9/5) + 32
        return temperatura

opcion = int(input("Elija la opcion:\n"
                   "\n1. Convertir a Celsius"
                   "\n2. Convertir a Farenheit\n"))
if opcion == 1:
    num = int(input("Ingrese la temperatura en Farenheit: "))
    resultado = convertidorTemperaturas(num, 0)
    print(f" La temperatura en Celsius es : {resultado}")
elif opcion == 2:
    num = int(input("Ingrese la temperatura en Celsius: "))
    resultado = convertidorTemperaturas(0, num)
    print(f" La temperatura en Farenheit es : {resultado}")