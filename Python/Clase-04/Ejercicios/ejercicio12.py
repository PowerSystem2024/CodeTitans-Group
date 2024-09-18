#Mostrar una frase sin espacios y contar su longitud
#Hacer un programa donde el usuario ingrese una frase
#Se le devolvera la misma frase pero sin espacios en blanco
#Mostrar un contador de cuantos caracteres tiene la frase
#Ejemplo: 
#Frase = vivr por siempre en paz
#Frase final = vivirporsiempreenpaz
#Nº de caracteres = 20


# Pedimos al usuario que ingrese una frase
frase = input("Ingrese una frase: ")

# Inicializamos una variable para almacenar la frase sin espacios
frase_sin_espacios = ""

# Bucle para eliminar los espacios en blanco de la frase
for caracter in frase:
    if caracter != " ":
        frase_sin_espacios += caracter

# Contamos la longitud de la frase sin espacios
n_caracteres = len(frase_sin_espacios)

# Mostramos los resultados
print(f"Frase final = {frase_sin_espacios}")
print(f"Nº de caracteres = {n_caracteres}")
