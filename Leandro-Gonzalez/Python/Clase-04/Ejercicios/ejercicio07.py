#Sumas numeros pares dentro de un rango
#Hacer un programa para sumar numeros pares dentro de un rango
#Por ejemplo:
#Suma de numeros pares del 2 al 30
#Suma = 240


# Pedimos al usuario el rango de numeros
inicio = int(input("Ingrese el inicio de la suma: "))
fin = int(input("Ingrese el fin de la suma: "))

# Inicializamos la variable para almacenar la suma
suma_pares = 0

# Iteramos sobre el rango desde inicio hasta fin (inclusive)
for numero in range(inicio, fin + 1):
    # Verificamos si el número es par
    if numero % 2 == 0:
        suma_pares += numero

# Mostramos la suma de los numeros pares
print(f"Suma de números pares del {inicio} al {fin} es: {suma_pares}")
