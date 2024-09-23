#Modificar los elementos de una lista
#Llenar una lista con los numeros del 1 al 10
#Luego mosdificar los elementos de la lista multiplicandolos por un valor ingresado por el usuario

# Llenamos la lista con los números del 1 al 10 usando la función range()
numeros = list(range(1, 11))
print("Lista Original")

for i in numeros:
    print(i, end="-")

# Pedimos al usuario que ingrese el valor por el cual se multiplicaran los elementos
multiplicador = int(input("\nIngrese un valor para multiplicar: "))

# Modificamos los elementos de la lista multiplicándolos por el valor ingresado
for i in range(len(numeros)):
    numeros[i] *= multiplicador

# Mostramos el resultado
print(f"Lista final con los elementos multiplicados por {multiplicador}")
for i in numeros:
    print(i, end="-")
