#Sumar los numeros pares en un rango

inicio = int(input("Ingrese el numero con el que va a iniciar: "))
final = int(input("Ingrese el numero con el que va a finalizar: "))

rango = range(inicio, final + 1)
suma = 0

for num in rango:
    if num % 2 == 0:
        suma += num

print(f'El total de los numeros pares es de: {suma}')