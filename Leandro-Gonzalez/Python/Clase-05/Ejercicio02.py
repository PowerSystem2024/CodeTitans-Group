#Ejercicio: Agenda telefonica
#Hacer un programa que simule una agenda de contactos
#Crea un diccionario donde la clave sea el numbre del usuario y el valor sea el telefono
#El programa tendra el siguiente menu de opciones:
#1. Nuevo contacto
#2. Borrar contacto
#3. Ver contactos existentes
#4. Salir

agenda = {} # Creamos un diccionario vacío para almacenar los contactos.
while True: # Ciclo infinito que muestra el menú de opciones hasta que el usuario decida salir.
    print("Menu de opciones:") # Mostramos las opciones del menú al usuario.
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")
    opcion = int(input("Ingrese una opcion: "))  # Solicitamos al usuario que elija una opción del menú.
    if opcion == 1:  # Agregar un nuevo contacto.
        nombre = input("Ingrese el nombre del contacto: ")
        telefono = input("Ingrese el numero de telefono: ")
        if nombre not in agenda: # Verificamos si el contacto ya existe en la agenda.
            agenda[nombre] = telefono # Si el contacto no existe, lo agregamos al diccionario.
            print("Contacto agregado exitosamente!")
        else:
            print("Este nombre de contacto ya existe") # Si el contacto ya existe, mostramos un mensaje de advertencia.
    elif opcion == 2: # Borrar un contacto existente.
        nombre = input("Cual es el nombre del contacto: ") # Solicitamos al usuario el nombre del contacto que desea eliminar.
        if nombre in agenda: # Verificamos si el contacto existe en la agenda.
            del (agenda[nombre]) # Si el contacto existe, lo eliminamos del diccionario.
            print("Se ha eliminado el contacto requerido")
        else:
            print("Este contacto no existe en la agenda")   
    elif opcion == 3: # Ver todos los contactos existentes.
        print("Agenda de contactos")
        for clave, valor in agenda.items(): # Mostramos todos los contactos almacenados en la agenda.
            print(f"Nombre: {clave}, Telefono: {valor}")
    elif opcion == 4: # Salir del programa.
        print("Gracias por utilizar la agenda de contactos")
        break # Mostramos un mensaje de despedida y rompemos el ciclo.
    else: # Si el usuario elige una opción no válida, mostramos un mensaje de error.
        print("Se equivoco de opcion de menu")
    print()                    

    