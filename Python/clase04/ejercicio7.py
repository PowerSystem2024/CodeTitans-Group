# Ejercicio7
# Hacer un programa para sumar números pares dentro
# de un rango, por ejemplo:
#
# suma de números pares del 2 al 30
# suma = 240

num1 = int(input('digite el numero donde comienza la suma: '))
num2 = int(input('digite el numero donde termina la suma: '))
suma = 0

for i in range(num1, num2 + 1):
    if i % 2 == 0:
        suma += i

print(f'La suma de los numeros pares es {suma}')