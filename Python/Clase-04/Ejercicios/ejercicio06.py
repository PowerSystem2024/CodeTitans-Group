#Insertar elementos y ordenarlos
#Pedir numeros y meterlos en una lista 
#Cuando el usuario introduzca un numero "0", el programa dejaria de insertar
#Mostrar los numeros ordenados de menos a mayor


# Creamos una lista vacía para almacenar los numeros ingresados
numeros = []

# Bucle para pedir números al usuario
while True:
    # Pedimos un número al usuario
    numero = int(input("Ingrese un numero (0 para finalizar): "))
    
    # Si el número es 0, salimos del bucle
    if numero == 0:
        break
    
    # Agregamos el numero a la lista
    numeros.append(numero)

# Ordenamos la lista de menor a mayor
numeros.sort()

# Mostramos la lista ordenada
print("Números ordenados:", numeros)
