#Son estructuras de datos con Claves-Valores

diccionario = {
    'IDE': 'Integrated Development Environment',
    'POO' : 'Programacion Orientada a Objetos',
    'SABD' : 'Sistema de Administracion de Bases de Datos',
}

print(diccionario)
#Cantidad de elementod dentro del diccionario
print(len(diccionario))

#Accediendo a un elemento especifico
print(diccionario['POO'])
print(diccionario.get('IDE'))

#Modificar los elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

#Recorrer los elementos
print('Imprimiendo llaves y valores:')
for termino, valor in diccionario.items():
    print(termino, valor)
print('Imprimiendo llaves:')
for llave in diccionario.keys():
    print(llave)
print('Imprimiendo valores:')
for valor in diccionario.values():
    print(valor)

#Agregar elementos al diccionario
diccionario['PK'] = 'Primary Key'
print(diccionario)
#Eliminar elementos del diccionario
diccionario.pop('SABD')
print(diccionario)

#Vaciar el diccionario
diccionario.clear()
print(diccionario)

#Eliminar el diccionario
del diccionario
