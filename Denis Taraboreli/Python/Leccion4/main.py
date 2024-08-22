''' listas - conjuntos de elementos(tipo string, numericos, logicos )
lista = Ariel , Liliana , Natalia , Osvaldo (En esta lista tipo string,
a cada uno de los elementos de la lista se le asigna un indice empezando desde 0)
Se utilizan cuando necesitas una colección de elementos que pueda cambiar a lo largo del tiempo.
'''

nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(type(nombres))

# En caso de que la lista sea muy larga, para recorrer la lista de elementos y que nos muestre
# el ultimo numero o el penultimo, comenzamos a contar desde -1
print(nombres[-1])

# Recuperar un rango de la lista
print(nombres)
print(nombres[0:2])  # solo muestra el indice 0, 1 pero no el indice 2
# ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3])  # Indicesa mostrar 0, 1, 2
# Desde el indice indicado hasta el final
print(nombres[1: ])

# Modificar un valor
nombres[3] = 'Liliana'
print(nombres)
nombres[1] = 'Carlos'
print(nombres)

# Iterar una lista
for nombre in nombres:
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

# Preguntamos cuantos elementos tiene
print(f"la lista tiene {len(nombres)} elementos")  # Le pasamos como parametro la lista, len es una funcion que nos muestra la cantidad de elementos
# que contiene una lista, para ello debemos pasarle un parametro que en este caso es la lista nombres

# Agregamos un elemento
# Usamos el operador de . que nos permite acceder a diferentes funciones para trabajar con una lista
nombres.append('Marcelo')
print(nombres)
# Si usamos esta funcion, se agrega como el ultimo elemento

# Insertar un elemento en un indice especifico
nombres.insert(1,'Alberto')  # se necesito un tipo entero para indicar en que posicion de la lista se añade el elemento
print(nombres)
nombres.insert(3,'Debora')
print(nombres)

# Eliminamos un elemento
nombres.remove('Alberto')
print(nombres)

# Eliminar el ultimo elemento
nombres.pop()
print(nombres)

# Eliminamos un indice especifico
del nombres[2]  # del = eleminar
print(nombres)

# Eliminar todos los elementos
nombres.clear()
print(nombres)

# Eliminar la lista
del nombres

# Tupla: Se utilizan cuando necesitas una colección de elementos que debe permanecer constante y no cambiar.
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(cocina)
print(len(cocina))

# Acceder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])
# mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango
print(cocina[0:1])

# Ejemplo
verdura = ('papa')  # esto no es una tupla, sino una cadena tipo string
print(verdura)

# Para que sea una tupla y no un tipo string, necesita aunque sea un elemento, la coma
verduras = ('papa',)  # esto no es una tupla, sino una cadena tipo string
print(verduras)
print(type(verdura))
print(type(verduras))

# Recorremos los elementos de la tupla
for cocinar in cocina:
    print(cocinar, end=' ')# Print estaba usando \n para saltos de linea, agregamos end=' ' para que termine \n y agregue un espacio

# No se puede añadir una modificacion a una tupla como aqui
'''
cocina[0] = 'plato'
print(cocina)
'''
# Aunque no es una buena practica, si debemos modificar una tupla, lo hacemos de la siguiente manera
cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)  # Anulamos el end que agregaba los espacios anteriormente

# Eliminamos la tupla
del cocina

