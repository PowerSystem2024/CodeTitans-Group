#Ejercicio: No repetir caracteres
#Hacer un programa que pida una cadena por teclado
#Luego meter los caracteres en una lista sin repetir caracteres.

cadena = input("Introduce una cadena: ") # Solicitamos al usuario que introduzca una cadena de texto.
lista = [] # Creamos una lista vacía para almacenar los caracteres únicos de la cadena.

# Iteramos sobre cada carácter de la cadena.
for i in cadena: 
    if i not in lista: # Verificamos si el carácter no está ya en la lista.
        lista.append(i)  # Si el carácter no está en la lista, lo agregamos.
        
# Mostramos la lista final de caracteres, asegurándonos de no tener caracteres repetidos
print(f"\nLista de caracteres sin repetir ninguno: \n {lista}")