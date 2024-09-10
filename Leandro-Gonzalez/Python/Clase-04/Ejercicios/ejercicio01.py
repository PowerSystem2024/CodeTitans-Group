# Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuacion elimine los elementos repetidos
# Mostrar la lista

#Creamos la lista
lista = [1, 2, 2, 3, 4, 4, 5, "Leandro", 1, 2, 2, 3, 4, 4, 5, "Leandro"]
lista = list(set(lista)) #Convertimos la lista a un conjunto de tipo "set"
print(lista) #Mostramos la lista