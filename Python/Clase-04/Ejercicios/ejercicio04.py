#Llenar una lista 
#Llenar una lista con los numeros del 1 al 50
#Mostrar la lista con un bucle for
#Los elementos deben mostrarse de la siguiente forma 1-2-3-4-5...-50


# Llenamos la lista con los números del 1 al 50 usando la función range()
numeros = list(range(1, 51))

# Usamos un bucle for para recorrer la lista
for i in numeros:
    print(i, end="-")
