#6.2 Ejercicio 11 Agenda Telefónica
#Hacer un programa que simule una agenda de contactos, crear un diccionario
#donde la clave sea el nombre y el valor el numero de telefono
#el programa tendra el siguiente menu de opciones:
#   1. Nuevo Contacto
#   2. Borrar Contacto
#   3. Ver Contactos existentes
#   4. Salir

agenda = {}
while True:
    print("MENU:")
    print("1. Nuevo Contacto\n2. Borrar Contacto\n3. Ver Contactos existentes\n4. Salir")
    opcion = int(input("Ingrese una de las opciones para continuar: "))
    if opcion == 1:
        print("1. Agregar Nuevo Contacto: ")
        nombre = input("Nombre: ")
        telefono = int(input("Telefono: "))
        agenda[nombre] = telefono
        print(f"{nombre} : {telefono} Agregado a la Agenda\n")
    elif opcion == 2:
        print("2. Borrar Contacto: ")
        nombre = input("Ingrese el Nombre que desea eliminar de sus Contactos: ")
        agenda.pop(nombre)
        print(f"{nombre} ha sido eliminado de sus Contactos\n")
    elif opcion == 3:
        print("Contactos: ")
        for nombre, telefono in agenda.items():
            print(f"Nombre: {nombre} \n\tTelefono: {telefono}\n")
    elif opcion == 4:
        break