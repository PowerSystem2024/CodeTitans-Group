#Un "Diccionario" esta compuesto por 2 elementos, una llave y un valor
#dict(key,value)

diccionario = {
    "IDE": "Integrated Development Environment",
    "POO": "Programacion Orientada a Objetos",
    "SABD": "Sistema de Administracion de Bade de Datos"
}
print(diccionario) #Muestro los elementos
print(len(diccionario)) #Muestra el numero de elmentos

#Acceder a un diccionario con la llave(key)
print(diccionario["IDE"]) #Muestra el valor de la llave

#Otra forma de obtener el valor de la llave
print(diccionario.get("POO")) #Obtenemos el valor de la llave con el metodo ".get()"

#Modificamos elementos
diccionario["IDE"] = "Entorno de Desarrollo Integrado" #Cambiamos el valor de la llave
print(diccionario)

#Recorrer los elementos
for termino in diccionario: #Recorremos mostrando solo las llaves
    print(termino)

#Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor) #Nos muestra las llaves y el valor

#Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino) #Muestra solo las llaves con el metodo ".keys()"

#Mostramos los valores sin las llaves
for valor in diccionario.values():
    print(valor) #Con el metodo ".value() solo accedemos al valor de las llaves"

#Comprobar la existencia de elementos
print("IDE" in diccionario) #Devuelve un booleano 

#Agregar un elemento 
diccionario["PK"] = "Primary Key"
print(diccionario)

#Eliminar un elemento
diccionario.pop("SABD") #Elimina la llave y su valor
print(diccionario)

#Vaciar un diccionario
diccionario.clear()
print(diccionario)

#Eliminar diccionario
# del diccionario


