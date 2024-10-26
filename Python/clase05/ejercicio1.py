# Ejercicio 1 No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres

cadena = input('Digite una cadena: ')
lista = []


for caracter in cadena:
    if caracter not in lista:
        lista.append(caracter)

print(lista)