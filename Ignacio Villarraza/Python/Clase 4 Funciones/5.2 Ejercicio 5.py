# 5.2 Ejercicio 5 Factorial de un número positivo

num = int(input("Ingrese un numero: "))
while num < 0:
    print("ERROR!!! El numero ingresado debe ser positivo")
    num = int(input("Ingrese un numero: "))

factorial = 1

for i in range(1, num + 1):
    factorial *= i

print(f"El factorial del numero {num} es: {factorial}")

