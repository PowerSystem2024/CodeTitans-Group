# Ejercicio8: factorial de un numero positivo

num = int(input('Ingrese un numero: '))
factorial = 1

while num < 0:
    num = int(input('El numero debe ser positivo. Ingrese un numero: '))

for i in range(1, num + 1):
    factorial *= i

print(f'El factorial es: {factorial}')

