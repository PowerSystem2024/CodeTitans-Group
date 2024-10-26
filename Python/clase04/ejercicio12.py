# Ejercicio 12: Mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le
# devuelva la misma frase pero sin espacios en blanco, y
# además un contador de cuantos caracteres tiene la frase
# (sin contar los espacios en blanco)
#
# Ejemplo:
#   frase = vivir por siempre en paz
#   frase final = vivirporsiempreenpaz
#   Nº de caracteres = 20

frase = input('Ingrese una frase')
frase_sin_espacios = ""
contador_frase = 0
caracter = 0

for caracter in frase:
    if caracter != " ":
        frase_sin_espacios += caracter
        contador_frase += 1

# Otra forma de eliminar los espacios en blanco de la frase
# frase_sin_espacios = frase.replace(" ", "")

print(f'Frase: {frase}'
      f'\nFrase final: {frase_sin_espacios}'
      f'\nN° de caracteres: {contador_frase}')








