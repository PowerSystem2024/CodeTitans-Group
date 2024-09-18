#Tabla de multiplicar
#Hacer un programa que pida un numero por teclado
#Guardar el numero en una lista
#Multiplicar hasta el 10, por ejemplo:
#Si ingresa 5 la lista tendra: 5,10,15,20,25,30,35,40,45,50


# Pedimos al usuario que ingrese un numero
numero = int(input("Ingrese un numero: "))

# Creamos una lista vacía para almacenar los resultados
tabla_multiplicar = []

# Llenamos la lista con los productos del numero ingresado por los numeros del 1 al 10
for i in range(1, 11):
    tabla_multiplicar.append(numero * i)

# Mostramos la lista con la tabla de multiplicar
print("La tabla de multiplicar del número ingresado es:")
print(tabla_multiplicar)

#Creamos un ciclo for para ver el formato de una tabla de multiplicar
for indice, i in enumerate(tabla_multiplicar):
    print(f"{numero} x {i} = {tabla_multiplicar[indice]}")