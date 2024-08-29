#Clase 1 practica con "Tuplas"
#Las "Tuplas" son inmutables , no se pueden modificar

cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)
print(len(cocina))# "len" nos dice la cantidad de elementos de la lista

#Acceder a un elemento mediante corchetes
print(cocina[0])
print(cocina[-1]) #De manera inversa (mostrara el ultimo elemento)

#Acceder a un rango
print(cocina[0:2])

###Una tupla necesita una "coma" , aunque sea un elemento###
verdura = ("papa",)#Ejemplo

#Recorrer los elementos de una tupla
for cocinar in cocina: #Print usa \n (salto de linea)
    print(cocinar, end=" ") #Usamos "end=" "" para eliminar los saltos de linea

#Ejemplo para poder modificar una tupla (no es aconsejable)
cocinaLista = list(cocina)
cocinaLista[0] = "Plato"
cocina = tuple(cocinaLista)
print("\n", cocina)

#Eliminar una tupla
del cocina #"del" Elimina la tupla

####Repaso de "tuplas"####

#Dentro de tuplas podemos usar: index, count, len
#En tuplas se puede convertir de tupla a lista y de lista a tupla
tupla = (4, "Hola", 6.78, [1, 2, 78], 4, "Chau") #Puede tener diferentes tipos de datos dentro
print(tupla)
print(4 in tupla) #Respuesta booleana