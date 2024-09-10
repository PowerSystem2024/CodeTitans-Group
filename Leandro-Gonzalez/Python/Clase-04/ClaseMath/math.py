import math #Importamos la clase "math" para hacer uso de la funcion sqrt (raiz cuadrada)

#Ejercicio de matematicas
#Para sacar la raiz cuadrada de un numero positivo

numero = int(input("Ingrese un numero positivo: "))
while numero < 0:
    print("Error -> Deberia ser un numero positivo")
    numero = int(input("Ingrese un numero positivo: "))
    
print(f"\nSu raiz cuadrada es : {math.sqrt(numero):.2f}")    