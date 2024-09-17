#Desenpaquetado de listas (list unpacking)

def show(name, lastName):
    print(name+" "+lastName)
persona = ["Leandro", "Gonzalez"]    
#Con listas
show(persona[0], persona[1]) #Pasamos uno por uno los datos de la lista a la funcion
show(*persona) #Es lo mismo que lo anterior , pero le pasamos todo junto

#Con tuplas
persona2 = ("Agustin", "Albarracin") #Desempaquetamos a traves de una tupla
show(*persona2)

#Con diccionarios
persona3 = {"name": "Pablo", "lastName": "Gomez"}
show(**persona3)


#Repaso del Ciclo for else
numbers = [1, 2, 3, 4, 5] #Con la lista vacia tambien se ejecuta el else
for n in numbers:
    print(n)
    if n == 3:
        break #Esta es la unica manera para que no se ejecute el "else"
else:
    print("Esto se termino")    
    

#List Comprehension: Lista de Comprensión
nombres = ["Pablo", "Juan", "Marcos", "Pedro"] #Lista de string
alongP = [p for p in nombres if p[0] == "P"] #Esto regresa una nueva lista, con los nombres que esten escrito con la letra "p"
print(alongP)

#Ahora hacemos lo mismo con un diccionario
bottleC = [{"name":"Quilmes", "country": "Arg"},
           {"name":"Corona", "country": "Mx"},
           {"name":"Stella Artois", "country": "Belgium"},
          ]    
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

#Paso de argumentos (funciones)
def mi_funcion2(name, lastName): #Le pasamos los parametros a nuestra funcion (variables)
    print("Saludos a todos los miembros de la cohorte 2024 de la UTN")
    print(f"Nombre: {name}, Apellido: {lastName}")
mi_funcion2("Lean", "Gonzalez") #Llamamos a la funcion y le pasamos los agurmentos (valores)
mi_funcion2("Pedro", "Peña") #Volvemos a llamar a la funcion y le pasamos diferentes valores

#La palabra "return" en funciones
#Creamos una funcion para sumas
def sumar(a, b):
    return a + b
resultado = sumar(78, 22)
print(f"El resultado de la suma es : {resultado}")

#Funciones: Valores por Default en Argumentos
def sumar2(a = 1, b = 1): #Le pasamos un valor por default
    return a + b
resultado2 = sumar2()
print(f"Resultado de la suma: {resultado2}")
print(f"Resultado de la suma: {sumar2(22, 66)}")

#Argumentos, variables en funciones
def listarNombres(*nombres): # Usamos el "*" ya que no sabemos cuantos valores vamos a cargar
    for nombre in nombres: #Se va a convertir en una tupla
        print(nombre)
listarNombres("Pablo", "Marcos", "Nina", "Lola", "Pedro") #Llmamaos a la funcion y le pasamos la cantidad de valores que queremos
listarNombres("Anibal", "Nicolas", "Manuel", "Matias", "Gustavo") #Volvemos a llamar a la funcion y le pasamos mas valores

#Argumentos variables para un diccionario
def listarNombresDict(**nombres): #Lo mas comun es **kwargs para recibir los argumentos
    for key, value in nombres.items(): # kwargs es: Key word argument
        print(f"{key}: {value}")
listarNombresDict() #LLamamos a la funcion y nu devuelve nada por que no contiene valor
listarNombresDict(IDE="Integrated Develoment Enviroment", PK="Primary Key")
listarNombresDict(Nombre="Pablo", Apellido="Gomez")

#Lista de elementos con funciones (convertir)
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ["Carlos", "Augusto", "Ana"]
desplegarNombres(nombres2) 
desplegarNombres("Juana") #Itera el objeto y los muestra
# desplegarNombres(8) #Da error ya que no es un objeto iterable       
desplegarNombres((8, 30)) #Para poder recorrer los numeros lo convertimos a una tupla, en un solo elemento no olvidar la "coma"
desplegarNombres([8, 30]) #Ahora lo convertimos a una lista para poder recorrerlos

#Funciones Recursivas
def factorial(numero):
    if numero == 1: #Caso base
        return 1
    else:
        return numero * factorial(numero-1) #Caso recursivo
resultado = factorial(5) #Lo hacemos en codigo duro
print(f"El factorial del numero 5 es: {resultado}")
