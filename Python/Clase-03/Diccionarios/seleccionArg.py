#La tarea consiste en ingresar elementos al diccionario llamado seleccionArgentina
#los elementos a ingresar deben ser como mínimo 4
#estos elementos son los jugadores con: 
#número de camiseta, nombre, apellido, edad, altura, precio y posición de juego.

seleccionArgentina = {
    10: {"Nombre" : "Lionel Messi", "Edad": 35, "Altura" : 1.70, "Precio" : "50 Millones", "Posicion" : "Extremo Derecho"},
    11: {"Nombre" : "Angel Di Maria", "Edad": 34, "Altura" : 1.80, "Precio" : "12 Millones", "Posicion" : "Extremo Derecho"},
    21: {"Nombre" : "Paulo Dybala", "Edad": 28, "Altura" : 1.77, "Precio" : "35 Millones", "Posicion" : "Media Punta"},
    19: {"Nombre" : "Nicolas Otamendi", "Edad": 34, "Altura" : 1.83, "Precio" : "3.5 Millones", "Posicion" : "Defensa Central"},
    1: {"Nombre" : "Franco Armani", "Edad": 35, "Altura" : 1.89, "Precio" : "3.5 Millones", "Posicion" : "Portero"},
    23: {"Nombre" : "Emiliano Martinez", "Edad": 32, "Altura" : 1.96, "Precio" : "21 Millones", "Posicion" : "Portero"},
    9: {"Nombre" : "Julian Alvarez", "Edad": 24, "Altura" : 1.70, "Precio" : "24 Millones", "Posicion" : "Delantero"},
    28: {"Nombre" : "Alejandro Garnacho", "Edad": 20, "Altura" : 1.80, "Precio" : "48.9 Millones", "Posicion" : "Delantero"},
    22: {"Nombre" : "Enzo Fernandez", "Edad": 23, "Altura" : 1.78, "Precio" : "121 Millones", "Posicion" : "Mediocentro"},
    5: {"Nombre" : "Leandro Paredes", "Edad": 30, "Altura" : 1.80, "Precio" : "20 Millones", "Posicion" : "Centrocampista"}
}

print(seleccionArgentina[23])

for llave, valor in seleccionArgentina.items():
    print(llave, valor)

#Chequeamos el tamaño del diccionario
print("Tenemos cargados en el diccionario la cantidad de jugadores: ", end=" ")
print(len(seleccionArgentina))

#Como recorrer un diccionario con el ciclo for
for i in seleccionArgentina:
    print(f"{i} -> {seleccionArgentina[i]}")