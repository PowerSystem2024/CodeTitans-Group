''' listas - conjuntos de elementos(tipo string, numericos, logicos )
lista = Ariel , Liliana , Natalia , Osvaldo (En esta lista tipo string,
a cada uno de los elementos de la lista se le asigna un indice empezando desde 0)
Se utilizan cuando necesitas una colección de elementos que pueda cambiar a lo largo del tiempo.
Listas forma parte de colecciones en Python. Las listas es lo que se conoce
como arreglos o vectores en otros lenguajes
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
# Si usamos esta funcion, se agrega como el ultimo elemento

apellidos = ['Gomez', 'Robert']
nombres.append('Marcelo')
nombres.append([1, 2, 3])  # Puede haber una lista dentro de otra lista
nombres.append(True)       # Valores booleanos
nombres.append(10.45)      # Valores flotantes
nombres.append(apellidos)
nombres.append(7)
print(nombres)


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

verduras = ('papa',)  # esto es una tupla,
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

# Coleccion tipo set
# set no tiene un orden y nos permite almacenar elementos duplicados, no se puede modificar pero si eliminar
# no mantiene ningun indice, el orden es aleatorio
# nos puede servir para evitar elementos duplicados en una lista de datos como
# numeros de documentos, matriculas ...

planetas = {'Marte', 'Jupiter', 'Venus'}
print(len(planetas)) # usamos la funcion len = length significa largo

# Revisar si un elemento existe dentro del set

print('Marte' in planetas)  # mostrara el
print('Marte' not in planetas)

planetas.add('Tierra')  # add es una funcion
planetas.add('Tierra')  # no se pueden agregar elementos duplicados con set
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no existe

planetas.remove('Jupiter')  # Si eliminamos mal el elemento, saldra error
print(planetas)

planetas.discard('Tierra')
print(planetas)

# La diferencia entre discard y remove es que al ingresar el elemento a eliminar con un error de sintaxis
# no se eliminara ni saldra error

planetas.discard('marte')
print(planetas)

# Limpiar set

planetas.clear()
print(planetas)

# Eliminar set o conjunto

del planetas

# Diccionario

# 'Maradona' : 10 Un diccionario esta compuesto por dos elementos
# UNA LLAVE Y UN VALOR
# dict(key,value)
# se puede usar como llave los tipo string, int, float y boolean

diccionario = {
    'IDE': 'Integrated Development Environment',
    'POO': 'Programacion Orientada a Objetos',
    'SABD': 'Sistema de Administracion de Base de Datos'
}
print(len(diccionario))
print(diccionario)

# Para acceder a los diccionarios se utilizan las llaves(key) ya que no tenemos indices

print(diccionario['IDE'])

# Otra forma de recuperar un elemento

print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificamos elementos
# Un diccionario puede modificarse

diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Como recorrer los elementos
# Recorremos mostrando solo las llaves

for termino in diccionario:
    print(termino)

# Para recorrer las llaves y ver el valor con la funcion .items

for termino,  valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
# Funcion .keys

for termino in diccionario.keys():
    print(termino)  # Muestra solo las llaves

# Funcion .values para acceder solo a los valores del diccionario

for valor in diccionario.values():
    print(valor)

# Comprobar la existencia de algun elemento

print('IDE' in diccionario)  # Devuelve un booleano

# Agregar un elemento

diccionario['PK'] = 'Primary key'
print(diccionario)

# Eliminar un elemento

diccionario.pop('SABD')

# Vaciar un diccionario

diccionario.clear()
print(diccionario)

# Eliminar diccionario

del diccionario

# Concatenamos listas

lista1 = [1, 2, 3]
lista2 = [4, 5, 6, 1]
lista3 = lista1+lista2
print(lista3)

# Funcion para agregar varios elementos a una lista

lista3.extend([7, 8, 9])

# Funcion para ubicar en que indice esta el valor ingresado

print(lista3.index(5))
# print(lista3.index(0)) esto daria un error por no ser el elemento parte de la lista

# Como saber cuantos valores repetidos hay dentro de una lista

print(lista3.count(1))

# Para poner al reves una lista

lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos

lista = [1, 2, 3] * 2
print(lista)

lista3 = lista3 * 2
print(lista3)

# Metodos de ordenamiento

lista3.sort()  # Ascendente
print(lista3)

lista3.sort(reverse=True)  # Ordenar descendentemente
print(lista3)

# Tipos de datos a ingresar en Tuplas

tupla = (4, 'Hola', 6.78, [1, 2, 78], (4, 5, 6), 4)
print(tupla)

print(4 in tupla)  #Accion booleana, su respuesta es de tipo booleana
# se puede usar index, count, len
# las tuplas pueden transformarse a listas

lista4 = []
for num in tupla:
    lista4.append(num)
print(lista4)