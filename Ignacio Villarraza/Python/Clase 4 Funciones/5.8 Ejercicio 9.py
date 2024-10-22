#Ejercicio 9 - Mostrar una frase sin espacios y contar su longitud

frase = input("Ingrese una frase: ")
frase_nueva = frase.replace(" ", "")
print(f"Nueva Frase: {frase_nueva}")
print(f"Cantidad de caracteres: {len(frase_nueva)}")