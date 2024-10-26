# comenzamos con funciones
# mi_funcion() # no se puede llamar antes de definir a una funcion
# definimos una funcion

def mi_funcion(): # para identificar a la funcion utililizaremos parantesis
    print('Saludos a todos los alumnos de la tecnicatura')

mi_funcion() # estamos llamando a la  funcion
mi_funcion() # se puede llamar a una funcion N cantidad de veces

# desempaquetado de listas o list unpacking

def show(name, lastName):
    print(name+' '+lastName)
person = ['Ariel', 'Betancud']
show(person[0], person[1])  # pasamos uno por uno los datos de la lista a la funcion
show(*person)  # Esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ('Osvaldo', 'Giordanini')
show(person2[0], person2[1])
person3 = {"lastName": "Lucero", "name": "Natalia"}
show(**person3)
show(person3['name'],person3['lastName'])  #otra forma de mostrar el diccionario

numbers = [1, 2, 3, 4, 5]
for n in numbers:
    print(n)
else:
    print("esto se termina")

# List comprehension, lista de comprension
names = ['Paolo', 'Rodrigo', 'Lupe', 'Pepe']
alongP = [nombresConP for nombresConP in names if nombresConP[0] == 'P'] # esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg",
            "name": "Corona", "country": "Mx",
            "name": "Stella Artois", "country": "Belgium",
            }]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)

# Paso de Argumentos (funciones)

def mi_funcion2(name, lastName):  # Establecemos el parametro de la funcion
    print("Saludos a todos los que ven a traves del canal de youtube")
    print(f'Nombre: {name}, Apellido: {lastName}')
mi_funcion2('Jorge', 'Lucero')  # Argumento valor que enviamos al parametro
mi_funcion2('Ariel', 'Betancud')

def sumar(a, b):
    return a + b
resultado = sumar(78, 22)
print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(78,25)}')

def sumar2(a: int = 0, b: int = 1):  # le damos un valor por default
    return a + b
resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f'El resultado de la suma es: {sumar(12,25)}')

# argumentos, variables en funciones

def listarNombres(*nombres):
    for nombre in nombres:
        print(nombre)

listarNombres('Lucas', 'Jose', 'Claudia', 'Rosa')
listarNombres('Marcos', 'Daniel', 'Romina')

# argumento variable llave valor para diccionario

def listarTerminos(**terminos): # lo mas utilizado es **kwargs para recibir los argumentos
    for llave, valor in terminos.items():
        print(f'{llave} : {valor}')

print(listarTerminos(IDE='Integrated Develoment Enviroment', PL='Primary Key'))


def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ['Tito','Pedro','Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')  # lo mostrara como una cadena recorriendo cada elemento
# desplegarNombres(18)  no es un objeto iterable
# desplegarNombres(10, 11)
desplegarNombres((10, 11))  # para recorrer los numeros los convertimos en tupla
desplegarNombres([22, 55])  # la convertimos en una lista

def factorial(num):
    if num < 0:
        return "Error"

    resultado = 1
    while num >= 1:
        resultado *= num
        num = num - 1
    return resultado

numero = int(input("Ingrese el numero del factorial a calcular: "))
resultado = factorial(numero)
print(f'El factorial de {numero} es : {resultado}')



