# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuacion
# elimine los elementos repetidos, por ultimo mostrar la lista

# creamos la lista

lista = [1, 2, 2, 3, 4, 4, 5, 6, 6, 7]

conjunto = set(lista)
lista2 = list(conjunto)
print(f'lista original{lista}')
print('lista sin repetir', lista2)

# otra forma

lista3 = list(set(lista))
print(f'lista con list(set) {lista3}')