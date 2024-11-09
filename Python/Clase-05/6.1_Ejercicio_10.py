#Ejercicio 10 - No repetir Caracteres
#Programa que pide una cadena por teclado y luego meter la cadena en una lista sin repetir los caracteres.

cadena = input("Ingrese una Frase o Palabra: ")
lista = []
for n in cadena:
    if n not in lista:
        lista.append(n.lower())

print(f"Lista de caracteres utilizados: \n{lista}")
